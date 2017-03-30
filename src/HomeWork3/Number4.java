package HomeWork3;

import java.util.*;



/**Разработать java-класс, задача которого генерация случайного регистрационного знака транспортного средства

 (ТС) в формате:

 «М 000 ММ 55 или М 000 ММ 555», где

 0 и М - соответственно цифра и буква, означающие номер и серию регистрационного знака ТС;

 5 - цифра кода региона Российской Федерации, применяемых на регистрационных знаках ТС.

 (Государственный стандарт РФ ГОСТ Р 50577-93)

 */

public class Number4 {

    public static void main(String args[]){

        Number num=new Number();
        
       num.Generate();}

}

class Number {

    Random random = new Random();

      private char SerGen() {

        char[] Letters = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

        char serial = Letters[random.nextInt(12)];
        return serial;

    }

    private int NumGen() {

        int num = random.nextInt(10);

        return num;

    }

    private int NumReg() {

        int[]  regmass= {2,3};

        int[] CodReg = {1,2,102,3,4,5,6,7,8,9,10,

            11,12,13,113,14,15,16,116,17,18,19,20,21,121,

            22,23,93,24,84,88,124,25,125,26,27,28,29,30,

            31,32,33,34,35,36,37,38,85,138,39,91,40,41,82,

            42,43,44,45,46,47,48,49,50,90,150,190,51,52,152,53,54,154,

            55,56,57,58,59,81,159,60,61,161,62,63,163,64,164,65,66,96,

            67,68,69,70,71,72,73,173,74,174,75,80,76,77,97,99,177,199,

            197,78,98,198,79,83,86,87,89,92,94,95};

        int threeNumbers, twoNumbers;

        int proverka = regmass[random.nextInt(2)]; 



        if (proverka == 3) {              

            threeNumbers = CodReg[random.nextInt(CodReg.length)];

            return threeNumbers;

        } else {                           

        	twoNumbers = CodReg[random.nextInt(CodReg.length)];


        } return twoNumbers;
    }

        public void Generate() {

      int n=NumReg();
           
    if (n<10)

       System.out.println(SerGen() + " " 
    		   
       + NumGen() + NumGen() + NumGen()
       
       + " " + SerGen() + SerGen() + " 0" + n);
    else
    	 System.out.println(SerGen() + " " 
    			 
    + NumGen() + NumGen() + NumGen() + 
    
    " " + SerGen() + SerGen() + " " +n);
  
    }

}