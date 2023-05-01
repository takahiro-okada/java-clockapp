package com.example.demo.service;

import com.example.demo.entity.Clock;
import java.util.List;

public interface ClockService {

  List<Clock> findMakerClocks();

  List<Clock> findAllClocks();

  void registerClock(Clock clock);

}
