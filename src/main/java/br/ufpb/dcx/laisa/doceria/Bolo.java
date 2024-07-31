package br.ufpb.dcx.laisa.doceria;

public class Bolo extends Doce{
    private String recheio;
    private String cobertura;
    private int qtdFatias;

    public Bolo(String id, String nome, double preco, String recheio, String cobertura, int qtdFatias) {
        super(id, nome, preco);
        this.recheio = recheio;
        this.cobertura = cobertura;
        this.qtdFatias = qtdFatias;
    }

    public Bolo() {
        this("", "", 0.0, "", "", 0);
    }

    public String getDescricao(){
        return " DOCE: ID"+ super.getId()+ " | Nome: "+ super.getNome()+", com recheio de " + this.recheio +
                " e cobertura de " + this.cobertura + ", e que serve " +
                this.qtdFatias + " fatias." + " Preço:  " + super.getPreco();
    }

    public String toString(){
        return this.getDescricao();
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public int getQtdFatias() {
        return qtdFatias;
    }

    public void setQtdFatias(int qtdFatias) {
        this.qtdFatias = qtdFatias;
    }

}
