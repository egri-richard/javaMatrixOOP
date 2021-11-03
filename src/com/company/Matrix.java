package com.company;

import java.util.Arrays;

public class Matrix {
    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = new int[sorokSzama][oszlopokSzama];
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[sorokSzama][oszlopokSzama];

        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()* 90)+10;
            }
        }
    }

    public boolean isSquare() {
        return this.sorokSzama == this.oszlopokSzama;
    }

    @Override
    public String toString() {
        String retString = "";
        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                retString += this.matrix[i][j] +" ";
            }
            retString += "\n";
        }


        return retString;
    }
}
