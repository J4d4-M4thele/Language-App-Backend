package com.languagews.languagesystem.model;

import jakarta.persistence.*;

@Entity
@Table(name="languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Language")
    private String language;

    @Column(name = "Country")
    private String country;

    @Column(name = "Country_Flag_Image_Uri")
    private String countryFlagUri;

    public Language() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryFlagUri() {
        return countryFlagUri;
    }

    public void setCountryFlagUri(String countryFlagUri) {
        this.countryFlagUri = countryFlagUri;
    }
}
