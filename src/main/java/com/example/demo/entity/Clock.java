package com.example.demo.entity;

import org.springframework.web.multipart.MultipartFile;

public class Clock {

  private Integer id;
  private Integer makerId;
  private Integer userId;
  private String name;
  private String description;
  private MultipartFile imagePath;
  private double latitude;
  private double longitude;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMakerId() {
    return makerId;
  }

  public void setMakerId(Integer makerId) {
    this.makerId = makerId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MultipartFile getImagePath() {
    return imagePath;
  }

  public void setImagePath(MultipartFile imagePath) {
    this.imagePath = imagePath;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public Clock(Integer id, Integer makerId, Integer userId, String name, String description,
               MultipartFile imagePath, double latitude, double longitude) {
    this.id = id;
    this.makerId = makerId;
    this.userId = userId;
    this.name = name;
    this.description = description;
    this.imagePath = imagePath;
    this.latitude = latitude;
    this.longitude = longitude;
  }
}
