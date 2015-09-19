package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.web.model.Parent;
import org.madrona.web.repo.GradeRepository;
import org.madrona.web.repo.ParentRepository;
import org.madrona.web.repo.StaffRepository;
import org.madrona.web.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ParentController {

    private static final Logger LOGGER = LogManager.getLogger(ParentController.class);

    @Autowired
    StaffRepository staffRepository;
    @Autowired
    private ParentRepository parentRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/add-parent", method = RequestMethod.GET)
    public String showAddStaffPage(ModelMap modelMap) {
        modelMap.addAttribute("parent", new Parent());
        return "parent/add";
    }

    @RequestMapping(value = "/add-parent-action", method = RequestMethod.POST)
    public String onInsertParentAction(@ModelAttribute Parent parent, RedirectAttributes redirectAttributes) {
        Parent savedParent = parentRepository.save(parent);
        if (savedParent != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-student";

    }

    @RequestMapping(value = "/view-parent", method = RequestMethod.GET)
    public String onViewParent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Parent parent = parentRepository.findOne(request.getParameter("id"));
        modelMap.addAttribute("parent", parent);
        return "parent/view";
    }

    @RequestMapping(value = "/update-parent", method = RequestMethod.POST)
    public String onUpdateParentAction(@ModelAttribute Parent parent,
                                      RedirectAttributes redirectAttributes) {
        Parent updatedParent = parentRepository.save(parent);
        if (updatedParent != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-parent";

    }

    @RequestMapping(value = "/view-all-parent", method = RequestMethod.GET)
    public String onViewAllParents(HttpServletRequest request, ModelMap modelMap) {
        List<Parent> parents = (List<Parent>) parentRepository.findAll();
        modelMap.addAttribute("parents", parents);
        return "parent/view-all";
    }


    @RequestMapping(value = "/delete-parent", method = RequestMethod.POST)
    public String onDeleteParentAction(@RequestParam("id") String id, ModelMap modelMap) {
        LOGGER.info("Deleting parent details from the system.");
        try {
            parentRepository.delete(id);
            modelMap.addAttribute("delete-success", true);
            return "redirect:/view-all-parent";
        } catch (Exception e) {
            modelMap.addAttribute("delete-failure", true);
            return "redirect:/view-all-parent";
        }
    }
}
