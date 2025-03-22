package com.example.patterns.Patterns;

import java.util.List;

interface SearchStrategy {
    void search(List<Book> books, String keyword);
}

class SearchByTitle implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        for (Book book : books) {
            if (book.title.contains(keyword)) {
                book.displayInfo();
            }
        }
    }
}

public class LibrarySearch {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void performSearch(List<Book> books, String keyword) {
        if (strategy != null) {
            strategy.search(books, keyword);
        }
    }
}
