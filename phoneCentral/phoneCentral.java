package phoneCentral;

import java.util.Scanner;

public class phoneCentral {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int number;
       do {
        
        System.out.println("Please, introduce your option:\n1. Language selection\n2. Customer support\n3. Check the balance\n4. Check loan balance\n0. Exit\n");
        
        number = scanner.nextInt();

        switch(number){
            case 0:
            System.out.println("Exit");
            break;
            case 1:
            System.out.println("Language selection");
            selectLanguage();
            break;
            case 2:
            System.out.println("Customer support");
            break;
            case 3:
            System.out.println("Chech the balance");
            break;
            case 4:
            System.out.println("Check loan balance");
            break;  
        }
       } while(number != 0);
   }

   public static void selectLanguage(){
       System.out.println("Select your language:\n1. English\n2. Catalan\n3. Spanish\n4. French\n5. Italian\n");
       Scanner language = new Scanner(System.in);
       int lang;
       do{
        lang = language.nextInt();
       }while (lang<1 || lang>5);
       
       switch(lang){
           case 1:
           System.out.println("You've selected English language");
           break;
           case 2:
           System.out.println("You've selected Catalan language");
           break;
           case 3:
           System.out.println("You've selected Spanish language");
           break;
           case 4:
           System.out.println("You've selected French language");
           break;
           case 5:
           System.out.println("You've selected Italian language");
           break;


       }
   }
    }
    

