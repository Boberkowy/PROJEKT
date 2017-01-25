package com.example.Controller;

import com.example.Model.DAO.Interface.AddressRepository;
import com.example.Model.DAO.Interface.CourierRepository;
import com.example.Model.DAO.Interface.ParcelRepository;
import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.*;
import com.example.Model.ViewModels.AddCourierViewModel;
import com.example.Model.ViewModels.AddWorkerViewModel;
import com.example.Model.ViewModels.LoginViewModel;
import com.example.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Boberkowy on 17.01.2017.
 */
@Controller
public class WorkerController {

  @Autowired
  ParcelRepository parcelRepository;

  @Autowired
  CourierRepository courierRepository;

  @Autowired
  AddressRepository addressRepository;

  @Autowired
  private NotificationService notifyService;

  @Autowired
  HttpSession httpSession;

  @RequestMapping(value = "Worker/addCourier")
  public String addCourier(Model model) {
    try {
      String username = httpSession.getAttribute("login").toString();
      AddCourierViewModel addCourierViewModel = new AddCourierViewModel();
      model.addAttribute("addCourier", addCourierViewModel);
      return "Worker/addCourier";
    } catch (Exception e) {
      LoginViewModel loginViewModel = new LoginViewModel();
      model.addAttribute("login", loginViewModel);
      e.printStackTrace();
      return "redirect:/";
    }
  }

  @RequestMapping(value = "Worker/addCourier", method = RequestMethod.POST)
  public String addCourier(@Valid AddCourierViewModel addCourierViewModel, BindingResult bindingResult, Model model){
    model.addAttribute("addCourier", addCourierViewModel);
    parcelRepository.setCourierForParcel(addCourierViewModel.getCourierId(),"Paczka przekazana Kurierowi do doręczenia", addCourierViewModel.getParcelId());
    notifyService.addInfoMessage("Kurier został dodany do paczki");
    return "Worker/addCourier";
  }


  @RequestMapping(value = "Worker/addWorker")
  public String addWorker(Model model) {
    try {
        String username = httpSession.getAttribute("login").toString();
      System.out.println("sesja w  worker/addworker : " + username);
      AddWorkerViewModel addWorkerViewModel = new AddWorkerViewModel();
      model.addAttribute("addWorker", addWorkerViewModel);
      return "Worker/addWorker";
    } catch(Exception e) {
      LoginViewModel loginViewModel = new LoginViewModel();
      model.addAttribute("login", loginViewModel);
      e.printStackTrace();
      return "redirect:/";
    }
  }
  @RequestMapping(value = "Worker/addWorker", method = RequestMethod.POST)
  public String addWorker(@Valid AddWorkerViewModel addWorkerViewModel, BindingResult bindingResult, Model model){
    model.addAttribute("addWorker", addWorkerViewModel);

    Address address = new Address(addWorkerViewModel.getRegion(),addWorkerViewModel.getCity(),addWorkerViewModel.getZipcode(),addWorkerViewModel.getStreet(),addWorkerViewModel.getNumber());
    addressRepository.save(address);
    courierRepository.save(new Courier(addWorkerViewModel.getFirstName(),addWorkerViewModel.getLastName(),addWorkerViewModel.getEmail(), addWorkerViewModel.getPhoneNumber(),addWorkerViewModel.getPesel(), addWorkerViewModel.getUsername(), addWorkerViewModel.getPassword(),address));
    notifyService.addInfoMessage("Kurier został dodany do systemu.");

    return "Worker/addWorker";
  }

  @RequestMapping(value= "Worker/parcelList")
  public String parcelList(Model model){
    try {
      String username = httpSession.getAttribute("login").toString();
      Courier courier = courierRepository.findByUsername(username);
      List<Parcel> parcels = parcelRepository.findByCourierId(courier.getId());
      return "Worker/addWorker";
    } catch(Exception e) {
      LoginViewModel loginViewModel = new LoginViewModel();
      model.addAttribute("login", loginViewModel);
      e.printStackTrace();
      return "redirect:/";
    }
  }
}

