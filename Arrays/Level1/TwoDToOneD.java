class TwoDToOneD
{
public static void main(String args [])
{
int [][]arr2D = {{1,2,3},{4,5,6},{7,8,9}};
int rows = arr2D.length;
int cols = arr2D.length;
int [] arr1D = new int[rows*cols];
int index = 0;
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		arr1D[index++]=arr2D[i][j];
	}
}
System.out.print(.toString(arr1D));
}
}
