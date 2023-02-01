package com.example.demo.repository;

import com.example.demo.entity.Clock;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClockMapper {

  // Makerの時計を取得する
  @Select("SELECT * FROM clock")
  List<Clock> findMakerClocks();
}
