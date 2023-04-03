package com.example.demo.service;

import com.example.demo.entity.Prefecture;
import com.example.demo.repository.PrefectureMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PrefectureServiceImpl implements PrefectureService{

  private PrefectureMapper prefectureMapper;

  public PrefectureServiceImpl(PrefectureMapper prefectureMapper) {
      this.prefectureMapper = prefectureMapper;
  }

  @Override
  public List<Prefecture> findAll() {
    return prefectureMapper.findAll();
  }
}
