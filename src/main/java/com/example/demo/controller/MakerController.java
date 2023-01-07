package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MakerController {

  @RequestMapping("/maker")
  public String test() {
    return "Hello World";
  }

}
