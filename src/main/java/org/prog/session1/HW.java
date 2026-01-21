package org.prog.session1;

import java.util.Random;

public class HW {

    public static void main(String[] args) {


        int i =0;

       Random random = new Random();
       while (i<1000){
       i = random.nextInt(1000);
       System.out.println(i);
       if (i % 7 ==0) {
           System.out.println("Break on i%7 =0");
           break;
       }









        }
    }
    }




