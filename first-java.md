
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

9.Simple interest calculating

p = float(input("Enter Principal amount: "))
t = float(input("Enter Time (in years): "))
r = float(input("Enter Rate of Interest: "))

si = (p * t * r) / 100
print("Simple Interest =", si)




