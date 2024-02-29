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

    public void aterissarAviao(){
        for(int i = 0; i < this.listaFilas.size(); i++){
            for(int j = 0; j < this.listaFilas.get(i).pegarTamanho(); j++){
                if(verificarUltimoCombustivel(this.listaFilas.get(i).pegarPosicao(j))){
                    System.out.println("Pousou: " + this.listaFilas.get(i).pegarPosicao(j));
                    this.listaFilas.get(i).removerPosicao(j);
                    return;
                };
                System.out.println("Pousou: " + this.listaFilas.get(i).pegaPrimeiro());
                this.listaFilas.get(i).remover();
            }
        }
        //Usar a classe aterrisagem posteriormente
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
