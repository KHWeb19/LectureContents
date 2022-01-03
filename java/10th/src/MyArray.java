public class MyArray {
    int dimension;

    final int D2 = 2;
    final int D3 = 3;

    MatrixD2 matD2;
    MatrixD3 matD3;

    public void initMyArray (int dim) {
        dimension = dim;

        if (dim == D2) {
            matD2 = new MatrixD2();
            matD2.initMatrix();
        } else if (dim == D3) {
            matD3 = new MatrixD3();
            matD3.initMatrix();
        }
    }

    public void printArray () {
        if (dimension == D2) {
            matD2.printMatrix();
        } else if (dimension == D3) {
            matD3.printMatrix();
        }
    }
}
