package org.fasttrack.tema14;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Quote> quotes = FileToQuoteConverter.retrieveQuotesFromFile("files/quotes.txt");

        QuoteService service = new QuoteService(quotes);

        System.out.println(service.getAllQuotes().size());
        System.out.println(service.getAuthors().size());
        System.out.println(service.getFavourites().size());
        service.setFavourite(1);
        service.setFavourite(12);
        service.setFavourite(123);
        service.setFavourite(1234);
        System.out.println(service.getFavourites().size());
        System.out.println(service.getRandomQuote());
    }

}
