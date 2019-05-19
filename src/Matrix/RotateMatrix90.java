package Matrix;

public class RotateMatrix90 {
    void rotateMatrix(int N,int mat[][]) {
        int top = 0, left = 0;
        int down = N, right = N;
        for(int i=0;i<N/2;i++){
            for (int j=i;j<N-i-1;j++){
                /*int temp=mat[][];*/
            }
        }
    }
    void display(int N,int mat[][]){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        RotateMatrix90 rotateMatrix90=new RotateMatrix90();
        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };
        int N=mat.length;
        rotateMatrix90.display(N,mat);
        rotateMatrix90.rotateMatrix(N,mat);
        rotateMatrix90.display(N,mat);

    }
}
