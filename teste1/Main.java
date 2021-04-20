package br.com.teste1;

import java.util.ArrayList;
import br.com.teste1.Sexo;

public class Main {

	public Analista criarAnalista(Integer numeroCarteriraTrabalho, Integer salario, Sexo genero) {
		return new Analista(numeroCarteriraTrabalho, salario, genero);

	}

	public Estagiario criarEstagiario(String numeroContrato, Integer salario, Sexo genero) {
		return new Estagiario(numeroContrato, salario, genero);
	}

	public Gerente criarGerente(Setores setor, Integer salario, Sexo genero) {
		return new Gerente(setor, salario, genero);
	}

	public ArrayList<Funcionario> listaFuncionario() {
		Main main = new Main();
		ArrayList<Funcionario> list = new ArrayList<>();
		list.add(main.criarAnalista(55552222, 2000, Sexo.MASCULINO));
		list.add(main.criarEstagiario("333999", 1000, Sexo.FEMININO));
		list.add(main.criarAnalista(121212, 3000, Sexo.MASCULINO));
		list.add(main.criarEstagiario("01010101", 500, Sexo.MASCULINO));

		list.add(main.criarGerente(Setores.RH, 10000, Sexo.FEMININO));
		list.add(main.criarGerente(Setores.ALMOCHARIFADO, 8000, Sexo.MASCULINO));

		return list;
	}

	public Integer pegarSalarioAnalista(Analista analistaQualquer) {
		return analistaQualquer.getSalario();
	}

	public static void main(String[] args) {

		Main main = new Main();

		Estagiario celo = main.criarEstagiario("3030", 500, Sexo.MASCULINO);
		Analista analistaTiago = main.criarAnalista(202020, 5000, Sexo.FEMININO);
		Gerente gerente = main.criarGerente(Setores.ADMINISTRATIVO, 12000, Sexo.MASCULINO);
		System.out.println(analistaTiago.getNumeroCarteriraTrabalho() + " " + analistaTiago.getSalario());
		System.out.println(main.pegarSalarioAnalista(analistaTiago));

		System.out.println();
		System.out.println(analistaTiago.horas(8, 26));
		System.out.println(celo.horas(4, 20));

		System.out.println(gerente.getGenero());

		ArrayList<Funcionario> func = main.listaFuncionario();

		func.add(celo);
		func.add(analistaTiago);
		func.add(gerente);

		System.out.println(celo.getNumeroContrato() + "	" + celo.getSalario() + "	" + celo.getGenero());
		System.out.println(analistaTiago.getNumeroCarteriraTrabalho() + "	" + analistaTiago.getSalario() + "	"
				+ analistaTiago.getGenero());
		System.out.println(gerente.getSetor() + "	" + gerente.getSalario() + "	" + gerente.getGenero());

		

	}
}
