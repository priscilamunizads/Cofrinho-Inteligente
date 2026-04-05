package Empresa;

//Extenção da Classe Mâe (Moeda)

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}

// Moeda já está em Real
	
	@Override
	public double converterparaReal() {
		
		
		
		return this.valor;
	}

	@Override
	public void info() {

		System.out.println("Real - R$ " + valor);
		
	}

}
