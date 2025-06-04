import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.readArray();
        simple.calculate();
        simple.display();
    }
}

class Simple {
    int a[] = new int[10];
    int n; // Declare 'n' as an instance variable to make it accessible to other methods.
    int evenCount = 0;
    int oddCount = 0;

    public void readArray() {
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void calculate() {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
    }

    public void display() {
        System.out.println("Even no count: " + evenCount);
        System.out.println("Odd no count: " + oddCount);
    }
}
