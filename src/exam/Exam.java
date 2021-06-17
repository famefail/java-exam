
package exam;
import java.util.Scanner;
public class Exam {

   
    public static void main(String[] args) {
     
        //comment
        /*comment */
        
        int a = 1;
        boolean state = true;
        float  myFloat = 2.33f;
        double myDouble = 30.21;
        char myChar = 'b';
        final String Hello = "hello";
        String text = "hi";
          System.out.println("Ex 2.1");
        System.out.println("Interger: " + a);
        System.out.println("Boolean: " + state);
        System.out.println("String: " + text);
       
        
        bark();
         System.out.println("Ex 2.2");
        System.out.println("The dog name " + bark() + "bark");
        int myInt =  (int) myFloat;
          System.out.println(myInt);
        myFloat = a;
          System.out.println(myFloat);
        myFloat = (float) myDouble;
          System.out.println(myFloat);
         myInt =  myChar;
          System.out.println(myInt);
          
          
        // Hello = "World";
            System.out.println("Exam 3");
        int i = 20;
        i++;
        i++;
        i++;
        i++;
        i++;
        
        System.out.println(i);
        --i;
        --i;
        --i;
        --i;   
        --i;
        System.out.println(i);
         
        if(myFloat > 2.32 && myFloat < 1.00){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        if(myChar == 'a' || myChar == 'b'){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("Exam 4.1");
        int score = 80;
        if(score >= 80){
            System.out.println("Good");
        }
        else if(score >= 50){
            System.out.println("Normal");
        }
        else if(score < 50){
            System.out.println("Fail");
        }
        
        System.out.println("Exam 4.3");
        int Grade = 50;
        
         if(Grade >= 80){
            System.out.println("A");
        }
         else if(Grade >= 70){
             System.out.println("B");
         }
          else if(Grade >= 60){
            System.out.println("C");
        }
        else if(Grade >= 50){
            System.out.println("D");
        }
        else if(Grade >= 40){
            System.out.println("F");
        }
          else if(Grade < 40){
            System.out.println("F");
        }
         
         System.out.println("Exam 4.4");
        i = 0;
        int sum = 0;
        while(i <= 10){
            System.out.println(i);
            sum += i; 
            i++;
           
        }
         System.out.println(sum);
         
         
         while(i <= 100){
             
             if(i%12 == 0){
                 System.out.println(i);
             }
             i++;
         }
         
         
         int ary[] = {1,2,3,4,5};
         for(int count : ary){
               System.out.println(count);
         }
         
         Scanner scan = new Scanner(System.in);
        
         int num ;
         do {  
               int input = scan.nextInt();
               System.out.println(input);  
                num = input;
            }    while(num%2 == 0);
      
          System.out.println("Exam 4.5");
      int count = 20;
           for(int r = 0;r<= count;count--){
               if(count != 11){
                   continue;
                   
               }
               System.out.println(count);
           }
            
       
      int ten = 10;
      for(i = 1;i <= 10;i++){
          if(i != 2){   
             
                 System.out.println(i);
                continue;
           
              
          }
      }
      
      int mynum = 2;
       System.out.println("Exam 5");
      System.out.println(thisreturn(mynum));
      nonreturn();
    }
    
    
    public static String bark(){
        String local = "momo";
       
        return local;
    }
    
    
    public static int thisreturn(int num){
        return num *2;
    }
    
    
    public static void nonreturn(){
        System.out.println("not return");
    }

    }

