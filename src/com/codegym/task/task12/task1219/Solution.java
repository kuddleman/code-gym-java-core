package com.codegym.task.task12.task1219;

/* 
Making a human

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run() {
            System.out.println("I can run!");
        }
        public void swim() {
            System.out.println("I can swim!");
        }

    }

    public class Duck implements CanFly, CanRun, CanSwim {
        public void run() {
            System.out.println("I can run!");
        }
        public void swim() {
            System.out.println("I can swim!");
        }
        public void fly() {
            System.out.println("I can run!");
        }
    }

    public class Penguin implements CanSwim, CanRun {
        public void run() {
            System.out.println("I can run!");
        }
        public void swim() {
            System.out.println("I can swim!");
        }

    }

    public class Airplane implements CanFly, CanRun {
        public void run() {
            System.out.println("I can run!");
        }

        public void fly() {
            System.out.println("I can run!");
        }

    }
}
