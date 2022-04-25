import java.util.*;
public class arrayList1{
    public static void main(String[] args) {
        ArrayList<String>s=new ArrayList<>();
        s.add("hello");
        s.add("world");
        s.add("software");

        System.out.println(s);
        System.out.println(s.get(0));// get function to use invoke index in aarrayList//
        // remove function in arrayList//
        s.remove(1);
        System.out.println(s);
        // short function in arrayList//
        ArrayList<Integer>i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(80);
        i.add(40);
        i.add(70);
        System.out.println(i);
        int  a = i.get(3);
         System.out.println(a);
         // size method to help give the array size //
         int b = i.size();
         System.out.println(b);
         // contains  metod --->> 
         // to find element in arrayList //
        
         System.out.println(i.contains(40));

         //  isEmpty method --->> 
         // if arrayList is empty return  " true " else false //
         // they return bollean // 
         System.out.println(i.isEmpty());
        ArrayList<String>s1 = new ArrayList<>();
        System.out.println(s1.isEmpty());

        // clear method -->> remove all arrayList.
        // i.clear();
        // System.out.println(i);

        // set method -->> in arrayList replace element

        i.set(1,100);
        System.out.println(i);
        s.set(1, "ram");
        System.out.println(s);
        //s.get(1);
        System.out.println(s.get(1));
        // Object method ---> to convert arrayList to array
        // and print array element to help of for each loop//
        Object arr[]=i.toArray();
        for(Object obj:arr){
            System.out.print(obj);
        }
        System.out.println();
    // short method -- > in present all element in array short increasing or 
    // decreasing order//
       System.out.println("arrayList before shorting "+i);
       Collections.sort(i);
       System.out.println("sorted arrayList"+i);

       // remove arrayList duplicate 
       ArrayList<Integer>i1= new ArrayList<>();
       i1.add(10);
       i1.add(10);
       i1.add(20);
       i1.add(30);
       i1.add(20);
       i1.add(40);
      // Collections.sort(i1);
       System.out.println(i1);
      HashSet<Integer>h= new HashSet<>(i1);
      ArrayList<Integer>i2= new ArrayList<>(h);
      System.out.println("arrayList after"+h);
      Collections.sort(i2);
      System.out.println(i2);
       // another way remove duplicate element in arrayList//
       /*LinkedHashSet metod ----->>   remove the duplicate element 
        in arryList but print same  order  */
     LinkedHashSet<Integer>lh=new LinkedHashSet<>(i1);
     System.out.println(i1);  
     System.out.println(lh);
     }

}   