/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler_roman_numeral;

import java.io.*;

/**
 *
 * @author ankush
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot=0;
        for (int i = 0; i <1000; i++) {
            String s = br.readLine();
            int l = s.length();
            int a = 0;
            for (int j = 0; j < l; j++) {
                char b = s.charAt(j);
                switch (b) {
                    case 'I':
                        a += 1;
                        break;
                    case 'V':
                        a += 5;
                        break;
                    case 'X':
                        a += 10;
                        break;
                    case 'L':
                        a += 50;
                        break;
                    case 'C':
                        a += 100;
                        break;
                    case 'D':
                        a += 500;
                        break;
                    case 'M':
                        a += 1000;
                        break;
                }
            }
            for (int j = 0; j < l - 1; j++) {
                char b = s.charAt(j);
                char c = s.charAt(j + 1);
                if (b == 'C' && (c == 'M' || c == 'D')) {
                    a -= 200;
                } else if (b == 'X' && (c == 'C' || c == 'L')) {
                    a -= 20;
                } else if (b == 'I' && (c == 'V' || c == 'X')) {
                    a -= 2;
                }
            }
            System.out.println(i + " " + a);
            int p = roman(a);
            tot += (l - p);
            System.out.println(i + " " + p + " " + l + " " + (l - p) + " " + tot);
        }
    }

    static int roman(int x) {
        String y = "";
        int arr[] = new int[7];
        if (x >= 1000) {
            arr[0] = x / 1000;
            x %= 1000;
            y += String.valueOf(arr[0]);
            y += "M";
        }
        if (x >= 900) {
            arr[2]++;
            arr[0]++;
            x -= 900;
            //    y+=String.valueOf(arr[2]);
            y += "CM";
        }
        if (x >= 500) {
            arr[1]++;
            x -= 500;
            //    y+=String.valueOf(arr[1]);
            y += "D";
        }
        if (x >= 400) {
            arr[2]++;
            arr[1]++;
            x -= 400;
            //    y+=String.valueOf(arr[2]);
            y += "CD";
        }
        if (x >= 100) {
            arr[2] += (x / 100);
            x %= 100;
            y += String.valueOf(arr[2]);
            y += "C";
        }
        if (x >= 90) {
            arr[4]++;
            arr[2]++;
            x -= 90;
            //     y+=String.valueOf(arr[4]);
            y += "XC";
        }
        if (x >= 50) {
            arr[3]++;
            x -= 50;
            //    y+=String.valueOf(arr[2]);
            y += "L";
        }
        if (x >= 40) {
            arr[3]++;
            arr[4]++;
            x -= 40;
            //y+=String.valueOf(arr[2]);
            y += "XL";
        }
        if (x >= 10) {
            arr[4] += (x / 10);
            x %= 10;
            y += String.valueOf(arr[4]);
            y += "X";
        }
        if (x >= 9) {
            arr[6]++;
            arr[4]++;
            x -= 9;
            //y+=String.valueOf(arr[2]);
            y += "IX";
        }
        if (x >= 5) {
            arr[5]++;
            x -= 5;
            //y+=String.valueOf(arr[2]);
            y += "V";
        }
        if (x >= 4) {
            arr[5]++;
            arr[6]++;
            x -= 4;
            //y+=String.valueOf(arr[2]);
            y += "IV";
        }
        if (x >= 0) {
            arr[6] += x;
            x = 0;
            y += String.valueOf(arr[6]);
            y += "I";
        }
       // System.out.println(y);
        int z = 0;
        for (int i = 0; i < 7; i++) {
            z += arr[i];
            //  System.out.print(arr[i]);
        }
        return z;
    }
}

//743