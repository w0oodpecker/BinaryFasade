package org.example;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int arg0, arg1, result;
        arg0 = Integer.parseInt(a, 2);
        arg1 = Integer.parseInt(b, 2);
        result = arg0 + arg1;
        String sum = Integer.toBinaryString(result);
        return sum;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg0, arg1, result;
        arg0 = Integer.parseInt(a, 2);
        arg1 = Integer.parseInt(b, 2);
        result = arg0 * arg1;
        String mult = Integer.toBinaryString(result);
        return mult;
    }
}