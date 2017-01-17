package com.example.Controller;

import com.example.Model.ViewModels.LoginViewModel;
import com.example.Model.DAO.PersonRepositoryImpl;
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
      LoginViewModel loginViewModel= new LoginViewModel();
       model.addAttribute("login", loginViewModel);
      return "index";
    }

    @RequestMapping(value ="/", method = RequestMethod.GET)
      public String loginPage(@Valid LoginViewModel loginViewModel, BindingResult bindingResult){
      checkLogin(loginViewModel.getUsername(), loginViewModel.getPassword());

    }

  }


}
