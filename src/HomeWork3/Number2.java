package HomeWork3;

import java.util.Random;


/**

  ������� ��������� ������ �� 5 ����� �� 8 �������� � ������ �� ��������� ����� ����� �� ������� [-99;99].

  ������� ������ �� �����. ����� �� ��������� ������ ������� �� ����� �������� ������������� �������� �����

  ������� (��� ������ �� ����� ��������).
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
      System.out.println("�������� ������������� �������� = "+max);

  }
	 


	    }


