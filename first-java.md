
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




