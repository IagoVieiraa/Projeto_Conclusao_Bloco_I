package code_help;

public class Pessoa extends APIEMJAVA {
	private boolean denuncia;
		
	public Pessoa(String nomeDaVitima,int telefone,String endere�o,String suspeito) {
		super(nomeDaVitima,telefone,endere�o,suspeito);
		this.denuncia = denuncia;
	}
	public boolean isDenuncia() {
		return denuncia;
	}
	public void setDenuncia(boolean denuncia) {
		this.denuncia = denuncia;
	}
	public void pessoaInfo() {
		System.out.println("\nO Boletim de Ocorr�ncia foi registrado em nome do solicitante: "+getNomeDaVitima()+". \nO(s) telefone(s) registrados pelo aplicativo: "+getTelefone()+". \nO endere�o registrado: "+getEndere�o()+". \nO poss�vel suspeito: "+getSuspeito());
	}
}
