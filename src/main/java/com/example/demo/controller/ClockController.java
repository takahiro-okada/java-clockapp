package com.example.demo.controller;

import com.example.demo.entity.Clock;
import com.example.demo.service.ClockService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ClockController {

  private final ClockService clockService;

  public ClockController(ClockService clockService){
    this.clockService = clockService;
  }

   @RequestMapping("/maker/clocks")
   public List<Clock> getAll() {
     List<Clock> clock = clockService.findMakerClocks();
     return clock;
   }

}
