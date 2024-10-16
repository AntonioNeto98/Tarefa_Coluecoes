package ArrayNomes;

import java.util.Arrays;
import java.util.Scanner;

public class NomesArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome com , ");

        String nome = s.nextLine();
        String[] nomes = nome.trim().split(",");

        Arrays.sort(nomes);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
