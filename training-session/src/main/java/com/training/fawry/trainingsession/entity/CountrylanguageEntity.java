package com.training.fawry.trainingsession.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "countrylanguage", schema = "world", catalog = "")
@IdClass(CountrylanguageEntityPK.class)
public class CountrylanguageEntity {
    private String countryCode;
    private String language;
    private String isOfficial;
    private double percentage;

    @Id
    @Column(name = "CountryCode", nullable = false, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Id
    @Column(name = "Language", nullable = false, length = 30)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "IsOfficial", nullable = false)
    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    @Basic
    @Column(name = "Percentage", nullable = false, precision = 1)
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountrylanguageEntity that = (CountrylanguageEntity) o;
        return Double.compare(that.percentage, percentage) == 0 &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language) &&
                Objects.equals(isOfficial, that.isOfficial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language, isOfficial, percentage);
    }
}
