/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author fsociety
 */
public class ContadorWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
            int contador = limite;
            while (contador >= 0) {
                System.out.println(contador);
                contador--;
            }

            System.out.println("Fim do contador regressivo\n");
            contador = 0;
            do {
                System.out.println(contador);
                contador++;
            } while (contador <= limite);
            System.out.println("Fim do contador progressivo");
        } catch (NumberFormatException erro) {
            System.out.println("Não foi fornecido um número inteiro válido!\n"
                    + erro.toString());
        }
        System.exit(0);

    }

}
