package HomeWork3;
import java.util.*;
/**

  �������� ���������, ������� �������� ������, ����� ����������� 
  
  (�� ���� ������ ������� ������ ������� � ���������,

   ������ � � ������������� � �.�.), � ����� ��������.

 */

      public class Number3 {
	
	   public static void main(String args[]) {

           int[] mass= new int[10];
         
            for (int i = 0; i <mass.length; i++) {

            	mass[i] = i;

                System.out.print(mass[i] + " ");

            }

            for (int i = 0; i < mass.length-i; i++) {

                int inv = mass[i];

           mass[i] = mass[mass.length-1-i];

                mass[mass.length-1-i] = inv;

            }
             System.out.println();
             System.out.print(" �������� ������� : ");

            for (int i = 0; i <mass.length; i++) {

                System.out.print(mass[i] + " ");

            }

        }

    }

