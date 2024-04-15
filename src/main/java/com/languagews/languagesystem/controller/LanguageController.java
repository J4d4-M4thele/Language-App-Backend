package com.languagews.languagesystem.controller;

import com.languagews.languagesystem.model.Language;
import com.languagews.languagesystem.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/languages")
@CrossOrigin
public class LanguageController {

    @Autowired
    private LanguageService languageService;


}
