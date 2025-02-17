import java.util.Scanner;

public class CalculadoraTbm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber dados do usuário
        System.out.println("Bem-vindo à Calculadora de Metabolismo Basal!");
        System.out.print("Digite o seu sexo (M para masculino / F para feminino): ");
        char sexo = scanner.next().charAt(0);
        
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura em cm: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite a sua idade em anos: ");
        int idade = scanner.nextInt();

        // Calcular o BMR com base no sexo
        double bmr = 0;

        if (sexo == 'M' || sexo == 'm') {
            // Fórmula para homens
            bmr = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade);
        } else if (sexo == 'F' || sexo == 'f') {
            // Fórmula para mulheres
            bmr = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade);
        } else {
            System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
            return;
        }

        // Exibir o resultado
        System.out.printf("Seu metabolismo basal é: %.2f calorias por dia.\n", bmr);
        
        scanner.close();
    }
}
