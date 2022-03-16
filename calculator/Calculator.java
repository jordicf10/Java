package calculator;

import java.util.Scanner;

public class Calculator{
     int num1;
     int num2;

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        boolean error = true;
        Calculator myCalculator = new Calculator(num1,num2);
        do{
            try{
                System.out.println("Introduce your first number:");
                Scanner number1 = new Scanner(System.in);
                num1 = number1.nextInt();
                myCalculator.setNum1(num1);
                System.out.println("Introduce your second number:");
                Scanner number2 = new Scanner(System.in);
                num2 = number2.nextInt();
                myCalculator.setNum2(num2);
                error = false;
                }catch(Exception e){
                    System.out.println("Please, introduce a correct number");

                }
        }while(error);

        
        int option = 0;
 
do{
    boolean isError = true;
    do{
        try{
                printMenu();
                Scanner data = new Scanner(System.in);
                option = data.nextInt();
                isError = false;
            }catch(Exception e){
                System.out.println("Please, introduce a correct option");
                
            }
    }while(isError);

                    switch(option){
                        case 1:
                     System.out.println(myCalculator.getNum1() + " + " + myCalculator.getNum2() + " = " + myCalculator.add(num1,num2));
                     break;
                    case 2:
                     System.out.println(myCalculator.getNum1() + " - " + myCalculator.getNum2() + " = " + myCalculator.substract(num1,num2));
                     break;
                    case 3:
                     System.out.println(myCalculator.getNum1() + " * " + myCalculator.getNum2() + " = " + myCalculator.multiply(num1,num2));
                     break;
                    case 4:
                     System.out.println(myCalculator.getNum1() + " / " + myCalculator.getNum2() + " = " + myCalculator.divide(num1,num2));
                     break;
                    case 5:
                     System.out.println(myCalculator.getNum1() + " % " + myCalculator.getNum2() + " = " + myCalculator.modulo(num1,num2));
                     break;
                    }
 
            }while(option!=6);
        }

    public static void printMenu() {
        System.out.println("Select your option:\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5.Modulo\n6. Exit");
    }

    public int add(int x, int y){
        return x + y;
    }
  
    public int substract(int x, int y){
        return x - y;
    }
  
    public int multiply(int x, int y){
        return x * y;
    }
  
    public int divide(int x, int y){
        return x / y;
    }
  
    public int modulo(int x, int y){
        return x % y;
    }

  }