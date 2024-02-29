package br.gibranTales.modelos;

import java.util.ArrayList;

public class Aeroporto {
    private Pista pista1 = new Pista();
    private Pista pista2 = new Pista();
    private Pista pistaEmergencial = new Pista();

    private ArrayList<Pista> listaPistas = new ArrayList<>();



    public Aeroporto(){
        listaPistas.add(pista1);
        listaPistas.add(pista2);
        listaPistas.add(pistaEmergencial);
        for(int i = 0; i < 10; i++){
            Aviao novoAviao = new Aviao();
            pista1.adicionarAviaoNaPista(novoAviao);
        }
        for (int i = 0; i < 10; i++){
            pista1.aterissarAviao();
        }
    }


    public void popularPistasAtt(){
        for(int i = 0; i < listaPistas.size(); i ++){
            for(int j = 0; j < listaPistas.get(i).obterTamanho(); j++){

            }
        }
    }
}
