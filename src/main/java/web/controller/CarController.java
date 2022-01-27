package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model){

        CarService carService = new CarServiceImp();

        model.addAttribute("carsList", carService.carView(count));

        return "cars";
    }


}
