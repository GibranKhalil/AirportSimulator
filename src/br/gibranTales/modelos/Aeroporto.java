package br.gibranTales.modelos;

import java.util.ArrayList;

public class Aeroporto {
    private Pista pista1 = new Pista();
    private Pista pista2 = new Pista();
    private Pista pistaEmergencial = new Pista();

    private ArrayList<Pista> listaPistas = new ArrayList<>();



    public Aeroporto(){
        Aviao novoAviao = new Aviao();
        Aviao novoAviao1 = new Aviao();
        Aviao novoAviao2 = new Aviao();
        pista1.adicionarAviaoNaPista(novoAviao);
        pista1.adicionarAviaoNaPista(novoAviao);
        pista1.adicionarAviaoNaPista(novoAviao);
        pista1.adicionarAviaoNaPista(novoAviao1);
        pista1.adicionarAviaoNaPista(novoAviao2);
        System.out.println("Pista 1: \n" + pista1);
        System.out.println("Pista 2: \n" +pista2);
        System.out.println("Pista Emergencial: \n" +pistaEmergencial);

    }


    public void popularPistasAtt(){

    }
}
