//package com.example.Controller;
//
//import com.example.Model.DAO.Interface.ClientRepository;
//import com.example.Model.Domain.Client;
//import com.example.Model.ViewModels.LoginViewModell;
//import com.example.Model.ViewModels.RegisterViewModel;
//import com.example.services.NotificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//
///**
// * Created by Boberkowy on 08.12.2016.
// */
//@Controller
//public class LoginController {
//
//  @Autowired
//  private  NotificationService notifyService;
//
//  @Autowired
//  private ClientRepository clientRepository;
//
//
//  @RequestMapping(value = "/")
//  public String register(Model model){
//    LoginViewModell loginViewModel= new LoginViewModell();
//    model.addAttribute("register", loginViewModel);
//    return "/";
//  }
//
//  @RequestMapping(value = "User/register", method = RequestMethod.POST)
//  public String registerPage(@Valid RegisterViewModel registerViewModel, BindingResult bindingResult){
////    if(bindingResult.hasErrors()){
////      System.out.println("działa POST, powinien wyrzucić błąd");
////      notifyService.addErrorMessage("Wypełnij formularz poprawnie");
////      return "User/register";
////    }
//
//    Client client = new Client(registerViewModel.getUsername(),registerViewModel.getPassword(),registerViewModel.getEmail());
//    clientRepository.save(client);
//    return "redirect:/";
//  }
//
//
//
//}
