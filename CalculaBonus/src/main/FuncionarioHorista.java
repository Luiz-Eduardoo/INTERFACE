package main;

//classe FuncionarioHorista que implementa a interface Funcionario
public class FuncionarioHorista implements Funcionario {
	// atributo necessário
	private float horaSalario;
	
	// metodo construtor
	public FuncionarioHorista(float horaSalario) {
		this.horaSalario = horaSalario;
	}
	// método get para acessar o atributo
	public float getHoraSalario() {
		return horaSalario;
	}

	// método set para modificar o valor do atributo
	public void setHoraSalario(float horaSalario) {
		if(horaSalario <= 0) { // se o salario for abaixo ou igual a 0 ele vai dar exceção
			throw new IllegalArgumentException("O valor do salario deve ser acima de 0");
		}
		this.horaSalario = horaSalario;
	}

	// metodo calcularbonus implementado da interface funcionario com os calculos específicos
	@Override
	public void calcularBonus() {
		float calculoSalario = 0.1f;  // atributo com a porcentagem do bonus do funcionario
		float salarioDiario = horaSalario * 8;
		float salarioMensal = salarioDiario * 20;
		float salarioAnual = salarioMensal * 12;// atributo que guarda o calculo do salario anual do funcionario
		float bonusSalario = salarioAnual * calculoSalario; // atributo que realiza o calculo do bonus e guarda o resultado
		// informa o salario do funcionario
		System.out.println("O bonus salarial do funcionario é: " + bonusSalario);
		
		
	}

}
