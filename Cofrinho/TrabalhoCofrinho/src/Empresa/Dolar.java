package Empresa;

//Extenção da Classe Mâe (Moeda)

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
	}

	// Converte o Dolar para Real
	
	@Override
	public double converterparaReal() {
		
	// Cotação do Dolar em Reais
		
		return this.valor * 5.36; 
		
	}

	@Override
	public void info() {

		System.out.println("Dolar - US$ " + valor);
		
	}

}
