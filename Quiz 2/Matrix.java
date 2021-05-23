class Matrix {
    public int[][] n;

    Matrix(String matrixAsString) {
        String[] a = matrixAsString.split("\n", -1);
        String[][] b =new String[a.length][a[0].split(" ", -1).length];
        int count =0;


        for (String s : a){
            b[count]=s.split(" ", -1);
            count++;
        }

        int[][] matrix = new int[b.length][b[0].length];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                matrix[i][j]=Integer.parseInt(b[i][j]);
            }
        }
        n = matrix;
    }

    int[] getRow(int rowNumber) {
        return n[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] col=new int[n.length];
        for (int i=0;i<n.length;i++){
            col[i]=n[i][columnNumber-1];
        }
        return col;
    }
}