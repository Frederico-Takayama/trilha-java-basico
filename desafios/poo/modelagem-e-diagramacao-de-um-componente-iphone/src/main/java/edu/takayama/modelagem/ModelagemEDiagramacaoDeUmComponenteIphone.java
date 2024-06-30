package edu.takayama.modelagem;

/**
 * @author Takayama
 * @version 1.0.0.0
 * 
 * Desafio de modelagem e diagramação de um componente iPhone
 */
public class ModelagemEDiagramacaoDeUmComponenteIphone {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.selecionarMusica("phamton of the opera");
        iphone.tocar();
        iphone.pausar();
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.ligar("55512345");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
