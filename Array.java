import java.util.Scanner;
public class Array{
  public static void main(String args[]){
  int arr[][];
  int sum = 0;
  int row = 2;
  int col = 2;
  arr = new int[row][col];

for (int i = 0; i<row; i++){
	for (int j = 0; j < col; j++){
	Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer ");
	arr[i][j] = sc.nextInt();
	}
    }
   for (int i = 0; i<row; i++){
	for (int j = 0; j < col; j++){
	sum += arr[i][j];
        System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
	
	}
  
    }
  System.out.println("Sum is " + sum);
 }
}