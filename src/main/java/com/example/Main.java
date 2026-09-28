package com.example;

public class Main {
    public static void main(String[] args) {
        Contatore c1 = new Contatore(10);

        Lavoratore lavoratore1 = new Lavoratore(c1, "Thread-1");
        Lavoratore lavoratore2 = new Lavoratore(c1, "Thread-2");

        Thread t1 = new Thread(lavoratore1);
        Thread t2 = new Thread(lavoratore2);

        t1.start();
        t2.start();

        try{    
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("raggiunto valore massimo");
    }
}