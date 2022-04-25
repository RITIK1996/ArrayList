import java.util.*;
public class bar_char {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       int max =arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       for(int flore=max;flore>=1;flore--){
           for(int i=0;i<arr.length;i++){
               if(arr[i]>=flore){
                   System.out.print("*"+" ");
               }else{
                   System.out.print(" "+" ");
               }
           }
           System.out.println();
       }
   } 
}

