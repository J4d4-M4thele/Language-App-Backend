package com.languagews.languagesystem.repository;

import com.languagews.languagesystem.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
	Optional<Language> getLanguageByCode(String code);
}
