package com.lesson.oop;

class Title {
    public   String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println("Назва книги: " + title);
    }
}
