package com.lesson.oop;

class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("Назва книги: " + title);
    }
}
