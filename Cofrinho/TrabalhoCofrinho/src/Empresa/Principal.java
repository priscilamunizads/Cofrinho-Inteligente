package Empresa;

import java.util.Scanner;

// Public todos tem acesso

public class Principal {
	
    public static void main(String[] args) {
    	
    	
    	
        Scanner sc = new Scanner(System.in);
        
        Cofrinho cofrinho = new Cofrinho();

        int opcao = -1;
        
        // Estrutura de Repetição (Enquanto)

        while (opcao != 0) {
            
            System.out.println("\nCofrinho:\n");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("0 - Encerrar");
            System.out.print("\nEscolha uma opção: \n");

            // Ocorreu erro, informe outro valor
            
            try {
            	   opcao = Integer.parseInt(sc.nextLine());
             
            } catch (NumberFormatException e) {
          
                continue;
            }

            switch (opcao) {
            
         // Adiciona moeda
            
                case 1: 
                	
                    System.out.println("\nEscolha a moeda: \n");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    System.out.print("\nTipo: ");
                    float tipo;
                    try {
                        tipo = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida.");
                        break;
                    }
                    
                    // Informar o valor da moeda

                    System.out.print("\nDigite o valor:\n");
                    double valor;
                    try {
                        valor = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido.");
                        break;
                    }

                    // Se for True
                    
                    if (tipo == 1) {
                        cofrinho.adicionar(new Real(valor));    // Adiciona a classe Real
                    } else if (tipo == 2) {
                        cofrinho.adicionar(new Dolar(valor));   // Adiciona a classe Dolar
                    } else if (tipo == 3) {
                        cofrinho.adicionar(new Euro(valor));    // Adiciona a classe Euro
                   
                    // Senão (Se for false)
                        
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;
                    
                 // Remove a moeda

                case 2: 
                    System.out.print("Informe a opção a ser removida: \n");
               
                    break;
                    
                 // Lista todas as moedas

                case 3: 
                    cofrinho.listar(); 
                    break;

                 // Calcula o total convertido para Real
                    
                case 4: 
                    double total = cofrinho.totalConvertido(); 
                    System.out.println("\nTotal em R$: " +total);
                    break;

                 // Encerra o programa
                    
                case 0: 
                    System.out.println("Encerrando...");
                    break;
                    
                 // Se digitar errado, aparece opção inválida

                default: 
                    System.out.println("\nOpção inválida.\n");
                    break;
            } 
        } 

        sc.close();
    }
}
					
				