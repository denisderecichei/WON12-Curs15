package org.fasttrack.tema14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileToQuoteConverterTest {

    @Test
    public void testSize() {
        List<Quote> quotes = FileToQuoteConverter.retrieveQuotesFromFile("files/quotes.txt");
        Assertions.assertEquals(5421, quotes.size());
    }

    @Test
    public void testFirstElement() {
        List<Quote> quotes = FileToQuoteConverter.retrieveQuotesFromFile("files/quotes.txt");
        Quote quote = quotes.get(0);
        Assertions.assertEquals(1, quote.getId());
        Assertions.assertEquals("Lao Tzu", quote.getAuthor());
        Assertions.assertEquals("Doing nothing is better than being busy doing nothing.", quote.getQuote());
    }
}
