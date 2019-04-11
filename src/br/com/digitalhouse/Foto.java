package br.com.digitalhouse;

public class Foto implements Imprimivel {

    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    public Foto() {

    }

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {

        System.out.println("Sou uma selfie" + nome + tipo);

    }
}
