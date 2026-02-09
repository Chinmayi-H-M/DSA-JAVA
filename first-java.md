# Assignment – Basic Programming Problems
## 1. Check for Even or Odd

```java
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
```

##Largest of 3 numbers
```java
import java.util.Scanner;

class Max3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = Math.max(n1, Math.max(n2, n3));
        System.out.println("The maximum number out of three is: " + max);
   }
}
```
##3. Check Whether the First Letter Is Capital or Small
```java
import java.util.Scanner;
class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
   }
}
```
## 4.Fibonacci Numbers (Using While Loop)
```java
import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        count++;
    }
        System.out.println(b);
    }
}
```

##Count the Number of Occurrences of Digit 9
```java
    class CountOccurrence {
      public static void main(String[] args) {
        int n = 90999;
        int count = 0;
        while (n > 0) {
          int rem = n % 10;
          if (rem == 9) {
             count++;
          }
            n = n / 10;
          }
        System.out.println(count);
    }
}
```
















