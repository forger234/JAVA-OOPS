import java.util.Scanner;

public class deletion {
    public static void main(String[] ar) {
        int n, i, item, flag = 0, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the values: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be deleted: ");
        item = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == item) {
                flag = 1;
                // Start shifting from the index of the item
                for (j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                n = n - 1; // reduce array size
                break;     // delete only the first occurrence
            }
        }

        if (flag == 0) {
            System.out.println("Item not found.");
        } else {
            System.out.print("After Deletion: ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
