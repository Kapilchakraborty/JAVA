import java.util.*;

class Bubblesort {
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
        //bubble sorting
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swaping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Bubble sorted array: ");
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