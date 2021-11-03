package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        System.out.println(m1.isSquare() ? "igen" : "nem");
        System.out.printf("méretei: %d X %d\n", m1.getSorokSzama(), m1.getOszlopokSzama());
        System.out.printf("összeg: %d\n", m1.getSum());
        System.out.printf("Párosak száma: %d\n",m1.getEven());
        System.out.printf("Legnagyobb: %d\n", m1.getMax());
        System.out.println(m1);
    }
}
