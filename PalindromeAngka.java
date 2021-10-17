/*
Nama : salman alfariji
Nim : 20200040033
Kelas : TI 20 A
 */

/**
 *
 * @author salman alfariji
 */
package palindrome;

import java.util.Scanner;
public class palindromAngka {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        String cek;
        int atas = 0, bawah = 0, i;
        char aw, ak;
        boolean m;
        System.out.print("Banyaknya Angka :");
        int p = baca.nextInt();//banyak angka yang dicek
        if (p > 100 || p < 0) {
            System.out.println("Terlalu Besar/Kecil");
        } else {
            int[] array = new int[p];
            int[] hasil = new int[p];
            for (int x = 0; x < p; x++) {
                System.out.print("Angka ke "+(x+1)+": ");
                array[x] = baca.nextInt();//input angka
                for (int j = array[x] - 1; j > 0; j--) {//cek secara decrement
                    String h = String.valueOf(j);
                    m = cek(h);
                    if (m) {
                        bawah = j;
                        break;
                    }
                }
                for (int j = array[x] + 1; j <  2147483647; j++) {//cek secara increment
                    String h = String.valueOf(j);
                    m = cek(h);
                    if (m) {
                        atas = j;
                        break;
                    }
                }
                if (array[x] - bawah >= atas - array[x]) {//mencari terdekat
                    hasil[x] = atas;
                } else {
                    hasil[x] = bawah;
                }
                if(array[x]==11){//jika angka 11
                    hasil[x]=22;
                }
                if(array[x]<10){//jika angka dibawah 10
                    hasil[x]=11;
                }
            }System.out.println("----------------------");
            for (int x = 0; x < p; x++) {
                System.out.println("Terdekat dengan angka ke "+(x+1)+" :"+hasil[x]);
            }
        }
    }
    
  public static boolean cek(String ck) {
        boolean cek = false;
        char aw, ak;
        int x = ck.length();
        int y = -1;
        int h = x - 1;
        for (int i = h; i >= 0; i--) {
            y++;
            aw = ck.charAt(y);
            ak = ck.charAt(i);
            if (aw == ak) {//cek Palindrom
                cek = true;
            } else {
                cek = false;
                break;
            }
        }
        return cek;
    }
}
 
