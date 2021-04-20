package br.com.teste2;

public class Cozinha {

	private Integer quantidadeBocasFogao;
	private Mesa mesa;

	public Integer getQuantidadeBocasFogao() {
		return quantidadeBocasFogao;
	}

	public void setQuantidadeBocasFogao(Integer quantidadeBocasFogao) {
		this.quantidadeBocasFogao = quantidadeBocasFogao;
	}

	public static Cozinha criarCozinha() {
		return new Cozinha();
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public String toString() {
		return "Cozinha [quantidadeBocasFogao=" + quantidadeBocasFogao + ", mesa=" + mesa + "]";
	}
	
}
