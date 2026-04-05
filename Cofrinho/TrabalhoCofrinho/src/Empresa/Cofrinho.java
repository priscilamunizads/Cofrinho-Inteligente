package Empresa;

import java.util.ArrayList;

public class Cofrinho {
	
	// Não consegue acessar em outras classes apenas nessa
	
	private ArrayList<Moeda> listaMoeda = new ArrayList<>();
	
	// Adiciona Moeda 
	
	public void adicionar(Moeda m) {
		listaMoeda.add(m);
		
	}
	
	// Remove Moeda
	
		public boolean remover(Moeda m) {
			return listaMoeda.remove(m);
	}

		
		// Lista todas as Moedas
		
		public void listar() {
			for (Moeda m: listaMoeda) {
	
			
			System.out.println("Moeda no Cofrinho");

			}
		}
		
		// Calcula o total convertido da moeda 
		
		public double totalConvertido() {
			double soma = 0;
			for (Moeda m: listaMoeda) {
				soma += m.converterparaReal();
			}
			return Math.round(soma*100.00)/100.00;
			
		}
}
