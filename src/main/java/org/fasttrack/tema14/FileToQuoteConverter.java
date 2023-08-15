package org.fasttrack.tema14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileToQuoteConverter {

    public static List<Quote> retrieveQuotesFromFile(String filePath) {
        File file = new File(filePath);
        List<Quote> quotes = new ArrayList<>();
        int id = 0;
        //try with resources
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("~");
                id++;
                if (parts.length == 2) {
                    Quote createdQuote = new Quote(id, parts[0], parts[1]);
                    quotes.add(createdQuote);
                }
            }

        } catch (FileNotFoundException ex) {
            throw new RuntimeException("File is not found");
        }
        return quotes;
    }
}
