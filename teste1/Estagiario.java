package br.com.teste1;

public class Estagiario implements Funcionario, HorasTrabalhadas {

	private String numeroContrato;
	private Integer salario;
	private Sexo genero;

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Estagiario(String numeroContrato, Integer salario, Sexo genero) {
		this.numeroContrato = numeroContrato;
		this.salario = salario;
		this.genero = genero;
	}

	public Sexo getGenero() {
		return genero;
	}

	public void setGenero(Sexo genero) {
		this.genero = genero;
	}

	@Override
	public void trabalhar() {
		System.out.println("trabalhando como estagiario");
	}

	@Override
	public void almocar() {
		System.out.println("almocando");
	}

	@Override
	public Integer horas(Integer horasPorDia, Integer diasPorMes) {
		return horasPorDia * diasPorMes;
	}

}
