public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("hello");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando..");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
        
    }

    @Override
    public void atualizarPagina() {
       System.out.println("atualizando a pagina!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando midía...");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica..");
        
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica");
        
    }
    
    

}
