package com.example.demo.entity;

public class Maker {

  private int id;
  private String name;
  private String imagePath;

  public Maker(int id, String name, String imagePath) {
    this.id = id;
    this.name = name;
    this.imagePath = imagePath;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

}
