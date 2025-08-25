import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nome;

        float horas, valor, salario;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        horas = input.nextFloat();
        System.out.println("Digite seu valor: ");
        valor = input.nextFloat();

        salario = horas * valor;

        System.out.println(" O funcionario " + nome + " trabalhou " + horas
        + " horas e recebeu R$ " + salario);
    }

}
