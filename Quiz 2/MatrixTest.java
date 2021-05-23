import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix a = new Matrix("1 2\n3 4");
        System.out.println(Arrays.toString(a.getColumn(2)));
        System.out.println(Arrays.toString(a.getRow(1)));
    }
}