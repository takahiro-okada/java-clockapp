package com.example.demo.service;

import com.example.demo.entity.Maker;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface MakerService {

  List<Maker> findAll();

  String saveImage(MultipartFile image);

  Maker saveMaker(String name, String imageName);
}
