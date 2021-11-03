package com.company;

import java.util.Arrays;

public class Matrix {
    protected int sorokSzama;
    protected int oszlopokSzama;
    protected int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = new int[sorokSzama][oszlopokSzama];
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[sorokSzama][oszlopokSzama];

        this.fill();
    }

    protected void fill() {
        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()* 90)+10;
            }
        }
    }

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }

    public boolean isSquare() {
        return this.sorokSzama == this.oszlopokSzama;
    }

    public long getSum() {
        long sum = 0;

        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                sum += this.matrix[i][j];
            }
        }

        return sum;
    }

    public int getEven() {
        int numOfEven = 0;

        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                if (this.matrix[i][j] % 2 == 0) numOfEven++;
            }
        }

        return numOfEven;
    }

    public int getMax() {
        int max = this.matrix[0][0];

        for (int i=0; i<sorokSzama; i++) {
            for (int j=0; j<oszlopokSzama; j++) {
                if (this.matrix[i][j] > max) max = this.matrix[i][j];
            }
        }

        return max;
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
