package com.lesson.oop1;

class Author {
    public String authorName;
    public Author (String authorName) {
        this.authorName = authorName;
    }
    public void show() {
        System.out.println("Автор: " + authorName);
    }
}
