package com.example.demo.controller;

import com.example.demo.entity.Maker;
import com.example.demo.service.MakerService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MakerController {

  private final MakerService makerService;

  public MakerController(MakerService makerService){
    this.makerService = makerService;
  }

  @RequestMapping("/maker")
  public List<Maker> getAll() {
    List<Maker> maker = makerService.findAll();
    return maker;
  }

}
