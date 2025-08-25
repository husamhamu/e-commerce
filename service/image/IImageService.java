package com.husam.oneshop.service.image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.husam.oneshop.dto.ImageDto;
import com.husam.oneshop.model.Image;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    Image updateImage(MultipartFile file, Long id);
}
