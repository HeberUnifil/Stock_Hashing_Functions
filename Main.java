import java.util.ArrayList;
import java.util.Objects;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        int state= 9;
        Scanner sc = new Scanner(System.in);
        Vetor vnome = new Vetor<String>(70);
        Vetor vcodigo = new Vetor<Long>(70);
        Vetor vtamanho = new Vetor<Double>(70);

        while(state!=0){
            if(state==9){
                System.out.println("Qual é o tipo de dado a ser manipulado?");
                System.out.println("1 - Nome");
                System.out.println("2 - Código");
                System.out.println("3 - Tamanho (centimetros quadrados)");
                System.out.println("0 - Sair");

                int response1 = sc.nextInt();
                if(response1==0){
                    state=0;

                } else if (response1==1) {
                    System.out.println("Que tipo de tarefa deseja efetuar?");
                    System.out.println("1 - Inserção");
                    System.out.println("2 - Busca");
                    System.out.println("3 - Deleção");
                    System.out.println("9 - voltar");
                    System.out.println("0 - Sair");
                    int response2 = sc.nextInt();
                    if(response2==1){
                        System.out.println("Qual é o nome do objeto a ser inserido?");
                        System.out.println("9 - voltar");
                        String response3 = sc.next();
                        if (response3!="9"){
                            vnome.insert(response3);

                        }
                    }
                }
            }
        }
    }
}
