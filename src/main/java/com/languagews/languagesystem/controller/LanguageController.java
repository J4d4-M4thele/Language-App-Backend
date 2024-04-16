package com.languagews.languagesystem.controller;

import com.languagews.languagesystem.model.Language;
import com.languagews.languagesystem.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/languages")
@RequiredArgsConstructor
public class LanguageController {
    private final LanguageService languageService;

    @GetMapping
    public ResponseEntity<List<Language>> getLanguages() {
        return new ResponseEntity<>(languageService.getLanguages(), HttpStatus.FOUND);
    }

    @PostMapping
    public Language addLanguage(@RequestBody Language language) {
        return languageService.addLanguage(language);
    }

    @PutMapping("/update/{id}")
    public Language updateLanguage(@RequestBody Language language,@PathVariable Integer id) {
        return languageService.updateLanguage(language, id);
    }

    @GetMapping("/language/{id}")
    public Language getLanguageById(@PathVariable Integer id) {
        return languageService.getLanguageById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLanguage(@PathVariable Integer id) {
        languageService.deleteLanguage(id);
    }
}
