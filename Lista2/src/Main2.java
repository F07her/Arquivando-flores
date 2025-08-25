import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        String nome;
        int qtde, pagto;
        float preço;

        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome1 = entrada1.nextLine();

        System.out.println("Digite a qtde");
        qtde = entrada1.nextInt();
        System.out.println("Digite preço informado");
        preço = entrada1.nextFloat();
        System.out.println("Digite sua forma pgto: 1.Pix 2.Cartão 3.Boleto");
        pagto = entrada1.nextInt();

        float subtotal = preço * qtde;
        float subtotalcomdesconto = subtotal;
        float total;

        if (subtotal>= 100 && subtotal < 300) {
            subtotalcomdesconto = subtotal -  subtotal*5/100;
        }
        else if (subtotal >= 300 ) {

            subtotalcomdesconto = subtotal -  subtotal*10/100;
        }

        switch (pagto) {
            case 1: total=subtotalcomdesconto - subtotalcomdesconto*2/100;
            break;

            case 2: total= (float) (subtotalcomdesconto + subtotalcomdesconto*1.5/100);
            break;

            case 3: total= subtotalcomdesconto;
            break;
            default: total = subtotalcomdesconto;
        }

        System.out.printf("Nome: " + nome + " qtde" + qtde + "Preço" + preço
        + "subtotal" + subtotal + "subtotalcomdesconto" + subtotalcomdesconto
        + " total" + total);
    }
}
