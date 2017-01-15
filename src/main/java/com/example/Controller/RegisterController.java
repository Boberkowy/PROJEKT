package com.example.Controller;

  import com.example.Model.DAO.Interface.ClientRepository;
  import com.example.Model.Domain.Client;
  import com.example.Model.ViewModels.RegisterViewModel;
  import com.example.services.NotificationService;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Controller;
  import org.springframework.validation.BindingResult;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;

  import javax.validation.Valid;

/**
 * Created by Boberkowy on 08.12.2016.
 */
@Controller
public class RegisterController {


  @RequestMapping(value = "/register" , method = RequestMethod.GET)
  String reg(){
    return "register";
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  String register(@Valid RegisterViewModel registerViewModel, BindingResult bindingResult, @Valid ClientRepository clientRepository){
    if(bindingResult.hasErrors()){

      return "user/register";
    }
    Client client = new Client(registerViewModel.getFirstName(), registerViewModel.getLastName(), registerViewModel.getEmail(), registerViewModel.getPhoneNumber());
    clientRepository.save(client);

    return "redirect:/";
  }
}
