package PS09;

public class Darts {
    private double x;
    private double y;

    public Darts(double x, double y){
        this.x=x;
        this.y=y;
    }

    public int score(){
        int result = 0;
        double check = Math.sqrt(Math.pow(this.x-0, 2) + Math.pow(this.y-0,2));
        if (check >=0 && check <=1){
            result=10;
        }else if (check >1 && check <=5){
            result=5;
        }else if (check > 5 && check <=10){
            result=1;
        }
        return result;
    }
}