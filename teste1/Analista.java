package br.com.teste1;

public class Analista implements Funcionario, HorasTrabalhadas {

	private Integer numeroCarteriraTrabalho;
	private Integer salario;
	private Sexo genero;

	public Sexo getGenero() {
		return genero;
	}

	public void setGenero(Sexo genero) {
		this.genero = genero;
	}

	public Integer getNumeroCarteriraTrabalho() {
		return numeroCarteriraTrabalho;
	}

	public void setNumeroCarteriraTrabalho(Integer numeroCarteriraTrabalho) {
		this.numeroCarteriraTrabalho = numeroCarteriraTrabalho;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Analista(Integer numeroCarteriraTrabalho, Integer salario, Sexo genero) {
		this.numeroCarteriraTrabalho = numeroCarteriraTrabalho;
		this.salario = salario;
		this.genero = genero;
	}

	@Override
	public void trabalhar() {
		System.out.println("trabalhando como analista");
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
