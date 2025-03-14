package com.lesson.oop1;

public class Book {
      public Title title;
      public Author author;
      public Content content;

    public Book(Title title, Author author,Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    private void show() {
        title.show();
        author.show();
        content.show();
    }

    static void main() {
        Title title = new Title("Грохаєм алгоритми");
        Author author = new Author("Гремм");
        Content content = new Content("програмування");

        Book book = new Book(title, author, content);
        book.show();

    }
}
