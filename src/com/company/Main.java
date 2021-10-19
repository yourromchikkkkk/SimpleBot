package com.company;

import java.util.Scanner;

class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // line for input
    private String botName;
    private String birthYear;

    SimpleBot(String botName, String birthYear) {
        this.botName = botName;
        this.birthYear = birthYear;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBotName() {
        return this.botName;
    }

    public String getBirthYear() {
        return this.birthYear;
    }

    public void greet() {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    public void remindName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    public void test() {
        System.out.println("Let's test your programming knowledge.\nWhy do we use methods?\n1. To repeat a statement multiple times.\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of a program.\n4. To interrupt the execution of a program.");
        boolean isTrue = false;
        int ans;
        do {
            ans = scanner.nextInt();
            if (ans != 2) {
                System.out.println("Please, try again.");
            } else {
                isTrue = true;
            }
        } while (!isTrue);
    }

    public void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}

public class Main {

    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("Ruby", "2021");
        bot.greet();
        bot.remindName();
        bot.guessAge();
        bot.count();
        bot.test();
        bot.end();
    }


}