package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Boberkowy on 08.12.2016.
 */
@Controller
public class HomeController {

  @RequestMapping("/")
     String index(){
      return "index";
    }


}
