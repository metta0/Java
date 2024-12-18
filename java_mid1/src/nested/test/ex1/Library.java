package nested.test.ex1;

import java.util.ArrayList;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        this.books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String writer){
        //검증 로직을 다 처리하고
        if (bookCount >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[bookCount++] = new Book(title, writer);
    }

    public void showBooks(){
        for (Book book : books) {
            System.out.println("book = " + book);
        }
    }

    private static class Book {
        private String title;
        private String writer;

        public Book(String title, String writer) {
            this.title = title;
            this.writer = writer;
        }

        @Override
        public String toString() {
            return "title : "+ this.title +", writer : " + this.writer;
        }
    }
}