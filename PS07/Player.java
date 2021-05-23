import PS07.Ball;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void move (float xDisp, float yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump (float zDisp){
        this.z += zDisp;
    }

    public boolean near (Ball ball){
        double xValue = Math.pow((ball.getX() - x), 2);
        double yValue = Math.pow((ball.getY() - y), 2);
        double zValue = Math.pow((ball.getZ() - z), 2);

        return Math.sqrt((xValue + yValue + zValue)) < 8;
    }

    public void kick (Ball ball){
        double xValue = Math.pow((ball.getX() - x), 2);
        double yValue = Math.pow((ball.getY() - y), 2);

        double distanceAfterKick = Math.sqrt((xValue + yValue));

        if (near(ball)){
            System.out.println("Kick the Ball!");
        }
        else {
            System.out.println("Ball is too far!");
        }
    }
}