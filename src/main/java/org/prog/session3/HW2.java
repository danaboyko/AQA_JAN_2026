package org.prog.session3;

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
       int i;
       int[] array = new int[]{4,9,1,5,3,0,7,2,8,6};
       for (i =0; i < array.length;){
           if (i ==0) {
               i++;
                      }
           if (array[i] < array[i -1]) {
              int current = array[i];
              array[i] =array[i-1];
              array[i -1] =current;
              i--;
           } else {
               i++;
           }
           }
       for (int j=0; j < array.length; j++) {
           System.out.println(array[j]);
       }
       }
}
