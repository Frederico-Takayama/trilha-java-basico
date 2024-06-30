package edu.takayama.modelagem;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");        
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir pagina " + url);
    }
    
}
