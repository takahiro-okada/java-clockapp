package com.example.demo.controller;

import com.example.demo.entity.Maker;
import com.example.demo.entity.Prefecture;
import com.example.demo.service.MakerService;
import com.example.demo.service.PrefectureService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class PrefectureController {

  private final PrefectureService prefectureService;

  public PrefectureController(PrefectureService prefectureService) {
    this.prefectureService = prefectureService;
  }

  @GetMapping("/prefectures")
  public List<Prefecture> getAllPrefecture() {
    return prefectureService.findAll();
  }
}
