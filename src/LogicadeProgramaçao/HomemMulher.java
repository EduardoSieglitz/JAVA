import java.util.Scanner;

public class HomemMulher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sexo, qtHomens=0, qtMulher = 0;
        float altura, somaH=0, mediaH=0, maior=0, menor=999999999, somaM=0, mediaM=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha o sexo: ");
            System.out.println("1 - Mulher");
            System.out.println("2 - Homem");
            System.out.println("Digite umas das opções: ");
            sexo = s.nextInt();
            System.out.print("Digite a altura: ");
            altura = s.nextFloat();
            if (sexo == 1) {
                qtMulher++;
                somaM = somaM + altura;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            } else {
                System.out.println("Escolha umas das opções");
            }
            mediaH = somaH / qtHomens;
            mediaM = somaM / qtMulher;
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor){
                menor = altura;
            }
        }
        System.out.println("A maior altura: " + maior + "m");
        System.out.println("A menor altura: " + menor + "m");
        System.out.println("A média de altura dos homens: " + mediaH + " m");
        System.out.println("A média de altura dos mulheres: " + mediaM + " m");
        s.close();
    }
}