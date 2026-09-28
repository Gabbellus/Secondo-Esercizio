package com.example;

import java.util.Random;

public class Lavoratore implements Runnable{
    

    private final Contatore contatore;
    private final String nome;

    public Lavoratore(Contatore contatore, String nome) {
        this.contatore = contatore;
        this.nome = nome;
    }

    Random rand = new Random();

    @Override
    public void run() {
        System.out.println(nome + " ha iniziato a lavorare.");

        while (contatore.incrementa(nome)) {
            try {
                int durataPausa = rand.nextInt(400) +100;
                Thread.sleep(durataPausa);
            } catch (InterruptedException e) {
                System.out.println(nome + " è stato interrotto.");
            }
        }

        System.out.println(nome + " ha terminato il suo lavoro.");
    }
}
