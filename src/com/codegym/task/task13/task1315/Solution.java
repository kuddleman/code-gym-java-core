package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike

*/

public class Solution {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void eat() {

        }
        public void move() {

        }
    }

    public class Cat implements CanMove, CanEat, Edible {
        public void eat() {

        }

        public void beEaten() {

        }
        public void move() {

        }

    }

    public class Mouse implements CanMove, Edible {
        public void beEaten() {

        }
        public void move() {

        }

    }




}