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
             System.out.println("Lowercase");
        }
        else{
         System.out.println("Uppercase");
        }

    }
}

4.Fibonacci numbers(Using while loop)

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        int count =2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}


5.Count the number of ocurreneces
class Main {
    public static void main(String[] args) {
        int n=90999;
        int num=n;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem ==9){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}

6.Reverse the number
class Main {
    public static void main(String[] args) {
        int num=7321;
        int ans=0;
        while(num>0){
            int rem=num%10;
            num/=10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}

7.Simple calculator
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans =0;
        while(true){
            System.out.print("Enter the operator: ");
            char op=sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/' ||op=='%'){
                System.out.println("Enter the 2 numbers: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2 !=0){
                    ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
            }
                else if(op == 'x' || op=='X'){
                    break;
                }
                else{
                    System.out.println("Invalid operation");
                }
                
                System.out.println(ans);
            }
    }
}

8.Program to take name as input and print a greeting message
name = input("Enter your name: ")
print("Hello", name + "! Welcome 😊")




