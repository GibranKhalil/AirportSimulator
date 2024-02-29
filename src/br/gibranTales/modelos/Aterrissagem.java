package br.gibranTales.modelos;

public class Aterrissagem {
    private Aviao aviao;
    private int tempoChegadaAviao;
    private int tempoSaidaAviao;

    private static int totalTempoAterrissagem = 0;
    private static int quantidadeGeralAviao = 0;

    public Aterrissagem(Aviao novoAviao, int tempoChegada){
        this.aviao = novoAviao;
        this.tempoChegadaAviao = tempoChegada;
        quantidadeGeralAviao++;
    }

    public void setTempoSaidaAviao(int tempoSaidaAviao){
        this.tempoSaidaAviao = tempoSaidaAviao;
    }

    public void aterrissarAviao(){
        int tempoMedio = this.tempoChegadaAviao - this.tempoSaidaAviao;
        totalTempoAterrissagem += tempoMedio;
        System.out.println("O Avião: AV-" + aviao.getIdAviao() + " aterrisou com sucesso");
    }


    public double getMediaTempoAterrissagem(){
        return (double) totalTempoAterrissagem /quantidadeGeralAviao;
    }
}
