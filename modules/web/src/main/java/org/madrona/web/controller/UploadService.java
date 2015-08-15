package org.madrona.web.controller;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

    String upload(MultipartFile multipartFile);

}
