package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
            System.out.println("I'm moving");
        }

        public void eat() {
            System.out.println("yummy!");
        }
    }

    public class Duck implements CanMove, CanEat, CanFly {
        public void move() {
            System.out.println("I'm moving");
        }
        public void eat() {
            System.out.println("yummy!");
        }

        public void fly() {
            System.out.println("I'm flying!");
        }

    }

    public class Car implements CanMove {
        public void move() {
            System.out.println("I'm moving");
        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {
            System.out.println("I'm moving");
        }
        public void fly() {
            System.out.println("I'm flying!");
        }
    }
}
