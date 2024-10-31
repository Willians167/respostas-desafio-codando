
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class RespostaDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a frase invertida de Yoda:");
        String fraseYoda = scanner.nextLine();

        String[] palavras = fraseYoda.split(" ");
        Collections.reverse(Arrays.asList(palavras));
        String fraseCorrigida = String.join(" ", palavras);

        System.out.println("Frase corrigida de Yoda: " + fraseCorrigida);

        String[] licoes = new String[3];
        System.out.println("\nAgora, compartilhe três lições que você aprendeu como Padawan:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Lição " + (i + 1) + ": ");
            licoes[i] = scanner.nextLine();
        }

        System.out.println("\nSeus aprendizados como Padawan:");
        for (int i = 0; i < licoes.length; i++) {
            System.out.println((i + 1) + ". " + licoes[i]);
        }

        scanner.close();
    }
}


