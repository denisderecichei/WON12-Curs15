package org.fasttrack.tema14;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QuoteServiceTest {
    private static QuoteService service;


    @BeforeAll
    public static void initialSetup() {
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote(1, "1", "quote1"));
        quotes.add(new Quote(2, "2", "quote2"));
        quotes.add(new Quote(3, "3", "quote3"));
        service = new QuoteService(quotes);
    }

    @Test
    @Order(1)
    public void testFavorites() {
        Assertions.assertEquals(0, service.getFavourites().size());
        service.setFavourite(1);
        Assertions.assertEquals(1, service.getFavourites().size());
        service.setFavourite(1);
        Assertions.assertEquals(0, service.getFavourites().size());
        service.setFavourite(2);
        service.setFavourite(3);
        Assertions.assertEquals(2, service.getFavourites().size());
    }

    @Test
    @Order(2)
    public void testRandomQuotes() {
        Assertions.assertEquals(2, service.getFavourites().size());
    }
}
