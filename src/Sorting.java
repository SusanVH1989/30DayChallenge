import java.util.Scanner;

public class Sorting {
    private static final Scanner scanner = new Scanner(System.in);
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int swapCount=0,n=a.length;
    	for (int i=0;i<n;i++){
    		for(int j=0;j<n-1-i;j++){
    			if(a[j]>a[j+1]){
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    				swapCount++;
    			}
    		}
    	}
    	System.out.println("Array is sorted in "+swapCount+" Swaps" );
    	System.out.println("First Element: "+a[0]);
    	System.out.print("Last Element: "+a[n-1]);

    }



    public static void main(String[] args) {
  
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
