package com.example.Controller;

import com.example.Model.DAO.Interface.AddressRepository;
import com.example.Model.DAO.Interface.ParcelRepository;
import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.Address;
import com.example.Model.Domain.Client;
import com.example.Model.Domain.Parcel;
import com.example.Model.Domain.Person;
import com.example.Model.ViewModels.AddCourierViewModel;
import com.example.Model.ViewModels.AddParcelViewModel;
import com.example.Model.ViewModels.FindParcelViewModel;
import com.example.Model.ViewModels.RegisterViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
  PersonRepository personRepository;

  @Autowired
  AddressRepository addressRepository;

  @RequestMapping(value = "Parcel/addParcel")
  public String addParcel(Model model){
    AddParcelViewModel addParcelViewModel = new AddParcelViewModel();
    model.addAttribute("addParcel", addParcelViewModel);
    return "Parcel/addParcel";
  }

  @RequestMapping(value = "Parcel/addParcel", method = RequestMethod.POST)
  public String registerPage(@Valid AddParcelViewModel addParcelViewModel, BindingResult bindingResult){
//    if(bindingResult.hasErrors()){
//      System.out.println("działa POST, powinien wyrzucić błąd");
//      notifyService.addErrorMessage("Wypełnij formularz poprawnie");
//      return "User/register";
//    }
    LocalDate localDate = LocalDate.now();
    Date date  = Date.valueOf(localDate);
    Address postingAddress = new Address(addParcelViewModel.getPostingRegion(), addParcelViewModel.getPostingCity(), addParcelViewModel.getPostingZipcode(), addParcelViewModel.getPostingStreet(), addParcelViewModel.getPostingNumber());
    Address receivingAddress = new Address(addParcelViewModel.getReceivingRegion(), addParcelViewModel.getReceivingCity(), addParcelViewModel.getPostingZipcode(), addParcelViewModel.getReceivingStreet(), addParcelViewModel.getReceivingNumber());

    addressRepository.save(postingAddress);
    addressRepository.save(receivingAddress);
    Parcel parcel = new Parcel(date,postingAddress,receivingAddress, "Parcel Register to send");

    parcelRepository.save(parcel);
    return "redirect:/User/profile";
  }

  @RequestMapping(value = "Parcel/findParcel")
  public String findParcel(Model model){
    FindParcelViewModel findParcelViewModel = new FindParcelViewModel();
    model.addAttribute("findParcel", findParcelViewModel);
    return "Parcel/findParcel";
  }


}
