package com.example.Controller;

import com.example.Model.ViewModels.LoginViewModell;
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

  @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String index(Model model){
      LoginViewModell loginViewModel= new LoginViewModell();
       model.addAttribute("login", loginViewModel);
      return "index";
    }

    @RequestMapping(value ="/", method = RequestMethod.GET)
      public String loginPage(@Valid LoginViewModell loginViewModel, BindingResult bindingResult){
      checkLogin(loginViewModel.getUsername(), loginViewModel.getPassword());

    }

  }


}
