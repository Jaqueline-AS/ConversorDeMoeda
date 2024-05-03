import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Converter converter = new Converter();

        while (running)
        System.out.println("\n*******************************************************");
        System.out.println("Seja bem vindo(a) ao conversor de moeda!\n");
        System.out.println("1) Dolar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dolar");
        System.out.println("3) Dólar =>> Real brasileiro");
        System.out.println("4) Real brasileiro ==> Dolar");
        System.out.println("5) Dolar ==> peso colombiano");
        System.out.println("6) Peso colombiano =>> Dolar");
        System.out.println("7) Sair");
        System.out.print("Escolha uma opção válida: ");
        System.out.println("\n*******************************************************");

        int opcaoEntrada = leitura.nextInt();
        double valor;







    }
}
