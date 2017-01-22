package com.example.Controller;

import com.example.Model.DAO.Interface.AddressRepository;
import com.example.Model.DAO.Interface.ClientRepository;
import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.Domain.Address;
import com.example.Model.Domain.Client;
import com.example.Model.ViewModels.AddressessViewModel;
import com.example.Model.ViewModels.LoginViewModel;
import com.example.Model.ViewModels.RegisterViewModel;
import com.example.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Boberkowy on 17.01.2017.
 */
@Controller

public class ProfileController {

  @Autowired
  AddressRepository addressRepository;

  @Autowired
  PersonRepository personRepository;

  @Autowired
  ClientRepository clientRepository;

  @Autowired
  NotificationService notifyService;

  @Autowired
  HttpSession httpSession;

  @RequestMapping(value = "User/profile")
  public String profile(Model model, ModelMap modelMap){

  try{
    String username = httpSession.getAttribute("login").toString();
    Client client = clientRepository.findByUsername(username);

    List<Address> adresy = client.getAddresses();

    modelMap.addAttribute("list", adresy);
    return "User/profile";
  }
    catch (Exception e){

    LoginViewModel loginViewModel = new LoginViewModel();
    model.addAttribute("login", loginViewModel);
    e.printStackTrace();
    return "redirect:/";
    }
  }


  @RequestMapping(value = "User/logout" )
  public String logout(LoginViewModel loginViewModel, Model model){
    httpSession.setAttribute("login", null);
    model.addAttribute("login", loginViewModel);
    notifyService.addErrorMessage(null);
    return "redirect:/";
  }

}
