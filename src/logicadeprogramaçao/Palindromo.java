package LogicadeProgramaçao;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String Palavra = "", Palindromo = "";
        char Letra;
        System.out.println("Digite uma palavra: ");
        Palavra = S.next();
        int Tamanho = Palavra.length();
        for(int i = Tamanho - 1; i >= 0 ;i--){
            Letra = Palavra.charAt(i);
            if(Letra == Palavra.charAt(i)){
                Palindromo += Letra;
            }
        }
        if(Palindromo.equals(Palavra)){
            System.out.print("É palíndroma");
        }else{
            System.out.print("Não é palíndroma");
        }
        S.close();
    }
}