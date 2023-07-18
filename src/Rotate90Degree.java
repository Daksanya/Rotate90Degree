import java.util.Scanner;

public class Rotate90Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]=scanner.nextInt();
            }

        }
        transpose(array,n);
        rotate(array,n);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] array,int n){
        for (int i=0;i<n;i++) {
            int temp = 0;

            for (int j = 0; j <= i; j++) {
                temp = array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
    }
    static void rotate(int[][] array,int n){
        for (int i=0;i<n;i++) {
            int temp = 0,k=0,j=n-1;

            while(k<j){
                temp = array[i][j];
                array[i][j]=array[i][k];
                array[i][k]=temp;
                k++;j--;
            }
        }
    }

}
