package com.example.patterns.Patterns;

abstract class BookDecorator extends Book {
    protected Book decoratedBook;

    public BookDecorator(Book book) {
        super(book.title);
        this.decoratedBook = book;
    }

    public abstract void displayInfo();
}

class ExtendedLoanBook extends BookDecorator {
    public ExtendedLoanBook(Book book) {
        super(book);
    }

    public void displayInfo() {
        decoratedBook.displayInfo();
        System.out.println("(Được gia hạn thời gian mượn)");
    }
}
