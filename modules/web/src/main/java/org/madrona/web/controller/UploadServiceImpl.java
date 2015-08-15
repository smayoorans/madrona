package org.madrona.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class UploadServiceImpl implements UploadService {

    private static final Logger LOGGER = LogManager.getLogger(UploadServiceImpl.class);

    private String rootFilePath = "/";

    @Override
    public String upload(MultipartFile multipartFile) {

        if (!multipartFile.isEmpty()) {

            //TODO: need to get a proper way for the file name
            String name = String.valueOf(System.currentTimeMillis()) + ".jpg";
            try {
                byte[] bytes = multipartFile.getBytes();

                // Creating the directory to store profilePicture
                File dir = new File(rootFilePath + File.separator + "profiles");
                if (!dir.exists()) dir.mkdirs();

                // Create the profilePicture on server
                File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                LOGGER.debug("Server file location = " + serverFile.getAbsolutePath());

                LOGGER.info("You successfully uploaded profilePicture=" + name);

                return name;

            } catch (Exception e) {
                LOGGER.error("You failed to upload " + name + " => " + e.getMessage());
                return null;
            }
        } else {
            LOGGER.error("You failed to upload, because the profile picture was empty!.");
            return null;
        }
    }

    public String getRootFilePath() {
        return rootFilePath;
    }

    public void setRootFilePath(String rootFilePath) {
        this.rootFilePath = rootFilePath;
    }
}
