package com.example.Controller;

  import org.springframework.stereotype.Controller;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Boberkowy on 08.12.2016.
 */
@Controller
public class RegisterController {

  @RequestMapping(value = "/register" , method = RequestMethod.GET)
  String reg(){
    return "register";
  }
}
