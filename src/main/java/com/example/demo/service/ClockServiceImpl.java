package com.example.demo.service;

import com.example.demo.entity.Clock;
import com.example.demo.repository.ClockMapper;
import java.util.List;

public class ClockServiceImpl implements ClockService{
  private ClockMapper clockMapper;

  public ClockServiceImpl(ClockMapper clockMapper) {
    this.clockMapper = clockMapper;
  }

  @Override
  public List<Clock> findMakerClocks() {
    return clockMapper.findMakerClocks();
  }
}
