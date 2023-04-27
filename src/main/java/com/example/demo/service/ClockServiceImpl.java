package com.example.demo.service;

import com.example.demo.entity.Clock;
import com.example.demo.repository.ClockMapper;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ClockServiceImpl implements ClockService{

  private ClockMapper clockMapper;
  private FileStorageService fileStorageService;

  @Autowired
  public ClockServiceImpl(ClockMapper clockMapper, FileStorageService fileStorageService) {
    this.clockMapper = clockMapper;
    this.fileStorageService = fileStorageService;
  }


  @Override
  public List<Clock> findMakerClocks() {
    return clockMapper.findMakerClocks();
  }

  @Override
  public void registerClock(Clock clock) {
    clockMapper.registerClock(clock);


  }

}
