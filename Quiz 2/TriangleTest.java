public class TriangleTest {
    public static void main(String[] args) throws TriangleException {
        Triangle one = new Triangle(56,2,2);
        System.out.println(one.isEquilateral());
        System.out.println(one.isIsosceles());
        System.out.println(one.isScalene());
    }
}