package com.example.demo.entity;

public class Maker {

  private int id;
  private String makerName;

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

  public Maker(int id, String makerName) {
    this.id = id;
    this.makerName = makerName;
  }
}
