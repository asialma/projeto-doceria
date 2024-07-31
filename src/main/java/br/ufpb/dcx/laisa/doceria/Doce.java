package br.ufpb.dcx.laisa.doceria;

import java.util.Objects;

public abstract class Doce implements Comparable<Doce>{
    private String id;
    private String nome;
    private double preco;

    public Doce(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Doce(){
        this("", "", 0.0);
    }
    public abstract String getDescricao();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doce doce = (Doce) o;

        if (Double.compare(preco, doce.preco) != 0) return false;
        if (!Objects.equals(id, doce.id)) return false;
        return Objects.equals(nome, doce.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        temp = Double.doubleToLongBits(preco);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int compareTo(Doce o) {
        return (int) (this.preco - o.getPreco());
    }

    @Override
    public String toString() {
        return "Doce: " +
                "id "+ id +
                ", nome '" + nome + '\'' +
                ", preco '" + preco;
    }
}
