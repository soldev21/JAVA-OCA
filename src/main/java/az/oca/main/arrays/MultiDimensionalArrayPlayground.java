package az.oca.main.arrays;

public class MultiDimensionalArrayPlayground {
    public static void main(String[] args) {
//        int a[][] = {{1},{1,1,1},{1,1},{1,1,1,1,1,1,1}};
        int b[][][][][][]= new int[1][2][3][4][5][6];
        int a[][] = new int[3][];
        a[0] = new int[]{1,2,3};
        a[1] = new int[]{4,5};
        a[2] = new int[]{6,7,8,9};
        print(a);
    }

    private static void print(int a[][]){
        int k = a.length;
        for (int i=0;i<k;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
