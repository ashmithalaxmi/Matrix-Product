import java.util.Scanner;

public class MatrixProduct {
    static int[][] product(int[][] arr, int row, int col, int b){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]*=b;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int b = sc.nextInt();
        arr =(product(arr, row, col, b));
        for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+ " ");
            }
        }

    }
}
