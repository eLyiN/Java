package com.shelakh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un precio para calcular el 21% del IVA.");
        String precio = in.nextLine();
        double precio_with_tax = getTax(precio);
        System.out.println("El precio con el 21% del IVA es: " + precio_with_tax);

    }

    static double getTax(String precio) {

        int pr = Integer.parseInt(precio);
        return pr + (pr * 0.21);
    }
}
