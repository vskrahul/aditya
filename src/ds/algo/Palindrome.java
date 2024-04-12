package ds.algo;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,pro=1;
        System.out.println("enter palindrome number");
        n=sc.nextInt();
        while(n>0){
            pro=pro*n;
            n=n-1;
        }
        System.out.println("product number is = " +pro);
    }
}

