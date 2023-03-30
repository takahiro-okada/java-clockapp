package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageService {

  @Value("${app.upload-dir}")
  private String uploadDir;

  public String storeFile(MultipartFile file) throws IOException {
    Path uploadPath = Paths.get(uploadDir);
    if (!Files.exists(uploadPath)) {
      Files.createDirectories(uploadPath);
    }
    String fileName = file.getOriginalFilename();
    Path filePath = uploadPath.resolve(fileName);
    Files.copy(file.getInputStream(), filePath);
    return fileName;
  }
}
