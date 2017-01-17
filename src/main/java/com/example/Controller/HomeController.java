package com.example.Controller;

<<<<<<< HEAD
import com.example.Model.ViewModels.LoginViewModell;
=======
import com.example.Model.DAO.Interface.PersonRepository;
import com.example.Model.ViewModels.LoginViewModel;
import com.example.Model.ViewModels.RegisterViewModel;
import com.example.services.NotificationService;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 8d58773a4ab842c2aa0b1b4d28da49a44f52b7df
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Boberkowy on 08.12.2016.
 */
@Controller

public class HomeController {

  @Autowired
  private NotificationService notifyService;

  @Autowired
  private UserService userService;

  @Autowired
  private PersonRepository personRepository;

  @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String index(Model model){
      LoginViewModell loginViewModel= new LoginViewModell();
       model.addAttribute("login", loginViewModel);
      return "index";
    }

<<<<<<< HEAD
    @RequestMapping(value ="/", method = RequestMethod.GET)
      public String loginPage(@Valid LoginViewModell loginViewModel, BindingResult bindingResult){
      checkLogin(loginViewModel.getUsername(), loginViewModel.getPassword());

    }

  }
=======
    @RequestMapping(value ="/", method = RequestMethod.POST)
      public String loginPage(@Valid LoginViewModel loginViewModel, BindingResult bindingResult){
        if(userService.checkLogin(loginViewModel.getUsername(), loginViewModel.getPassword(), personRepository)){
          return "index";
        }
        return "redirect:/";
    }
>>>>>>> 8d58773a4ab842c2aa0b1b4d28da49a44f52b7df


}
