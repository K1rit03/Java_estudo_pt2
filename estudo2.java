import java.util.Scanner;

public class estudo2 {
    public static void main(String[] arg) {
        int A, B, MAIOR, MENOR;
        Scanner entrada_dado = new Scanner(System.in);
        try {
            System.out.print("Digite dois numeros inteiros: ");
            A = entrada_dado.nextInt();
            B = entrada_dado.nextInt();
            if (A > B) {
                MAIOR = A;
                MENOR = B;
            } else {
                MAIOR = B;
                MENOR = A;

            }
            System.out.print("\nNumeros lidos: " + A + "e" + B);
            System.out.print("Maior =" + MAIOR);
            System.out.print("Menor =" + MENOR);

        } finally {
            entrada_dado.close();
        }

    }

}
