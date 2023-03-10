package com.example.demo.repository;

import com.example.demo.entity.Clock;
import com.example.demo.entity.Maker;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MakerMapper {

  // Maker一覧を取得する
  @Select("SELECT * FROM maker")
  List<Maker> findAll();

}
