package Matrix;

public class RotateMatrix {
    void rotatematrix(int m,
                      int n, int mat[][]) {
        int previous = 0;
        int current = 0;
        int row = 0, column = 0;
        int x=m,y=n;
        for (int i = 0; i < x / 2 && i < y / 2; i++) {
            previous=mat[row][column];
            for (int j = column; j < n-1; j++) {
                current = mat[row][j+1];
                mat[row][j+1] = previous;
                previous=current;
            }
            for (int j=row+1;j<m;j++){
                current = mat[j][m-1];
                mat[j][m-1]=previous;
                previous=current;
            }
            for (int j=n-2;j>=column;j--){
                current=mat[m-1][j];
                mat[m-1][j]=previous;
                previous=current;
            }
            for (int j=m-2;j>=row;j--){
                current=mat[j][column];
                mat[j][column]=previous;
                previous=current;
            }
            row=row+1;
            column=column+1;
            m=m-1;
            n=n-1;
        }
    }
    void display(int R,int C,int mat[][]){
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            RotateMatrix rM = new RotateMatrix();
            int a[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int R = a.length;
            int C = a[0].length;
            rM.display(R,C,a);
            rM.rotatematrix(R, C, a);
            rM.display(R,C,a);
        }
    }
