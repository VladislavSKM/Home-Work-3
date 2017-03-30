package HomeWork3;

import java.util.Random;

/**Создать двумерный массив из 8 строк по 5 столбцов в каждой

  из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

 */

public class Number1 {
	 public static void main(String[] args) {
		 
	     int mass[][]= new int[8][5];

	     Random rand=new Random();


	  for (int i=0; i<mass.length; i++){

	    for (int j=0; j<mass[i].length; j++){

	        int randMass=rand.nextInt(90)+10;

	        mass[i][j]=randMass;

	    }

	}
	 
	  for (int i=0; i<mass.length; i++){

		  for (int j=0; j<mass[i].length; j++){
        	
        	System.out.print( mass[i][j]+" ");
        }
		  System.out.println();	
		    }
	
	  }

	    }



