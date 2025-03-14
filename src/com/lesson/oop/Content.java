package com.lesson.oop;

class Content {
    private final String content;

    public Content(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println("Анотація: " +  content);
    }
}
