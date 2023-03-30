package com.example.demo.controller;

import com.example.demo.entity.Maker;
import com.example.demo.service.MakerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class MakerController {

  private final MakerService makerService;

  public MakerController(MakerService makerService) {
    this.makerService = makerService;
  }

  @GetMapping("/makers")
  public List<Maker> getAllMakers() {
    return makerService.findAll();
  }

  @PostMapping("/api/makers")
  public Maker createMaker(MultipartHttpServletRequest request) {
    String name = request.getParameter("name");
    MultipartFile image = request.getFile("image");
    String imageName = makerService.saveImage(image);
    return makerService.saveMaker(name, imageName);
  }

}
