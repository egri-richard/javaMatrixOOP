package com.company;

public class NegyzetesMatrix extends Matrix {

    public NegyzetesMatrix(int n) {
        super(n, n);
    }

    public NegyzetesMatrix() {
        this((int)(Math.random()*11)+5);
        this.fill();
    }

    public int foAtloSum() {
        int sum =0;
        for (int i=0; i < this.matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int mellekAtloSum() {
        int sum = 0;
        for (int i=this.matrix.length-1; i > -1 ; i--) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int mellekAtloMax() {
        int max = matrix[0][this.oszlopokSzama-1];
        for (int i=0; i < this.sorokSzama; i++) {
            if (max < matrix[i][(this.oszlopokSzama-1)-i]) {
                max = matrix[i][(this.oszlopokSzama-1)-i];
            }
        }
        return max;
    }
}
