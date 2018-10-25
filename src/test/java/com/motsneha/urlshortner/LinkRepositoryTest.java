package com.motsneha.urlshortner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LinkRepositoryTest {

    private static final String FULL_URL = "http://www.averylongurl.com";
    private static final String SHORT_URL = "abc.ly";

    @Autowired
    private LinkRepository linkRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void testGetLinkByShortUrl() {
        Link link = linkRepository.save(new Link(SHORT_URL, FULL_URL));
        Link byShortUrl = linkRepository.findByShortUrl(SHORT_URL);

        assertThat(byShortUrl).isNotNull();

    }
}
