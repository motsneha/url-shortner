package com.motsneha.urlshortner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@WebMvcTest(controllers = LinksController.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class LinksControllerTest {

    private String shortUrl = "";
    private String fullUrl = "";

    private Link mockLink = new Link(shortUrl, fullUrl);

    @Autowired
    private LinksController linksController;

//    @Autowired
//    private MockMvc mockMvc;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private UrlShoretner urlShoretner;

    @Test
    public void testShorten() throws Exception {
        //arrange
        when(urlShoretner.shorten(anyString())).thenReturn(mockLink);
        //act
//        testRestTemplate.getForEntity()
//        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/shorten").param("fullurl", fullUrl));
        //assert
//        resultActions.andExpect(status().isCreated())
//                .andExpect(jsonPath("shortUrl").value(shortUrl))
//                .andExpect(jsonPath("fullUrl").value(fullUrl));
    }

}