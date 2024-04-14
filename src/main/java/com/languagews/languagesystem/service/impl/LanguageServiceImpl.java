package com.languagews.languagesystem.service.impl;

import com.languagews.languagesystem.model.Language;
import com.languagews.languagesystem.repository.LanguageRepository;
import com.languagews.languagesystem.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    @Override
    public List<Language> getLanguages() {
        return null;
    }
}
