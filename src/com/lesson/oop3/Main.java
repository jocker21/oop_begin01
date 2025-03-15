package com.lesson.oop3;

public class Main {
    public static void main(String[] ignoredArgs) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Asus",8,120,1.6);
        computers[1] = new Computer("Aser",12,320,2.3);
        computers[2] = new Computer("Samsung",16,520,3.6);
        computers[3] = new Computer("HP",32,420,3.0);
        computers[4] = new Computer("Dell",10,1000,3.9);

        for (Computer computer : computers) {
            computer.compImfo();
        }
    }
}
