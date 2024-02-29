package br.gibranTales.modelos;

public class Aviao {
    private static int ultimoId = 0;
    private int idAviao;
    private int combustivelAviao;

    public Aviao(){
        Sortear numeroAleatorio = new Sortear();
        ultimoId++;
        this.setIdAviao(ultimoId);
        this.setCombustivelAviao(numeroAleatorio.getNumeroAleatorio());
    }

    @Override
    public String toString() {
        return """
                \nAvião: AV-%d
                Quantidade de combustível: %d
                """.formatted(this.idAviao, this.getCombustivelAviao());
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getCombustivelAviao() {
        return combustivelAviao;
    }
    public void diminuirCombustivel(){
        setCombustivelAviao(this.combustivelAviao-1);
    }

    public String aviaoCair(){
        return """
                O Avião: AV-%d caiu
                """.formatted(this.getIdAviao());
    }

    public void setCombustivelAviao(int combustivelAviao) {
        this.combustivelAviao = combustivelAviao;
    }
    
}
