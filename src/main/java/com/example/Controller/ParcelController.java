package com.example.Controller;

import com.example.Model.DAO.Interface.AddressRepository;
import com.example.Model.DAO.Interface.ClientRepository;
import com.example.Model.DAO.Interface.ParcelRepository;
import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.Address;
import com.example.Model.Domain.Client;
import com.example.Model.Domain.Parcel;
import com.example.Model.Domain.Person;
import com.example.Model.ViewModels.*;
import com.example.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Boberkowy on 17.01.2017.
 */
@Controller
public class ParcelController {

  @Autowired
  ParcelRepository parcelRepository;

  @Autowired
  ClientRepository clientRepository;

  @Autowired
  AddressRepository addressRepository;

  @Autowired
  NotificationService notificationService;

  private HttpSession httpSession;

  @RequestMapping(value = "Parcel/addParcel")
  public String addParcel(Model model) {
      try {
        String username = httpSession.getAttribute("login").toString();
        AddParcelViewModel addParcelViewModel = new AddParcelViewModel();
        model.addAttribute("addCourier", addParcelViewModel);
        return "Worker/addCourier";
      } catch (Exception e) {
        AddParcelViewModel addParcelViewModel= new AddParcelViewModel();
        model.addAttribute("login", addParcelViewModel);
        e.printStackTrace();
        return "redirect:/";
      }
    }

  @RequestMapping(value = "Parcel/addParcel", method = RequestMethod.POST)
  public String registerPage(@Valid AddParcelViewModel addParcelViewModel, BindingResult bindingResult){
//    if(bindingResult.hasErrors()){
//      System.out.println("działa POST, powinien wyrzucić błąd");
//      notifyService.addErrorMessage("Wypełnij formularz poprawnie");
//      return "User/register";
//    }
    String username = httpSession.getAttribute("login").toString();
    Client client = clientRepository.findByUsername(username);
    LocalDate localDate = LocalDate.now();
    Date date  = Date.valueOf(localDate);
    Address postingAddress = new Address(addParcelViewModel.getPostingRegion(), addParcelViewModel.getPostingCity(), addParcelViewModel.getPostingZipcode(), addParcelViewModel.getPostingStreet(), addParcelViewModel.getPostingNumber());
    Address receivingAddress = new Address(addParcelViewModel.getReceivingRegion(), addParcelViewModel.getReceivingCity(), addParcelViewModel.getPostingZipcode(), addParcelViewModel.getReceivingStreet(), addParcelViewModel.getReceivingNumber());

    addressRepository.save(postingAddress);
    addressRepository.save(receivingAddress);
    Parcel parcel = new Parcel(client,date,postingAddress,receivingAddress, "Paczka przyjęta do wysłania");

    parcelRepository.save(parcel);
    return "redirect:/User/profile";
  }

  @RequestMapping(value = "Parcel/findParcel")
  public String findParcel(Model model){
      String username = httpSession.getAttribute("login").toString();
      try{
        if(username != null){
      FindParcelViewModel findParcelViewModel = new FindParcelViewModel();
      model.addAttribute("findParcel", findParcelViewModel);
      return "Parcel/findParcel";}
    }catch(Exception e){
      LoginViewModel loginViewModel = new LoginViewModel();
      model.addAttribute("login", loginViewModel);
      e.printStackTrace();
      return "redirect:/";
    }return "redirect:/";
  }

  @RequestMapping(value = "Parcel/findParcel", method = RequestMethod.POST)
  public String findParcel(@Valid FindParcelViewModel findParcelViewModel, BindingResult bindingResult,Model model){
    model.addAttribute("findParcel", findParcelViewModel);
    Parcel parcell;
    parcell = parcelRepository.findOne(findParcelViewModel.getParcelNumber());
    notificationService.addInfoMessage("Status paczki:" + parcell.getStatus());

    return "Parcel/findParcel";
  }


}
