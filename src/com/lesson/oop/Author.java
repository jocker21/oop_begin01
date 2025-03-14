package com.lesson.oop;

class Author {
    private  final String authorName;
    public Author (String authorName) {
        this.authorName = authorName;
    }
    public void show() {
        System.out.println("Автор: " + authorName);
    }
}
