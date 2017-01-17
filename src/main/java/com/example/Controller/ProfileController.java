package com.example.Controller;

import com.example.Model.ViewModels.RegisterViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Boberkowy on 17.01.2017.
 */
@Controller

public class ProfileController {
  @RequestMapping(value = "User/profile")
  public String profile(){
    return "User/profile";
  }
}
