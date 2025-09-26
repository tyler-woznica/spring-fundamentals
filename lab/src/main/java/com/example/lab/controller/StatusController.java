package com.example.lab.controller;
import com.example.lab.service.StatusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;
import org.springframework.ui.Model;

import static com.example.lab.service.SuccessService.getCurrentDT;

@Controller
public class StatusController {

    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello () {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return statusService.processStatus(false);
    }

    @GetMapping("/success")
    public String successDate (Model model){
        LocalDateTime currentDT = getCurrentDT();
        model.addAttribute("currentDT", currentDT);
        return "springfundamentals/success";
    }
}