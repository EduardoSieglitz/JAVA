package logicadeprogramaçao;
import java.util.Scanner;
public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int Escolha = scanner.nextInt();
        double Temperatura, Resultado;
        switch (Escolha) {
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                Temperatura = scanner.nextDouble();
                Resultado = celsiusParaFahrenheit(Temperatura);
                System.out.println("A temperatura em Fahrenheit é: " + Resultado);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit:");
                Temperatura = scanner.nextDouble();
                Resultado = fahrenheitParaCelsius(Temperatura);
                System.out.println("A temperatura em Celsius é: " + Resultado);
                break;
            default:
                System.out.println("Escolha 1 ou 2.");
                break;
        }
        scanner.close();
    }
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
