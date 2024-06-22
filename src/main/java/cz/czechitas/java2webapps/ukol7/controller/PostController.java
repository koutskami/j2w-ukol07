package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PostController {
    private final PostService service;
    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView seznam(@PageableDefault(sort = {"published"}) Pageable pageable) {
        return new ModelAndView("osoby")
                .addObject("osoby", service.seznamOsob(pageable));
    }
}
