package com.example.demo.entity;

public class Prefecture {
    private int prefectureId;
    private String prefectureName;

    public int getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(int prefectureId) {
        this.prefectureId = prefectureId;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }

    public Prefecture(int prefectureId, String prefectureName) {
        this.prefectureId = prefectureId;
        this.prefectureName = prefectureName;
    }
}
