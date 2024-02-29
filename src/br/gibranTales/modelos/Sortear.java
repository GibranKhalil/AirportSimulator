package br.gibranTales.modelos;

import java.util.Random;

public class Sortear {
    private Random gerador = new Random();
    private int numeroAleatorio;

    public Sortear() {
        this.numeroAleatorio = gerador.nextInt(20);
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    @Override
    public String toString() {
        return "Número aleatório gerado: " + getNumeroAleatorio();
    }
}
