package main;

// classe FuncionarioAssalariado que implementa a interface Funcionario
public class FuncionarioAssalariado implements Funcionario {
	// atributo necessário
	private float salario;

	// metodo construtor
	public FuncionarioAssalariado(float salario) {
		this.salario = salario;
	}
	// método get para acessar o atributo
	public float getSalario() {
		return salario;
	}
	// método set para modificar o valor do atributo
	public void setSalario(float salario) {
		if(salario <= 0) { // se o salario for abaixo ou igual a 0 ele vai dar exceção
			throw new IllegalArgumentException("O valor do salario deve ser acima de 0");
		}
		this.salario = salario;
	}
	// metodo calcularbonus implementado da interface funcionario com os calculos específicos
	@Override
	public void calcularBonus() {
		float bonusSalario = 5000; // atributo com o valor do bonus do funcionario
		// informa o salario do funcionario
		System.out.println("O bonus salarial do funcionario é: " + bonusSalario);
		
	}
	
	
	
}
