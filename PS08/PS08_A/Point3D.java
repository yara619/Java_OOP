package PS08.PS08_A;

public class Point3D extends Point2D{
    private float z;

    public Point3D (float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public Point3D (float z){
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ (){
        float x = getX();
        float y = getY();
        return new float[] {x , y , z};
    }

    public void setXYZ (float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    @Override

    public String toString (){
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
