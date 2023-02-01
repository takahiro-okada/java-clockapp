package com.example.demo.controller;

import com.example.demo.entity.Clock;
import com.example.demo.service.ClockService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClockController {

  private final ClockService clockService;

  public ClockController(ClockService clockService){
    this.clockService = clockService;
  }

  @RequestMapping("/maker/{makername}")
  public List<Clock> getMakerClocks(){
    List<Clock> clocks = clockService.findMakerClocks();
    return  clocks;
  }
}
