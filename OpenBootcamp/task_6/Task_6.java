

public class ArrayUnidimensional {

    public static void main(String[] args) {

        String[] arrays = {"His", "John", "Melania", "China", "Japan"};

        for (String array : arrays) {
            System.out.println(array);
        }
    }
}


public class ArrayBidimensional {

    public static void main(String[] args) {
        int[][] array = {{0, 1, 2, 3}, {10, 11, 12, 13, 14, 15}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                        "\nEl valor es: " + array[i][j] + "\n");
            }
        }
    }
}


import java.util.ArrayList;
import java.util.Vector;

public class Vectoring {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("This is the vector before 2º and 3º position will be removed." + vector);
        vector.remove(2);
        vector.remove(3);
        System.out.println("This is the vector now : " + vector);
    }
}
package test.java;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class ArrayListStringWithLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(String.valueOf(list));

        for (String s : list) {
            System.out.println("This is the ArrayList: " + s);
        }
        for (String s : linkedList) {
            System.out.println("This is the LinkedList: " + s);
        }
    }
}

import java.util.ArrayList;

/**
 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}



import java.io.*;
import java.util.Scanner;

public class CopyFile {

    private static void copyfiles(String filein, String fileout) throws IOException {
        try {
            InputStream in = new FileInputStream(filein);
            byte[] buffer = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileout);
            out.write(buffer);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero a copiar: ");
        String line = scanner.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Introduce la ruta del fichero de salida: ");
        String lineout = scanner.nextLine();
        copyfiles(line, lineout);
    }
}
