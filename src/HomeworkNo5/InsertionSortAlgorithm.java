package HomeworkNo5;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        //Declaring an array of type int and 15 elements
        int arr[]=new int[15];
        //1.Generating random values for elements of the array using the Math.random() method and for cycle
        //2.Printing out the values of the elements in the unsorted array
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Implementation of the Insertion Sort
        for(int i=1;i<arr.length;i++)
        {
            int val=arr[i];
            int index=i-1;
            // Moving elements of arr[0...i-1],
            // that are greater than val,
            // to one position ahead of
            // their current position
            while(index>=0 && arr[index]>val)
            {
                arr[index+1]=arr[index];
                --index;
            }
            arr[index+1]=val;
        }
        //Printing out the values of the elements in the sorted array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
