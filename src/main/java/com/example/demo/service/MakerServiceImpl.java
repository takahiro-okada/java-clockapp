package com.example.demo.service;

import com.example.demo.entity.Maker;
import com.example.demo.repository.MakerMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MakerServiceImpl implements MakerService{

  private MakerMapper makerMapper;

  public MakerServiceImpl(MakerMapper makerMapper) {
    this.makerMapper = makerMapper;
  }

  @Override
  public List<Maker> findAll() {
    return makerMapper.findAll();
  }

  @Override
  public String saveImage(MultipartFile image) {
    // 画像ファイルの保存先ディレクトリ
    String uploadDirectory = "./uploads/";
    Path uploadPath = Paths.get(uploadDirectory);

    // 画像ファイルの名前を取得し、ファイル名を生成
    String imageName = image.getOriginalFilename();
    Path targetLocation = uploadPath.resolve(imageName);

    try {
      // 画像ファイルを保存先にコピー
      Files.copy(image.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      throw new RuntimeException("画像の保存に失敗しました。", e);
    }

    return imageName; // 画像ファイル名を返す
  }

  @Override
  public Maker saveMaker(String name, String imageName) {
    return makerMapper.saveMaker(name, imageName);
  }

}
