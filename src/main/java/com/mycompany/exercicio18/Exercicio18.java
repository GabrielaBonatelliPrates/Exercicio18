
package com.mycompany.exercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio18 {

    public static void main(String[] args) {
String calculadora, nome;
        double resultado;
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        calculadora = JOptionPane.showInputDialog("Qual a categoria do produto?"
                + " \n A - 10% \n B - 15% \n C - 20% \n D - 25% \n E - 50%");
        
        switch (calculadora) {
            case "A":
                resultado = preco - (preco * 0.10);
                JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
                break;
            case "B":
                resultado = preco - (preco * 0.15);
                JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
                break;
            case "C":
                resultado = preco - (preco * 0.20);
                JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
                break;
            case "D":
                resultado = preco - (preco * 0.25);
                JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
                break;
                 case "E":
                resultado =preco - (preco * 0.50);
                JOptionPane.showMessageDialog(null, "O valor a pagar é: " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! ");
                break;
        }
    }

}