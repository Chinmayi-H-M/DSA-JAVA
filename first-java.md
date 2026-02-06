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












