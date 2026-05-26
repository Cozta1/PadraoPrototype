package main.java;

public class Hamburguer implements Cloneable {
    private int idPedido;
    private String nomeLanche;
    private double preco;
    private Receita receita;

    public Hamburguer(int idPedido, String nomeLanche, double preco, Receita receita) {
        this.idPedido = idPedido;
        this.nomeLanche = nomeLanche;
        this.preco = preco;
        this.receita = receita;
    }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public String getNomeLanche() { return nomeLanche; }
    public void setNomeLanche(String nomeLanche) { this.nomeLanche = nomeLanche; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public Receita getReceita() { return receita; }
    public void setReceita(Receita receita) { this.receita = receita; }

    @Override
    public Hamburguer clone() throws CloneNotSupportedException {
        Hamburguer hamburguerClone = (Hamburguer) super.clone();
        hamburguerClone.receita = (Receita) hamburguerClone.receita.clone();
        return hamburguerClone;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "idPedido=" + idPedido +
                ", nomeLanche='" + nomeLanche + '\'' +
                ", preco=" + preco +
                ", receita=" + receita +
                '}';
    }
}