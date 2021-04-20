package br.com.teste2;

public class Mesa {

	private Integer quantidadeCadeiras;

	public Integer getQuantidadeCadeiras() {
		return quantidadeCadeiras;
	}

	public void setQuantidadeCadeiras(Integer quantidadeCadeiras) {
		this.quantidadeCadeiras = quantidadeCadeiras;
	}

	@Override
	public String toString() {
		return "Mesa [quantidadeCadeiras=" + quantidadeCadeiras + "]";
	}

	
	
	
}
