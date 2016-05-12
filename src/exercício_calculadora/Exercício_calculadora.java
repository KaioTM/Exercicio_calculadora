/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_calculadora;

import java.util.Scanner;

/**
 *
 * @author kaio.teixeira
 */
public class Exercício_calculadora {
    static final int soma = 1;
    static final int subtrai = 2;
    static final int multiplica = 3;
    static final int divide = 4;
    static final int limpa = 5;
    static final int sai = 6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao,estado_memoria = 0;
        
        do{
            System.out.println("Estado da memória: "+ estado_memoria);
            opcao=mostra_menu();
            switch (opcao){
                
                case soma:{
                    estado_memoria = soma(estado_memoria);
                    break;
                }
                
                case subtrai:{
                    estado_memoria = subtracao(estado_memoria);
                    break;
                }
                
                case multiplica:{
                    estado_memoria = multiplicacao(estado_memoria);
                    break;
                }
                
                case divide:{
                    estado_memoria = divisao(estado_memoria);
                    break;
                }
                case limpa:{
                    estado_memoria = limpar();
                    break;
                }
                
                case sai:{
                    break;
                }
                default:
                    System.out.println("Comando inválido! Miseravi");
            }
            
        }while (opcao!=6);
       
    }
    
    public static int mostra_menu(){
        int opcao;
        //System.out.println("Estado da memória: "+ estado_memoria);
        System.out.println("Opções: ");
        System.out.println("\n(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do Programa");
        System.out.print("Selecione: ");
        Scanner ler = new Scanner(System.in);
        opcao = ler.nextInt();
        
        return opcao;
    }
    
    public static int soma(int estado_memoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para somar: ");
        valor = ler.nextInt();
        return estado_memoria + valor;
        
    }
     public static int subtracao(int estado_memoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para subtrair: ");
        valor = ler.nextInt();
        return estado_memoria - valor;
        
    }
      public static int multiplicacao(int estado_memoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para multiplicar: ");
        valor = ler.nextInt();
        return estado_memoria * valor;
        
    }
      public static int divisao(int estado_memoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para dividir: ");
        valor = ler.nextInt();
        return estado_memoria / valor;
        
    }
       public static int limpar(){
        return 0;
        
    }
    
}
