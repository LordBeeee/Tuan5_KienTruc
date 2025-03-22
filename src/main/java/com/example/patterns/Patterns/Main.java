package com.example.patterns.Patterns;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        Book book1 = BookFactory.createBook("paper", "Lập trình Java");
        Book book2 = BookFactory.createBook("ebook", "Design Patterns");

        library.addBook(book1);
        library.addBook(book2);

        // Kiểm thử Strategy Pattern (Tìm kiếm sách)
        LibrarySearch search = new LibrarySearch();
        search.setStrategy(new SearchByTitle());
        search.performSearch(library.getBooks(), "Java");

        // Kiểm thử Observer Pattern (Thông báo sách hết hàng)
        BookAvailability availability = new BookAvailability();
        User user1 = new User("Alice");
        availability.addObserver(user1);
        availability.notifyObservers("Sách 'Lập trình Java' đã hết");

        // Kiểm thử Decorator Pattern (Gia hạn thời gian mượn sách)
        Book extendedLoanBook = new ExtendedLoanBook(book1);
        extendedLoanBook.displayInfo();
    }
}
