package PooDesafio;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}
	
	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	@Override
	public void atender() {
		System.out.println("Atendendo a chamada");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página");
	}
	
	public static void main(String[] args) {
		
		iPhone meuIphone = new iPhone();		
		
		meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Música A");
        
        meuIphone.ligar("919191919");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
		
	}
 }
