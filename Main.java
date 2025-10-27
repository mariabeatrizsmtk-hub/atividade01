import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Escolar!");

        // Pede o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        double[] notas = new double[8];

        // Pede as notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // Calcula médias bimestrais
        double mediaBim1 = (notas[0] + notas[1]) / 2;
        double mediaBim2 = (notas[2] + notas[3]) / 2;
        double mediaBim3 = (notas[4] + notas[5]) / 2;
        double mediaBim4 = (notas[6] + notas[7]) / 2;

        // Calcula médias semestrais
        double mediaSem1 = (mediaBim1 + mediaBim2) / 2;
        double mediaSem2 = (mediaBim3 + mediaBim4) / 2;

        // Calcula média final
        double mediaFinal = (mediaSem1 + mediaSem2) / 2;

        // Mostra resultados
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("1º semestre: %.2f%n", mediaSem1);
        System.out.printf("2º semestre: %.2f%n", mediaSem2);
        System.out.printf("Média final: %.2f%n", mediaFinal);

        // Diz situação do aluno
        if (mediaFinal >= 7) {
            System.out.println("Situação: Aprovado! ");
        } else if (mediaFinal >= 5) {
            System.out.println("Situação: Recuperação ");
        } else {
            System.out.println("Situação: Reprovado ");
        }

        System.out.println("\nObrigado por usar o Sistema Escolar!");
        entrada.close();
    }
}


