package com.example.demo.service;

import com.example.demo.entity.Maker;
import com.example.demo.repository.MakerMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MakerServiceImpl implements MakerService{

  private MakerMapper makerMapper;

  public MakerServiceImpl(MakerMapper makerMapper) {
    this.makerMapper = makerMapper;
  }

  @Override
  public List<Maker> findAll() {
    return makerMapper.findAll();
  }
}
