package com.amiriskhakov.mimimimetr;

import jdk.jfr.ContentType;
import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
@CrossOrigin
public class MainController {

    public static List<String>  names = new ArrayList<>();

    @Autowired
    TemplateEngine templateEngine;

    @Autowired
    CatsService catsService;

    @PostMapping("/save")
    String saving(HttpServletRequest request) throws ServletException, IOException {
        Collection<Part> parts = request.getParts();
        parts.forEach(x -> catsService.saveCat(new Cat(x.getSubmittedFileName(),"cats/"+x.getSubmittedFileName())));
//        response.sendRedirect("/file-upload");
        return "files-upload";

    }

    @GetMapping("/files-upload")
    String fileUpload() {
        return "files-upload";
    }
    @GetMapping(value = "/view")
    String get2Cats(Model model){
        model.addAttribute("text", "hello world");

        return "voting";
    }





}
