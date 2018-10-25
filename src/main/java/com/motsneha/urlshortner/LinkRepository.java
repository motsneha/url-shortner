package com.motsneha.urlshortner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, String> {

    Link findByShortUrl(String shortUrl);

    Link findByFullUrl(String fullUrl);

    Link save(Link link);
}
