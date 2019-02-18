package Pracice_01;

import java.sql.SQLOutput;

class GFG {
    static int maxDivide(int a, int b) {
        while (a % b == 0)
            a = a / b;
        return a;
    }

    static int isUgly(int no) {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);

        return (no == 1) ? 1 : 0;
    }

    static int getNthUglyNO(int n) {
        int i = 1;
        int count = 1;
        while (n > count) {
            i++;
            if (isUgly(i) == 1)
                count++;
        }
        return i;
    }

    public static void main(String[] args) {
        int no = getNthUglyNO(28);
        System.out.println("28th ugly no. is" + no);
    }
}
