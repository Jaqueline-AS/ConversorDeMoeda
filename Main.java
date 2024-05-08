import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        Converter converter = new Converter();

        while (running) {
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

            int opcaoEntrada = scanner.nextInt();
            double valorDolar;
            double valorPesoArgentino;
            double valorPesoColombiano;
            double valorRealBrasileiro;

            switch (opcaoEntrada) {
                case 1:
                    System.out.println("Digite o valor em dólar: ");
                    valorDolar = scanner.nextDouble();
                    valorPesoArgentino = converter.converterDolarParaPesoArgentino(valorDolar);
                    System.out.println("Valor $" + valorDolar + " corresponde ao valor de =>> " + valorPesoArgentino + " Peso Argentino");
                    break;
                case 2:
                    System.out.println("Digite o valor em Peso argentino: ");
                    valorPesoArgentino = scanner.nextDouble();
                    valorDolar = converter.converterPesoArgentinoParaDolar(valorPesoArgentino);
                    System.out.println("Valor $" + valorPesoArgentino + " corresponde ao valor de =>> " + valorDolar + " Dólar");

                    break;
                case 3:
                    System.out.println("Digite o valor em dólar: ");
                    valorDolar = scanner.nextDouble();
                    valorRealBrasileiro = converter.converterDolarParaRealBrasileiro(valorDolar);
                    System.out.println("Valor $" + valorDolar + " corresponde ao valor de =>> " + valorRealBrasileiro + " Real Brasileiro");

                    break;
                case 4:
                    System.out.println("Digite o valor em Real brasileiro: ");
                    valorRealBrasileiro = scanner.nextDouble();
                    valorDolar = converter.converterRealBrasileiroParaDolar(valorRealBrasileiro);
                    System.out.println("Valor $" + valorRealBrasileiro + " corresponde ao valor de =>> " + valorDolar + " Dólar");


                    break;
                case 5:
                    System.out.println("Digite o valor em dólar: ");
                    valorDolar = scanner.nextDouble();
                    valorPesoColombiano = converter.converterDolarParaPesoColombiano(valorDolar);
                    System.out.println("Valor $" + valorDolar + " corresponde ao valor de =>> " + valorPesoColombiano + " Peso Colombiano");

                    break;
                case 6:
                    System.out.println("Digite o valor em Peso colombiano: ");
                    valorPesoColombiano = scanner.nextDouble();
                    valorDolar = converter.converterPesoColombianoParaDolar(valorPesoColombiano);
                    System.out.println("Valor $" + valorPesoColombiano + " corresponde ao valor de =>> " + valorDolar + " Dólar");

                    break;
                case 7:
                    running = false;
                    System.out.println("Encerrando operação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
        System.out.println("Obrigada por usar o conversor de moeda!");

    }
}
