package HomeWork3;

import java.util.Random;


/**

  Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].

  Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого

  массива (его индекс не имеет значения).
 */

public class Number2 {
	 public static void main(String[] args) {

	     int mass[][]= new int[8][5];

	     Random rand=new Random();


	  for (int i=0; i<mass.length; i++){

	    for (int j=0; j<mass[i].length; j++){

	        int randMass=rand.nextInt(199)-99;

	        mass[i][j]=randMass;

	    }

	}
	  int max = -99;

	  for (int i=0; i<mass.length; i++){

		    for (int j=0; j<mass[i].length; j++){
        	  
             System.out.print(mass[i][j] + " ");

             if (mass[i][j] > max)
            	 
            	 max =mass[i][j];

          }

          System.out.println();

      }
	  System.out.println();
      System.out.println("Значение максимального элемента = "+max);

  }
	 


	    }


