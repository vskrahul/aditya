package ds.algo;

import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count = 0;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(n%i==0)
                count=count+1;
        }
        if(count==0){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
