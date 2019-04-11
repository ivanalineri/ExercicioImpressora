package br.com.digitalhouse;

public class Documento implements Imprimivel {

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

    public Documento(){

    }

    public Documento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {

        System.out.println("Sout um documento do Word" + nome + tipo);

    }
}
