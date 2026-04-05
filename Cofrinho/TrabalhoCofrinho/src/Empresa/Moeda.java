package Empresa;

// Classe mãe (Moeda)

public abstract class Moeda {
	
	double valor;
	
	public Moeda (double valor) {
		this.valor = valor;
		
	}

	// Calcula valor convertido para Real
	
	public abstract double converterparaReal();
	
	public abstract void info();
}
