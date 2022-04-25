import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.sound.sampled.ReverbType;

import java.util.*;

public class arrayList_loop {
    public static void main(String[] args) {
        ArrayList<Integer>i=new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(80);
        i.add(60);
        i.add(49);
        i.add(40);
        i.add(50);
        System.out.println(i);
        // for(int j=0;j<i.size();j++){
        //     System.out.println(i.get(j));
           
          //  }
          for(Object obj:i){
              System.out.println(obj);
          }
          System.out.println("print Iterator method ");

              /*to help Iterator   travel the element   */
              Iterator itr=i.iterator();
              while(itr.hasNext()){
                  System.out.println(itr.next());
              }
              /* short assending order arrayList*/
              System.out.println(i);
            Collections.sort(i);
            System.out.println("print shoted element "+i);
            Collections.sort(i,Collections.reverseOrder());
            System.out.println(i);
          }
        
    }  

