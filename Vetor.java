
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
/**
 * This class is used to create a generic vector that can be manipulated using hashing methods.
 * @authors Felipe Bertoli Oliveria, Heber José da Silva Junior, João Pedro Brustolin Szlachta, Rafael Haruo Nakagawa Hoshino
 * @version 1.0.0
 * @since 2023-06-05
 */
public class Vetor<T> {
    public int length;
    public T[] vetor;

    /**
     * This method is the constructor. It creates a generic vector that has the length equals the variable capacidade.
     * @param capacidade
     */
    public Vetor(int capacidade) {
        this.length = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    /**
     * This method use others hashing methods to insert a value into the vector, according to the position it was returned
     * by the specific hashing method.
     * @param value
     */
    public void insert(T value) {
        if (value instanceof Long) {
            this.vetor[hash((long) value)] = value;
            System.out.println("O objeto inserido!");
        } else if (value instanceof String) {
            this.vetor[hash(codify((String) value))] = value;
            System.out.println("O objeto inserido!");
        } else if (value instanceof Double) {
            this.vetor[hash(longfy((double) value))] = value;
            System.out.println("O objeto inserido!");
        }
    }

    /**
     * This method is responsible to print at the terminal all the values there is into the vector, including nulls
     */
    public void show() {
        for (int i = 0; i < length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    /**
     * This method is used to find a specific value in the vector. By using the value as a parameter, the method looks into
     * the vector using the same hashing method used to insert it and prints the index where the value is found
     * @param value
     */
    public void find(T value) {
        if (value instanceof Long) {
            System.out.println("O objeto está localizado no index: " + (hash((long) value) + 1));
        } else if (value instanceof String) {
            System.out.println("O objeto está localizado no index: " + (hash(codify((String) value)) + 1));
        } else if (value instanceof Double) {
            System.out.println("O objeto está localizado no index: " + (hash(longfy((double) value)) + 1));
        }
    }

    /**
     * This method change the value for null in the vector using the same hashing method used to insert it.
     * @param value
     */
    public void delete(T value) {
        if (value instanceof Long) {
            this.vetor[hash((long) value)] = null;
            System.out.println("O objeto foi apagado do index: " + (hash((long) value) + 1));
        } else if (value instanceof String) {
            this.vetor[hash(codify((String) value))] = null;
            System.out.println("O objeto foi apagado do index: " + hash(codify((String) value) + 1));
        } else if (value instanceof Double) {
            this.vetor[hash(longfy((double) value))] = null;
            System.out.println("O objeto foi apagado do index: " + hash(longfy((double) value) + 1));
        }
    }

    /**
     * This method is used to insert int and long values into the vector. Using a while loop, the method compares
     * the value with the vector length. If the value is greater, it extracts the square root of the value and defines
     * this result as the new value.
     * @param value
     * @return int This returns the index of the vector which the value will be inserted.
     */
    private int hash(long value) {

        while (value > length) {
            value = (int) Math.round(Math.sqrt(value));
        }
        return (int) value;
    }


    /**
     * This method is used to insert strings into the vector. It separates the characters from string and get their ASCII code
     * and sums all the values. This value is used to define the index where the string will be inserted.
     * @param word
     * @return int This returns the index of the vector which the value will be inserted.
     */
    private long codify(String word) {
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'};
        long code = 0;
        int len = word.length();
        Character[] array = new Character[len];
        for (int i = 0; i < len; i++) {

            array[i] = word.charAt(i);
        }
        for (Character i : array) {
            code = code + Character.getNumericValue(i);

        }

//        System.out.println(code);
        return code;
    }

    /**
     * This method uses a while loop to determine the index where the float value will be inserted. The while loop gets the remainder
     * of the value and compares it. If it is not equals to zero, then it multiplies the value by ten until the remainder
     * operation returns zero.
     * @param decimal
     * @return int This returns the index of the vector which the value will be inserted.
     */
    private long longfy(double decimal) {
        while (decimal % 10 != 0) {
            decimal = decimal * 10;
        }
//        System.out.print((long) decimal);
        return (long) decimal;
    }
}
