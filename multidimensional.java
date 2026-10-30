
import java.util.Scanner;
public class multidimensional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows array:");
        int m=scan.nextInt();
        System.out.println("Enter the number of columns array:");
        int n=scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the element of array:");
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("The entered array is:");
        for(int row=0;row<m;row++){
            for(int j=0;j<n;j++){
                System.out.print(arr[row][j]+" ");
            }
            System.out.println();
        }
    }
}
