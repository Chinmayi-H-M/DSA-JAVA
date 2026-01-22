1.Check for even or odd 


import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}


2.Largest of 3 numbers

import java.util.Scanner;

class max3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println("The maximum number out of three is: "+max);
        
    }
}

3.To check whether the first letter of the given word is capital or small

import java.util.Scanner 
public class Case Check{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if(ch >'a' && ch <'z'){
             
        }
         System.out.println(ch);

    }
}


