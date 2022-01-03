public class MatrixD3 {
    final int RANGE = 10;
    final int DIM = 3;

    private int[][][] mat;

    public void initMatrix () {
        mat = new int[DIM][DIM][DIM];

        System.out.println("텐서 생성");

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                for (int k = 0; k < DIM; k++) {
                    mat[i][j][k] = (int) (Math.random() * RANGE);
                }
            }
        }
    }

    public void printMatrix () {
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                for (int k = 0; k < DIM; k++) {
                    System.out.printf("%3d", mat[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
