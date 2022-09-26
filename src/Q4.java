public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            int row_sum=0;

            for(int j=0;j<3;j++){
                row_sum += arr[i][j];
            }
            System.out.println("Sum of all element of row no: "+ i +" : "+row_sum);
        }
        for(int i=0;i<3;i++){
            int col_sum=0;

            for(int j=0;j<3;j++){
                col_sum += arr[j][i];
            }
            System.out.println("Sum of all element of column no: "+ i +" : "+col_sum);
        }
    }
}
