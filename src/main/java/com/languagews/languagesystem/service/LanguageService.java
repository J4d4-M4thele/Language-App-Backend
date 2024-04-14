package com.languagews.languagesystem.service;

import com.languagews.languagesystem.model.Language;

import java.util.List;

public interface LanguageService {
    public Language saveLanguage(Language language);
    public List<Language> getLanguages();
}
