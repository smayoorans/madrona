package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.web.model.Grade;
import org.madrona.web.model.Staff;
import org.madrona.web.repo.GradeRepository;
import org.madrona.web.repo.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SubjectController {

    private static final Logger LOGGER = LogManager.getLogger(SubjectController.class);
    @Autowired
    StaffRepository staffRepository;
    @Autowired
    private GradeRepository gradeRepository;
    //    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/add-subject", method = RequestMethod.GET)
    public String showAddStaffPage(ModelMap modelMap) {
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("staff", new Staff());
        return "staff/add";
    }

    @RequestMapping(value = "/insert-subject", method = RequestMethod.POST)
    public String onInsertStaffAction(@ModelAttribute Staff staff,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

        Grade grade = gradeRepository.findOne(gradeId);
        System.out.println("Getting grade" + grade);
//        staff.setCurrentGrade(grade);
        /*
        String profileImageId = uploadService.upload(profilePicture);
        if (profileImageId != null) {
            staff.setProfilePicture(profileImageId);
        }*/

        Staff savedStaff = staffRepository.save(staff);
        if (savedStaff != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-staff";

    }

    @RequestMapping(value = "/view-subject", method = RequestMethod.GET)
    public String onViewStaff(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Staff staff = staffRepository.findOne(request.getParameter("id"));
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("staff", staff);
        return "staff/view";
    }

    @RequestMapping(value = "/update-subject", method = RequestMethod.POST)
    public String onUpdateStaffAction(@ModelAttribute Staff staff,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

//        Grade grade = gradeRepository.findOne(gradeId);
//        staff.setCurrentGrade(grade);

//        String profileImageId = uploadService.upload(profilePicture);
//        if (profileImageId != null) {
//            staff.setProfilePicture(profileImageId);
//        }

        Staff updatedStaff = staffRepository.save(staff);

        if (updatedStaff != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-staff";

    }

    @RequestMapping(value = "/view-all-subject", method = RequestMethod.GET)
    public String onViewAllStaffs(HttpServletRequest request, ModelMap modelMap) {
        List<Staff> staffs = (List<Staff>) staffRepository.findAll();
        modelMap.addAttribute("staffs", staffs);
        return "staff/view-all";
    }


    @RequestMapping(value = "/delete-subject", method = RequestMethod.POST)
    public String onDeleteStaffAction(@RequestParam("id") String id, ModelMap modelMap) {
        LOGGER.info("Deleting staff details from the system.");
        try {
            staffRepository.delete(id);
            modelMap.addAttribute("delete-success", true);
            return "redirect:/view-all-staff";
        } catch (Exception e) {
            modelMap.addAttribute("delete-failure", true);
            return "redirect:/view-all-staff";
        }
    }
}
