package com.motsneha.urlshortner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinksController {

    @Autowired
    UrlShoretner urlShoretner;

    @GetMapping("/shorten")
    public Link shorten(@RequestParam String fullUrl) {
        return urlShoretner.shorten(fullUrl);
    }
}
