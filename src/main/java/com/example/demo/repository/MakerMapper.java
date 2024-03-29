package com.example.demo.repository;

import com.example.demo.entity.Maker;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MakerMapper {

  @Select("SELECT * FROM makers")
  List<Maker> findAll();

  @Insert("INSERT INTO makers (maker_name, maker_image) VALUES (#{name}, #{imageName})")
  Maker saveMaker(String name, String imageName);

}
