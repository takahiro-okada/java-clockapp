package com.example.demo.repository;

import com.example.demo.entity.Maker;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.multipart.MultipartFile;

@Mapper
public interface MakerMapper {

  // Maker一覧を取得する
  @Select("SELECT * FROM maker")
  List<Maker> findAll();

  // makerを登録する
  @Insert("INSERT INTO maker (maker_name, maker_image) VALUES (#{name}, #{imageName})")
  Maker saveMaker(String name, String imageName);
}
