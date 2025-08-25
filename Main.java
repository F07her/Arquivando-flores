import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner Leitor = new Scanner(System.in);
        System.out.println("Digite seus dados de funcionario");


        System.out.println("Digite seu nome: ");
        String nome = Leitor.next();
        System.out.println("Digite s quantidade de horas trabalhadas ");
        float horas = Leitor.nextFloat();
        System.out.println("Digite o valor da hora trabalhada");
        float valor = Leitor.nextFloat();
        System.out.println("Seu salario é: ");
        float salario = horas * valor;

        System.out.println("Funcionario " + nome + "trabalhou " + horas + "e recebera " + salario );



    }
}