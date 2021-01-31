package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanClimb {
        public void climb();
    }

    public interface CanRun {
        public void run();
    }

    public class Cat implements CanClimb, CanRun {
        public void climb(){
         System.out.println("I'm climbing!");
        }
        public void run() {
            System.out.println("I'm running!");
        }
    }

    public class Dog implements CanRun {
        public void run() {
            System.out.println("I'm running!");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun {
        public void run() {
            System.out.println("I'm running!");
        }
        public void fly() {
            System.out.println("I'm flying!");
        }

    }
}
