package com.example.demo.repository;

import com.example.demo.entity.Maker;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MakerMapper {

  @Select("SELECT * FROM maker")
  List<Maker> findAll();

}
