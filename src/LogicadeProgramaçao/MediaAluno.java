package LogicadeProgramaçao;
import java.util.Scanner;
public class MediaAluno {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double Media = 0.0, Nota1, Nota2, Nota3;
        System.out.println("Digite a primeira nota: ");
        Nota1 = S.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Nota2 = S.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Nota3 = S.nextDouble();
        Media = (Nota1 + Nota2 + Nota3) / 3;
        System.out.println("A média do aluno é: " + Media);
        if (Media >= 6.0) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
        S.close();
    }
}
