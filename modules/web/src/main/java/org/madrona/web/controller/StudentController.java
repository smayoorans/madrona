package org.madrona.web.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.common.Student;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Controller
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap modelMap) {
        modelMap.addAttribute("student", new Student());
        return "student/add";
    }

    @RequestMapping(value = "/insert-student", method = RequestMethod.POST)
    @ResponseBody
    public String onInsertStudentAction(@ModelAttribute Student student, @RequestParam("file") MultipartFile file){

        String name = "filename.jsp";

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                // Creating the directory to store file
                String rootPath = "/home/mayooran/Desktop";
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();

                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                LOGGER.info("Server File Location=" + serverFile.getAbsolutePath());

                LOGGER.info("You successfully uploaded file=" + name);
                boolean isSaved = studentService.save(student);
                return "dash-board";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name
                    + " because the file was empty.";
        }


    }

    @RequestMapping(value = "/view-student", method = RequestMethod.GET)
    public String onViewStudent(HttpServletRequest request, ModelMap modelMap){
        Student student = studentService.get(Long.parseLong(request.getParameter("id")));
        modelMap.addAttribute("student", student);
        return "student/view";
    }


    @RequestMapping(value = "/view-all-student", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap){
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "student/view-all";
    }


    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String onLoadUploadPage(HttpServletRequest request, ModelMap modelMap){
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "upload";
    }

    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/upload-file", method = RequestMethod.POST)
    public @ResponseBody
    String uploadFileHandler(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {

        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();

                // Creating the directory to store file
                String rootPath = "/home/mayooran/Desktop";
                File dir = new File(rootPath + File.separator + "tmpFiles");
                if (!dir.exists())
                    dir.mkdirs();

                // Create the file on server
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                LOGGER.info("Server File Location=" + serverFile.getAbsolutePath());

                return "You successfully uploaded file=" + name;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name
                    + " because the file was empty.";
        }
    }
}
