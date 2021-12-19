package code_help;

import javax.swing.JOptionPane;

public class APIEMJAVA 
{
	private String nomeDaVitima;
	private int telefone; 
	private String enderešo;
	private String suspeito;
	
	public APIEMJAVA (String n,int t,String e,String s) {

		this.setNomeDaVitima(n);
		this.setTelefone(t);
		this.setEnderešo(e);
		this.setSuspeito(s);
	}
	public String getNomeDaVitima() {
		return nomeDaVitima;
	}
	public void setNomeDaVitima(String nomeDaVitima) {
		this.nomeDaVitima = nomeDaVitima;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getSuspeito() {
		return suspeito;
	}
	public void setSuspeito(String suspeito) {
		this.suspeito = suspeito;
	}
	
	public void setProvasDeImagens() {
		System.out.println("\nPedido Recebido");
	}
}
