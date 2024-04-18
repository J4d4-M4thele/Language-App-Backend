package com.languagews.languagesystem.service;

import com.languagews.languagesystem.model.Language;

import java.util.List;

public interface LanguageService {
    Language addLanguage(Language language);
    List<Language> getLanguages();
    Language updateLanguage(Language language, String code);
    Language getLanguageByCode(String code);
    void deleteLanguage(Integer id);
}
