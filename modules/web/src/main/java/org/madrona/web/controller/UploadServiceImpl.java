package org.madrona.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class UploadServiceImpl implements UploadService {

    private static final Logger LOGGER = LogManager.getLogger(UploadServiceImpl.class);

    private String rootFilePath = "/";

    /**
     * Size of a byte buffer to read/write file
     */
    private static final int BUFFER_SIZE = 4096;

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

                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                LOGGER.debug("Server file location = " + serverFile.getAbsolutePath());
                LOGGER.info("You successfully uploaded profile picture [{}]", name);
                return name;

            } catch (Exception e) {
                LOGGER.error("You failed to upload [{}] due to [{}]", name, e.getMessage());
                return null;
            }
        } else {
            LOGGER.error("You failed to upload, because the profile picture was empty!.");
            return null;
        }
    }

    public void setRootFilePath(String rootFilePath) {
        this.rootFilePath = rootFilePath;
    }
}
