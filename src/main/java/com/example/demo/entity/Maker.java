package com.example.demo.entity;

public class Maker {

  private int id;
  private String makerName;
  private String makerImagePath;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMakerName() {
    return makerName;
  }

  public void setMakerName(String makerName) {
    this.makerName = makerName;
  }

  public String getMakerImagePath() {
    return makerImagePath;
  }

  public void setMakerImagePath(String makerImagePath) {
    this.makerImagePath = makerImagePath;
  }

  public Maker(int id, String makerName, String makerImagePath) {
    this.id = id;
    this.makerName = makerName;
    this.makerImagePath = makerImagePath;
  }
}
