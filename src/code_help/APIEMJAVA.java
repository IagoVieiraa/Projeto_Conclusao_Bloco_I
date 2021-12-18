package code_help;

import javax.swing.JOptionPane;

public class APIEMJAVA 
{

	private String urlBase; //url da pagina 
	private String cpf;
	private String telefone; 
	private String endere�o;
	private String suspeito;
	private double provasImagens;
	
	public APIEMJAVA (String u,String c,String t,String e,String s,double p) {
		this.setUrlBase(u);
		this.setCpf(c);
		this.setTelefone(t);
		this.setEndere�o(e);
		this.setSuspeito(s);
		this.setProvasImagens(p);
	}

	public String getUrlBase() {
		return urlBase;
	}
	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getSuspeito() {
		return suspeito;
	}
	public void setSuspeito(String suspeito) {
		this.suspeito = suspeito;
	}
	public double getProvasImagens() {
		return provasImagens;
	}
	public void setProvasImagens(double provasImagens) {
		this.provasImagens = provasImagens;
	}
		
}
