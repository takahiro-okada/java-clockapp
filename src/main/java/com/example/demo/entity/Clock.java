package com.example.demo.entity;

public class Clock {

  private int id;
  private String clockName;
  private String clockDescription;
  private int makerId;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getClockName() {
    return clockName;
  }

  public void setClockName(String clockName) {
    this.clockName = clockName;
  }

  public String getClockDescription() {
    return clockDescription;
  }

  public void setClockDescription(String clockDescription) {
    this.clockDescription = clockDescription;
  }

  public int getMakerId() {
    return makerId;
  }

  public void setMakerId(int makerId) {
    this.makerId = makerId;
  }

  public Clock(int id, String clockName, String clockDescription, int makerId) {
    this.id = id;
    this.clockName = clockName;
    this.clockDescription = clockDescription;
    this.makerId = makerId;
  }
}
