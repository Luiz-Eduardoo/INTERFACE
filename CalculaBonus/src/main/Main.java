package main;

public class Main {

	public static void main(String[] args) {
		// criando novo objeto dando valor aos atributos
		FuncionarioAssalariado fa1 = new FuncionarioAssalariado(1412);
		FuncionarioHorista fh1 = new FuncionarioHorista(80);
		// informa o salario dos funcionarios
		fa1.calcularBonus();
		fh1.calcularBonus();

	}

}
