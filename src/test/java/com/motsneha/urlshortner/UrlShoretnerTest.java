package com.motsneha.urlshortner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UrlShoretnerTest {

    private UrlShoretner urlShoretner;

    private static final String LONG_URL = "https://veryLongUrl.com";
    private static final String SHORT_URL = "short.ly";
    private static final Link LINK = new Link(SHORT_URL, LONG_URL);


    @Mock
    LinkRepository linkRepository;

    @Before
    public void setup(){
        urlShoretner = new UrlShoretner(linkRepository);
    }
    @Test
    public void shorten() {
        when(linkRepository.findByFullUrl(anyString())).thenReturn(LINK);

        Link shorten = urlShoretner.shorten(LONG_URL);

        assertThat(shorten.getShortUrl()).isEqualTo(SHORT_URL);
    }
}