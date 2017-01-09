package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Boberkowy on 08.12.2016.
 */
@Controller

public class HomeController {

  @RequestMapping(value = "/" , method = RequestMethod.GET)

     String index(){
      return "index";
    }


}
