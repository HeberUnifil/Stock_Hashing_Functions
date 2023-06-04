
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Vetor <T>{
    public int length;
    public T [] vetor;

    public Vetor(int capacidade){
        this.length = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }
    public void insert(T value){
        if(value instanceof Long) {
            this.vetor[hash((long) value)] = value;
        }else if (value instanceof String) {
            this.vetor[hash(codify((String) value))] = value;
        }else if (value instanceof Float) {
        this.vetor[hash(longfy((double) value))] = value;
    }
    }


    public void delete(T value) {
        if (value instanceof Long) {
            this.vetor[hash((long) value)] = null;
        } else if (value instanceof String) {
            this.vetor[hash(codify((String) value))] = null;
        }else if (value instanceof Float) {
            this.vetor[hash(longfy((double) value))] = null;
        }
    }
    private int hash(long value){

        while(value > length){
            value = (int)Math.round(Math.sqrt(value));
        }

        return (int) value;

    }

    public void show(){
        for (int i = 0; i < length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    public void find(T value) {
        if (value instanceof Long) {
            System.out.println("O objeto está localizado no index: "+ (hash((long) value)+1));
        } else if (value instanceof String) {
            System.out.println("O objeto está localizado no index: "+ (hash(codify((String) value))+1));
        }else if (value instanceof Float) {
            System.out.println("O objeto está localizado no index: "+ (hash(longfy((double) value))+1));
        }
    }

    private long codify(String word){
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l'};
        long code = 0;
        int len = word.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len ; i++) {

            array[i] = word.charAt(i);
        }
        for(Character i : array){
            code = code + Character.getNumericValue(i);

        }

//        System.out.println(code);
        return code;
    }

    private long longfy(double decimal){
        while (decimal%10 != 0){
            decimal = decimal*10;
        }
//        System.out.print((long) decimal);
        return  (long) decimal;
    }
}
