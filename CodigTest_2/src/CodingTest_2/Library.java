package CodingTest_2;

import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = "George Orwell";
        this.book = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("책등록:" + book.getTitle());
    }
    public void displayBooks() {
        System.out.println("도서관:" + name);
        for (Book book : books){
            book.displayDetails();
        }
    }

    public void lendBook(String tile){
        for (Book book : books){
            if(book.getTitle().equals(tile)){
                if(book instanceof PrintedBook)
            }
        }
    }

        }


