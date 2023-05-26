package Homework4_Alin;

public class Exercitiu2 {
	

    public static void main(String[] args) {

        int count = 9, num1 = 0, num2 = 1;
        System.out.print("Seria lui Fibonacci pentru "+count+" numere: ");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            
            
        } 
        
        
        System.out.println(" ");
        int count2 = 9, nr1 = 0, nr2 = 1;
        System.out.print("Seria lui Fibonacci pentru "+count2+" numere: ");

        int i=1;
        while(i<=count2)
        {
            System.out.print(nr1+" ");
            int sumOfPrevTwo = nr1 + nr2;
            nr1 = nr2;
            nr2 = sumOfPrevTwo;
            i++;
        }
        
    }
}



