package com.example.demo.controller;

import com.example.demo.entity.Clock;
import com.example.demo.service.ClockService;
import com.example.demo.service.FileStorageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
public class ClockController {

  private final ClockService clockService;

  public ClockController(ClockService clockService){
    this.clockService = clockService;
  }

  @Autowired
  private FileStorageService fileStorageService;

  @Value("${app.upload-dir}")
  private String imageBasePath;

  @RequestMapping("/maker/clocks")
  public List<Clock> getAll() {
    List<Clock> clock = clockService.findMakerClocks();
    return clock;
  }

  @PostMapping("/api/register")
  public ResponseEntity<String> registerClock(@RequestParam("file") MultipartFile file, Clock clock) {
    try {
      MultipartFile fileName = fileStorageService.storeFile(String.valueOf(file));
      clock.setImagePath(fileName);

      clockService.registerClock(clock);
      return ResponseEntity.ok("Clock registered successfully: " + clock.getName());
    } catch (Exception e) {
      return ResponseEntity.badRequest().body("Failed to register clock: " + e.getMessage());
    }
  }

}
