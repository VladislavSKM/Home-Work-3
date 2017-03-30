package HomeWork3;

	import java.util.*;


	/**

	 5. Определить структуру объекта Employee (сотрудник), хранящий информацию: фамилия, имя, должность, зарплата.

	  Разработать программу, которая хранит информацию обо всех сотрудниках фирмы/ Реализовать:

	  --  заполнение контейнера данными с клавиатуры;

	  --  вывод информации о сотрудниках на экран;

	  --  поиск сотрудников, состоящих на заданной должности;

	  --  сортировку списка сотрудников по полю фамилия и по полю зарплата.﻿

	  Разработать программу, демонстрирующую работу с созданным классом и проверяющую корректность работы класса Employee

	

	 BBB,SSS,QA,120

	 BBB,WWW,QA,119

	 FFF,GGG,QA,300

	 TTT,GGG,QA,250



	 Employee{firstName='BBB', lastName='WWW', position='QA', salary=119}

	 Employee{firstName='BBB', lastName='SSS', position='QA', salary=120}

	 Employee{firstName='FFF', lastName='GGG', position='QA', salary=300}

	 Employee{firstName='TTT', lastName='GGG', position='QA', salary=250}

	 */




	public class Number5 {

	    public static void main(String args[]) {

	        Scanner scanner = new Scanner(System.in);

	      

	        System.out.println(" Команды для управления: \n"+
	        " Для добавления сотрудника напишите 'Добавить' \n"+
	        " Для вывода сотрудников напишите 'Показать' \n"+
	        " Для поиска  сотрудников  напишите 'Искать' \n" +
	        " Для сортировки по зарплате или фамилии напишите 'Сортировать' \n"+
	        " Для выхода из программы напишите 'Выход' \n");


	        while (scanner.hasNext()) {

	            String InputChoice = scanner.nextLine();
	            if(InputChoice.equalsIgnoreCase("выход")){

	                break;
	                
	            }else System.out.println("Неверно введена команда");
	                
	             

	            if (InputChoice.equalsIgnoreCase("Добавить")) {

	                Employee employee = addData(scanner);

	                System.out.println("введите: добавить, показать, поиск, сортировка, выход");

	            }else

	            if (InputChoice.equalsIgnoreCase("Показать")) {

	                showEmployees(Employees.getEmpls());

	                System.out.println("введите: добавить, показать, поиск, сортировка, выход");

	            }else

	            if (InputChoice.equalsIgnoreCase("Поиск")){

	                System.out.println("Введите должность нужного сотрудника");

	                String search=scanner.nextLine();

	                ArrayList<Employee> employees=Employees.searchPosition(search);

	                showEmployees(employees);

	                System.out.println("введите: добавить, показать, поиск, сортировака, выход");

	            }else

	            if(InputChoice.equalsIgnoreCase("Сортировать")){

	                System.out.println(" По зарплате или фамилии?");

	                String InputChoiceSort=scanner.nextLine();

	                if (InputChoiceSort.equalsIgnoreCase("фамилии")){

	                    ArrayList<Employee> SortLastName=Employees.getSortByLastName();

	                    showEmployees(SortLastName);

	                    System.out.println("введитее: добавить, показать, поиск, сортировать, выход");

	                }else if(InputChoiceSort.equalsIgnoreCase("зарплате")){

	                    ArrayList<Employee> SortSalary=Employees.getSortEmplsBySalary();

	                    showEmployees(SortSalary);

	                    System.out.println("введите: добавить, показать, поиск, сортировать, выход");
	                
	           
	                   }
	                }
	            } 
	        }
	    



	    private static Employee addData(Scanner scanner) {

	        System.out.println("Введите Имя");

	        String firstName = scanner.nextLine();
	             if (firstName.isEmpty()){
	        	
	        	 System.out.println("Вы ввели пустое имя\n"); 
	            }
	        
	        System.out.println("Введите Фамилия");

	        String lastName = scanner.nextLine();
	           if (lastName.isEmpty()){
	        	
	        	 System.out.println("Вы ввели пустую фамилию\n");
	            }

	        System.out.println("Введите Должность");

	        String position = scanner.nextLine();
	            if (position.isEmpty()){
	        	
	        	 System.out.println("Вы ввели пустую должность\n");
	            }

	        System.out.println("Введите Зарплату");

	        int salary = scanner.nextInt();
	             if (salary<0){
	        	
	        	 System.out.println("Вы ввели пустую зарплату\n");
	            }

	        Employee employee = new Employee(firstName, lastName, position, salary);

	        Employees.setEmpl(employee);

	        return new Employee(firstName, lastName, position, salary);

	    }



	    private static void showEmployees(ArrayList<Employee> employees) {

	        if (employees.size() == 0) {

	            System.out.println("Список сотрудников пуст");

	        } else {

	            for (Employee x : employees) {

	                System.out.println(x.toString());

	            }

	        }

	    }

	}



	 class Employee {

	     private String firstName;

	     private String lastName;

	     private String position;

	     private int salary;



	     public Employee(String firstName, String lastName, String position, int salary) {

	         this.firstName = firstName;

	         this.lastName = lastName;

	         this.position = position;

	         this.salary = salary;

	     }




	     public String toString() {

	         return "Employee{" +

	                 "firstName='" + firstName + '\'' +

	                 ", lastName='" + lastName + '\'' +

	                 ", position='" + position + '\'' +

	                 ", salary=" + salary +

	                 '}'+"\n";

	     }

	     public String getFirstName() {

	         return firstName;
	     }


	     public String getLastName() {

	         return lastName;
	     }


	     public String getPosition() {

	         return position;
	     }

	     public int getSalary() {

	         return salary;
	     }

	 }



	class Employees {

	  private static ArrayList<Employee> EmplMass = new ArrayList<>();


	      public static void setEmpl(Employee empl) {

	    	  EmplMass.add(empl);

	      }
 


	      public static ArrayList<Employee> getEmpls() {

	        return EmplMass;

	      }



	      public static ArrayList<Employee> searchPosition(String position) {

	        ArrayList<Employee> searchPosEmpls = new ArrayList<>();

	        for (Employee x : EmplMass) {

	            if (x.getPosition().equalsIgnoreCase(position)) {

	                searchPosEmpls.add(x);

	            }

	        }

	        return searchPosEmpls;

	    }


	    public static ArrayList<Employee> getSortByLastName() {

	        Collections.sort(EmplMass, new Comparator<Employee>() {

	 
	            public int compare(Employee elem1, Employee elem2) {

	                return elem1.getLastName().compareTo(elem2.getLastName());

	            }

	        });

	        return EmplMass;

	    }
	    

	    public static ArrayList<Employee> getSortEmplsBySalary() {

	        Collections.sort(EmplMass, new Comparator<Employee>() {

	            public int compare(Employee elem1, Employee elem2) {

	             return Integer.compare(elem1.getSalary(), elem2.getSalary());

	            }

	        });

	        return EmplMass;

	    }
}
