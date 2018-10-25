package com.motsneha.urlshortner;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Link {

    @JsonProperty
    @Id
    private String shortUrl;

    @JsonProperty
    private String fullUrl;

    public Link(String shortUrl, String fullUrl) {
        this.fullUrl = fullUrl;
        this.shortUrl = shortUrl;
    }

    public Link() {

    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }
}
