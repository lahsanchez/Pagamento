public class TesteSalarioBruto {
	public static void main(String[] args) {
		Salario calculosalario = new Salario (40, 150.0, 3);
		System.out.println("Salario Bruto: " +
				calculosalario.calculoSalarioBruto());
		System.out.println("Desconto INSS: " +
				calculosalario.calculoDescontoInss());
		System.out.println("Imposto de Renda: " +
				calculosalario.calculoImpostoRenda());
		System.out.println("Salario L�quido: " +
				calculosalario.calculoSalarioLiquido());
	}
}
