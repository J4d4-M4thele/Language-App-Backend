package com.languagews.languagesystem.service.impl;

import com.languagews.languagesystem.exception.LanguageNotFoundException;
import com.languagews.languagesystem.model.Language;
import com.languagews.languagesystem.repository.LanguageRepository;
import com.languagews.languagesystem.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    @Override
    public Language addLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> getLanguages() {
        return languageRepository.findAll();
    }

    @Override
    public Language updateLanguage(Language language, Integer id) {
        return languageRepository.findById(id)
                .map(lang -> {
                    lang.setFullName(language.getFullName());
                    lang.setLanguage(language.getLanguage());
                    lang.setCountry(language.getCountry());
                    lang.setCountryFlagUri(language.getCountryFlagUri());
                    return languageRepository.save(lang);
                })
                .orElseThrow(() -> new LanguageNotFoundException("Sorry, this language could not be found."));
    }

    @Override
    public Language getLanguageById(Integer id) {
        return languageRepository.findById(id)
                .orElseThrow(() -> new LanguageNotFoundException("Sorry, the language with id: " + id + " could not be found."));
    }

    @Override
    public void deleteLanguage(Integer id) {

        if(!languageRepository.existsById(id)) {
            throw new LanguageNotFoundException("Sorry, the language with id: " + id + " could not be found.");
        }
        languageRepository.deleteById(id);
    }
}
