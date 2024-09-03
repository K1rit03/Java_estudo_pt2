import java.util.Scanner;

public class estudo {
    public static void main(String[] arg) {
        int base, altura, area;
        Scanner entrada_dado = new Scanner(System.in);
        try {
            System.out.print("Digite o valor da base");
            base = entrada_dado.nextInt();
            System.out.print("Digite o valor da altura");
            altura = entrada_dado.nextInt();
            area = base * altura;
            System.out.print("\nArea do Quadrilatero = " + area);
        } finally {
            entrada_dado.close();
        }

    }
}