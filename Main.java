/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.calculomedia;

import java.util.Scanner;
import static sp.senai.br.calculomedia.validacaoDoc.validarCPF;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static Scanner teclado = new Scanner(System.in);
    public static String CPF;
    public static String CNPJ;
    
    public static void main(String args[])
    {   
       
        System.out.println("Digite o CPF a ser validado: ");
        CPF = teclado.nextLine();

        if (validarCPF(CPF)) 
        {
            System.out.println("CPF válido!");
        } 
        else 
        {
            System.out.println("CPF inválido!");
        }
    	System.exit(0);
		
    }
		
}