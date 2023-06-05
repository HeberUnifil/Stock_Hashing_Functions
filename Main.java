import java.util.*;

public class Main {
    public static void main(String[] args) {
        int state = 9;
        Scanner sc = new Scanner(System.in);
        Vetor<String> vnome = new Vetor<String>(70);
        Vetor<Long> vcodigo = new Vetor<Long>(70);
        Vetor<Double> vtamanho = new Vetor<Double>(70);

        while (state != 0) {
            if (state == 9) {
                System.out.println("Qual é o tipo de dado a ser manipulado?");
                System.out.println("1 - Nome");
                System.out.println("2 - Código");
                System.out.println("3 - Tamanho (centimetros quadrados)");
                System.out.println("0 - Sair");

                int response1 = sc.nextInt();
                int response2;
                String responseString;
                long responseLong;
                double responseDouble;

                switch (response1) {
                    case 0:
                        state = 0;
                        break;

                    case 1:
                        System.out.println("Que tipo de tarefa deseja efetuar?");
                        System.out.println("1 - Inserção");
                        System.out.println("2 - Busca");
                        System.out.println("3 - Deleção");
                        System.out.println("4 - Mostrar todos");
                        System.out.println("9 - voltar");
                        System.out.println("0 - Sair");
                        response2 = sc.nextInt();

                        switch (response2) {
                            case 1:
                                System.out.println("Qual é o nome do objeto a ser inserido?");
                                System.out.println("9 - voltar");
                                responseString = sc.next();
                                if (Objects.equals(responseString, "9")) {
                                    break;

                                } else {
                                    vnome.insert(responseString);
                                }
                                break;

                            case 2:
                                System.out.println("Qual é o nome do objeto a ser buscado?");
                                System.out.println("9 - voltar");
                                responseString = sc.next();
                                if (Objects.equals(responseString, "9")) {
                                    break;

                                } else {
                                    vnome.find(responseString);
                                }
                                break;

                            case 3:
                                System.out.println("Qual é o nome do objeto a ser apagado?");
                                System.out.println("9 - voltar");
                                responseString = sc.next();
                                if (Objects.equals(responseString, "9")) {
                                    break;

                                } else {
                                    vnome.delete(responseString);
                                }
                                break;

                            case 4:
                                vnome.show();
                                break;

                            case 0:
                                state = 0;
                                break;

                        }
                        break;

                    case 2:

                        System.out.println("Que tipo de tarefa deseja efetuar?");
                        System.out.println("1 - Inserção");
                        System.out.println("2 - Busca");
                        System.out.println("3 - Deleção");
                        System.out.println("4 - Mostrar todos");
                        System.out.println("9 - voltar");
                        System.out.println("0 - Sair");

                        response2 = sc.nextInt();
                        switch (response2) {
                            case 1:
                                System.out.println("Qual é o código do objeto a ser inserido?");
                                System.out.println("9 - voltar");
                                responseLong = sc.nextLong();
                                if (responseLong == 9) {
                                    break;

                                } else {
                                    vcodigo.insert(responseLong);
                                }
                                break;

                            case 2:
                                System.out.println("Qual é o código do objeto a ser buscado?");
                                System.out.println("9 - voltar");
                                responseLong = sc.nextLong();
                                if (responseLong == 9) {
                                    break;

                                } else {
                                    vcodigo.find(responseLong);
                                }
                                break;

                            case 3:
                                System.out.println("Qual é o código do objeto a ser apagado?");
                                System.out.println("9 - voltar");
                                responseLong = sc.nextLong();
                                if (responseLong == 9) {
                                    break;

                                } else {
                                    vcodigo.delete(responseLong);
                                }
                                break;

                            case 4:
                                vnome.show();
                                break;

                            case 0:
                                state = 0;
                                break;

                        }
                        break;

                    case 3:
                        System.out.println("Que tipo de tarefa deseja efetuar?");
                        System.out.println("1 - Inserção");
                        System.out.println("2 - Busca");
                        System.out.println("3 - Deleção");
                        System.out.println("4 - Mostrar todos");
                        System.out.println("9 - voltar");
                        System.out.println("0 - Sair");

                        response2 = sc.nextInt();
                        switch (response2) {
                            case 1:
                                System.out.println("Qual é o tamanho do objeto a ser inserido?");
                                System.out.println("9 - voltar");
                                responseDouble = sc.nextDouble();
                                if (responseDouble == 9) {
                                    break;

                                } else {
                                    vtamanho.insert(responseDouble);
                                }
                                break;

                            case 2:
                                System.out.println("Qual é o tamanho do objeto a ser buscado?");
                                System.out.println("9 - voltar");
                                responseDouble = sc.nextDouble();
                                if (responseDouble == 9) {
                                    break;

                                } else {
                                    vtamanho.find(responseDouble);
                                }
                                break;

                            case 3:
                                System.out.println("Qual é o tamanho do objeto a ser apagado?");
                                System.out.println("9 - voltar");
                                responseDouble = sc.nextDouble();
                                if (responseDouble == 9) {
                                    break;

                                } else {
                                    vtamanho.delete(responseDouble);
                                }
                                break;

                            case 4:
                                vtamanho.show();
                                break;

                            case 0:
                                state = 0;
                                break;

                        }
                        break;
                }
            }
        }
    }
}
