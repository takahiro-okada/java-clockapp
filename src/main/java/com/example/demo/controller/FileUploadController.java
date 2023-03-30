package com.example.demo.controller;

import com.example.demo.service.FileStorageService;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

  @Autowired
  private FileStorageService fileStorageService;

  @Value("${app.upload-dir}")
  private String imageBasePath;

  @PostMapping("/upload")
  public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
    try {
      String fileName = fileStorageService.storeFile(file);
      return ResponseEntity.ok("File uploaded successfully: " + fileName);
    } catch (IOException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
          .body("Failed to upload file: " + e.getMessage());
    }
  }

  @GetMapping("/uploads/{filename:.+}")
  public ResponseEntity<Resource> getFile(@PathVariable String filename) {
    try {
      Resource file = new UrlResource(Paths.get(imageBasePath + "/" + filename).toUri());

      return ResponseEntity.ok()
          .header(
              HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
          .body(file);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }

}
