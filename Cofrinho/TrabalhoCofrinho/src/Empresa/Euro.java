package Empresa;

//Extenção da Classe Mâe (Moeda)

public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}

	
	// Converte o Euro para Real
	
	@Override
	public double converterparaReal() {
		
		// Cotação do Euro em Reais
		
		return this.valor * 6.22; // Cotação do Euro em Reais
	}

	@Override
	public void info() {

		System.out.println("Euro - € " + valor);
		
	}

}
