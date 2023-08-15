package org.fasttrack.tema14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {
    private List<Quote> quotes;
    private static Random random = new Random();


    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> quoteStrings = new ArrayList<>();
        for (Quote currentQuote : quotes) {
            quoteStrings.add(currentQuote.getQuote());
        }
        return quoteStrings;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> quotesByAuthor = new ArrayList<>();
        for (Quote currentQuote : quotes) {
            if (currentQuote.getAuthor().equals(author)) {
                quotesByAuthor.add(currentQuote);
            }
        }
        return quotesByAuthor;
    }

    public List<String> getAuthors() {
        List<String> authors = new ArrayList<>();
        for (Quote currentQuote : quotes) {
            if (!authors.contains(currentQuote.getAuthor())) {
                authors.add(currentQuote.getAuthor());
            }
        }
        return authors;
    }

    public void setFavourite(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavourite(!quote.isFavourite());
            }
        }

        //
//        Quote myQuote = quotes.get(id - 1);
//        myQuote.setFavourite(myQuote.isFavourite());

    }


    public List<Quote> getFavourites() {
        List<Quote> favoriteQuotes = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.isFavourite()) {
                favoriteQuotes.add(quote);
            }
        }
        return favoriteQuotes;
    }

    public String getRandomQuote() {
        int randomId = random.nextInt(quotes.size()) + 1;
        for (Quote quote : quotes) {
            if (quote.getId() == randomId) {
                return quote.getQuote();
            }
        }
        return "";
    }
}
