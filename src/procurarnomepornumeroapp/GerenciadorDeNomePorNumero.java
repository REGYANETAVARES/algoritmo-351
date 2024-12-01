/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procurarnomepornumeroapp;



import java.util.Scanner;

public class GerenciadorDeNomePorNumero {

    // Método principal da lógica
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Entrada de nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicitação do número
        int num;
        do {
            System.out.print("\nDigite o número da pessoa (1 a 5): ");
            num = scanner.nextInt();

            if (num < 1 || num > 5) {
                System.out.println("Número fora do intervalo. Tente novamente.");
            }
        } while (num < 1 || num > 5);

        // Exibe o nome correspondente
        System.out.println("\nO nome correspondente ao número " + num + " é: " + nomes[num - 1]);
    }
}
