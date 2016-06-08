/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_calculadora;

//import static exercício_calculadora.Exercício_calculadora.divisao;
//import static exercício_calculadora.Exercício_calculadora.limpar;
//import static exercício_calculadora.Exercício_calculadora.multiplicacao;
//import static exercício_calculadora.Exercício_calculadora.soma;
//import static exercício_calculadora.Exercício_calculadora.subtracao;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kaio.teixeira
 */
public class Menu {
    static final int soma = 1;
    static final int subtrai = 2;
    static final int multiplica = 3;
    static final int divide = 4;
    static final int limpa = 5;
    static final int sai = 6;
    //Trata a opção selecionada e chama o método referente a opção
    public static void menu(){
        int opcao = 0;
        int estadoMemoria = 0;
        
        do{
            opcao=mostraMenu(estadoMemoria);
            switch (opcao){
                
                case soma:{
                    estadoMemoria = soma(estadoMemoria);
                    break;
                }
                
                case subtrai:{
                    estadoMemoria = subtracao(estadoMemoria);
                    break;
                }
                
                case multiplica:{
                    estadoMemoria = multiplicacao(estadoMemoria);
                    break;
                }
                
                case divide:{
                    estadoMemoria = divisao(estadoMemoria);
                    break;
                }
                case limpa:{
                    estadoMemoria = limpar();
                    break;
                }
                
                case sai:{
                    break;
                }                    
            }
            
        }while (opcao!=6);
        }
  
    // Mostra as opções
    public static int mostraMenu(int estadoMemoria){
        int opcao = 0;
       
        do{
        System.out.println("Estado da memória: "+ estadoMemoria);
        System.out.println("Opções: ");
        System.out.println("\n(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do Programa");
        System.out.print("Selecione: ");
        Scanner ler = new Scanner(System.in);
        try{
            opcao = ler.nextInt();
            if (opcao>6){
                JOptionPane.showMessageDialog(null, "Opção não disponível!");
            }
        }
        catch(InputMismatchException e){
            
            JOptionPane.showMessageDialog(null, "Caracter Inválido!");
        }
        }
        while (opcao<1 || opcao >6);
        return opcao;
    }
    
    
    
    // Métodos referente as opções
    public static int soma(int estadoMemoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para somar: ");
        valor = ler.nextInt();
        return estadoMemoria + valor;
        
    }
     public static int subtracao(int estadoMemoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para subtrair: ");
        valor = ler.nextInt();
        return estadoMemoria - valor;
        
    }
      public static int multiplicacao(int estadoMemoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para multiplicar: ");
        valor = ler.nextInt();
        return estadoMemoria * valor;
        
    }
      public static int divisao(int estadoMemoria){
        int resultado =0,valor =0;
        boolean valido = true;
        Scanner ler = new Scanner(System.in);
        do{
            System.out.print("Digite o valor para dividir: ");
            
                valor = ler.nextInt();
 
        try{
             resultado = estadoMemoria / valor;
        }
        catch(ArithmeticException a){
                System.out.println("Não é possível dividir por 0");
                valido = false;
            }
        }while (valido = false);
      return resultado;
      }
      public static int limpar(){
        return 0;
      }
}
