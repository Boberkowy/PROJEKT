package com.example.Controller;

import com.example.Model.DAO.Interface.ParcelRepository;
import com.example.Model.Domain.Parcel;
import com.example.Model.ViewModels.AddCourierViewModel;
import com.example.Model.ViewModels.AddWorkerViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Boberkowy on 17.01.2017.
 */
@Controller
public class WorkerController {

  @Autowired
  ParcelRepository parcelRepository;


  @RequestMapping(value = "Worker/addCourier")
  public String addCourier(Model model) {
    AddCourierViewModel addCourierViewModel = new AddCourierViewModel();
    model.addAttribute("addCourier", addCourierViewModel);
    return "Worker/addCourier";
  }

  @RequestMapping(value = "Worker/addCourier", method = RequestMethod.POST)
  public String addCourier(@Valid AddCourierViewModel addCourierViewModel, BindingResult bindingResult, Model model){

    model.addAttribute("addCourier", addCourierViewModel);
    Parcel parcel = new Parcel();

    return "Worker/addCourier";
  }


  @RequestMapping(value = "Worker/addWorker")
  public String addWorker(Model model){
    AddWorkerViewModel addWorkerViewModel = new AddWorkerViewModel();
    model.addAttribute("addWorker", addWorkerViewModel);
    return "Worker/addWorker";
  }

  @RequestMapping(value = "Worker/addWorker", method = RequestMethod.POST)
  public String addWorker(@Valid AddWorkerViewModel addWorkerViewModel, BindingResult bindingResult, Model model){
    model.addAttribute("addWorker", addWorkerViewModel);

    return "Worker/addWorker";
  }
}

