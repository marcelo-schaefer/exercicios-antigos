package br.com.teste1;

public class Gerente implements Funcionario, HorasTrabalhadas {

	private Setores setor;
	private Integer salario;
	private Sexo genero;

	public Setores getSetor() {
		return setor;
	}

	public void setSetor(Setores setor) {
		this.setor = setor;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Sexo getGenero() {
		return genero;
	}

	public void setGenero(Sexo genero) {
		this.genero = genero;
	}

	@Override
	public Integer horas(Integer horasPorDia, Integer diasPorMes) {
		return horasPorDia * diasPorMes;
	}

	@Override
	public void trabalhar() {
		System.out.println("trabalhando como gerente");
	}

	@Override
	public void almocar() {
		System.out.println("almocando");
	}

	public Gerente(Setores setor, Integer salario, Sexo genero) {
		this.setor = setor;
		this.salario = salario;
		this.genero = genero;
	}

}
