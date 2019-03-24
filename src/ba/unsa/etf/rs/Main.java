package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while (n != 0){
            suma = suma + (n%10);
            n = n/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = s.nextInt();
        for (int i = 1; i < n;i++){
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
}