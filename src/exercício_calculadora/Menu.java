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
public class Menu {
    
    public static void menu(){
        int opcao = 0;
        int estado_memoria = 0;
        
        do{
            System.out.println("Estado da memória: "+ estado_memoria);
            System.out.println("Opções: ");
            System.out.println("/n(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("(5) Limpar memória");
            System.out.println("(6) Sair do Programa");
            
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();
            
            switch (opcao){
                
                case 1:{
                    estado_memoria = soma(estado_memoria);
                    break;
                }
            }
                    
                    
            
            
            
        } while (opcao!=6);
        
    }
    
    public static int soma(int estado_memoria){
        int valor;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor para somar: ");
        valor = ler.nextInt();
        return estado_memoria + valor;
        
    }
}
