import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of an Array");
            int size = input.nextInt();

            if(size<=0){
                System.out.println("Please enter a number greater than 0");
                System.exit(0);
            }

            int[] arr = new int[size];

            System.out.println("Enter the Elements of an Array");

            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            for(int i=1; i<arr.length;i++){
                int temp=arr[i];
                int j=i-1;
                while(j>=0 && temp < arr[j]){
                    //swap
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
            }

            System.out.println("Insertion Sorted");
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();

            input.close();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer!!!");
        }

    }
    }