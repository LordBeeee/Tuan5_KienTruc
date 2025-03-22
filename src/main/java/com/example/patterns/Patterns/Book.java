package com.example.patterns.Patterns;

public abstract class Book {
    protected String title;

    public Book(String title) {
        this.title = title;
    }

    public abstract void displayInfo();
}

class PaperBook extends Book {
    public PaperBook(String title) {
        super(title);
    }

    public void displayInfo() {
        System.out.println("Sách giấy: " + title);
    }
}

class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

    public void displayInfo() {
        System.out.println("Sách điện tử: " + title);
    }
}

class BookFactory {
    public static Book createBook(String type, String title) {
        if (type.equalsIgnoreCase("paper")) {
            return new PaperBook(title);
        } else if (type.equalsIgnoreCase("ebook")) {
            return new EBook(title);
        }
        throw new IllegalArgumentException("Loại sách không hợp lệ");
    }
}
