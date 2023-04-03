package com.example.demo.repository;

import com.example.demo.entity.Prefecture;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PrefectureMapper {

  @Select("SELECT * FROM prefectures")
  List<Prefecture> findAll();

}
