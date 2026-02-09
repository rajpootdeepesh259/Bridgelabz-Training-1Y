class SumOfTwoDMatrix
{
public static void main(String args[])
{
int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
int arr2[][]={{7,8,9},{6,5,4},{3,2,1}};
int row = arr1.length;
int col = arr2.length;
for(int i=0;i<row;i++){
	for(int j=0;j<col;j++){
		System.out.print(arr1[i][j]+ arr2[i][j] + " ");
	}
	System.out.println();
}
}
}

