package br.gibranTales.modelos;

import java.util.ArrayList;

public class Pista {
    private Fila filaAtt1 = new Fila();
    private Fila filaAtt2 = new Fila();
    private Fila filaDec1 = new Fila();

    private ArrayList<Fila> listaFilas = new ArrayList<>();

    public Pista(){
        listaFilas.add(filaAtt2);
        listaFilas.add(filaAtt1);
        listaFilas.add(filaDec1);
    }

    public void adicionarAviaoNaPista(Aviao aviao){
        int menorFila = 100;
        Fila filaAlvo = new Fila();

        for(int i = 0; i < this.listaFilas.size(); i++) {
            if (this.listaFilas.get(i).pegarTamanho() < menorFila) {
                menorFila = this.listaFilas.get(i).pegarTamanho();
                filaAlvo = this.listaFilas.get(i);
            }
        }
        filaAlvo.adicionar(aviao);
    }

    public void diminuirCombustivelAvioes(){
        for(int i = 0; i < this.listaFilas.size(); i++) {
            for (int j = 0; j < this.listaFilas.get(i).pegarTamanho(); j++) {
                this.listaFilas.get(i).pegarPosicao(j).diminuirCombustivel();
            }
        }
    }

    public void aterissarAviao(){
        for(int i = 0; i < this.listaFilas.size(); i++){
            for(int j = 0; j < this.listaFilas.get(i).pegarTamanho(); j++){
                if(verificarUltimoCombustivel(this.listaFilas.get(i).pegarPosicao(j))){
                    diminuirCombustivelAvioes();
                    Aterrissagem aterrissagem =  new Aterrissagem(this.listaFilas.get(i).pegarPosicao(j), this.listaFilas.get(i).pegarPosicao(j).getCombustivelAviao());
                    aterrissagem.aterrissarAviao();
                    System.out.println(this.listaFilas.get(i).pegarPosicao(j));
                    this.listaFilas.get(i).remover();
                    aviaoSemCombustivel();
                    return;
                };
            }
        }
    }

    public void aviaoSemCombustivel(){
        for(int i = 0; i < this.listaFilas.size(); i++){
            for(int j = 0; j < this.listaFilas.get(i).pegarTamanho(); j++){
                if(this.listaFilas.get(i).pegarPosicao(j).getCombustivelAviao() < 1){
                    System.out.println(this.listaFilas.get(i).pegarPosicao(j).aviaoCair());
                };
            }
        }
    }


public void decolar() {
    if (!filaDec1.ehVazia()) {
        Aviao aviao = filaDec1.poll();
        System.out.println("Avião decolando: " + aviao);
    } else {
        System.out.println("Não há aviões na fila de decolagem.");
    }
}
    public int obterTamanho(){
        return filaAtt1.pegarTamanho() + filaAtt2.pegarTamanho();
    }

    public boolean verificarUltimoCombustivel(Aviao aviao){
        return aviao.getCombustivelAviao() == 1;
    }

    @Override
    public String toString() {
        return """
                Pista de aterrisagem 1: %s
                Pista de aterrisagem 2: %s
                Pista de decolagem : %s
                """.formatted(filaAtt1, filaAtt2, filaDec1);
    }
}
