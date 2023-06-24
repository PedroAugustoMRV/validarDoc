/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.calculomedia;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class validacaoDoc {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static boolean validarCPF(String cpf) {
        
        if (cpf.length() != 11) {
            return false;
        }
        
        int[] numeros = new int[11];
        int[] valida1N = {10,9,8,7,6,5,4,3,2};
        int[] valida2N = {11,10,9,8,7,6,5,4,3,2};
        
        int soma = 0;
        int resultado = 0;
        int resto = 0;
        
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
            System.out.printf("%d \n", numeros[i]);
        }
        
        for (int i = 0; i < valida1N.length; i++){
            soma += numeros[i] * valida1N[i];
        }
        resultado = 11 - (soma % 11);
        System.out.println(resultado);
        
        return true;
    }

    
    public static boolean validarCNPJ(String cnpj){
      
        
    }
}
