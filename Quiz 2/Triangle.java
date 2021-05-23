class Triangle {
    private double s1;
    private double s2;
    private double s3;


    Triangle(double s1, double s2, double s3) throws TriangleException {

        this.s1=s1;
        this.s2=s2;
        this.s3=s3;

    }

    boolean isEquilateral() {
        return s1 == s2 && s2 == s3;
    }

    boolean isIsosceles() {
        return s1 == s2 || s1 == s3 || s3 == s2;
    }

    boolean isScalene() {
        return s1 != s2 && s1 != s3 && s2 != s3;
    }

}
