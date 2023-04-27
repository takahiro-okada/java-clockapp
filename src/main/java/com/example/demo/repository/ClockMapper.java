package com.example.demo.repository;

import com.example.demo.entity.Clock;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClockMapper {

    @Select("SELECT * FROM clocks WHERE maker_id = #{makerId}")
    List<Clock> findMakerClocks();

    @Insert("INSERT INTO clocks (maker_id, user_id, clock_name, description, clock_image, " +
        "latitude, longitude) VALUES (#{makerId}, #{userId}, #{name}, #{description}, #{imagePath}, #{latitude}, #{longitude})")
    void registerClock(Clock clock);
  
}
