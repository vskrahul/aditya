package ds.algo;

public class Selectionsort {
    public static void main(String[] args) {
        int[] a={39,6,52,80,90,2,3,77};
        int min,temp=0;
        for(int i=0;i<a.length;i++){
            min=i; //i=0
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }

    }

}
