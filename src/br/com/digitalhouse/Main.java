package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        Contrato contrato = new Contrato("Contrato de venda","Tipo 1");
        Foto foto = new Foto("Foto da família Alvez","Analogica");
        Documento documento = new Documento("Foto 3x4","RG");

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();


    }
}
