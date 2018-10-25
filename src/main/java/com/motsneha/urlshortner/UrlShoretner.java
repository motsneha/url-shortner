package com.motsneha.urlshortner;

import com.google.common.hash.Hashing;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class UrlShoretner {

    private LinkRepository linkRepository;

    public UrlShoretner(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link shorten(String url) {
        Link link = linkRepository.findByFullUrl(url);
        if (link == null) {
            String shortUrl = Hashing.murmur3_32().hashString(url, StandardCharsets.UTF_8).toString();
            link = new Link(shortUrl, url);
            linkRepository.save(link);
        }
        return link;
    }


}
