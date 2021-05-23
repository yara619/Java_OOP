package PS09;

public class RainDropConverter {
    public String convert(int number) {
        String rainDrops = "";

        if (number % 3 == 0) {
            rainDrops += "Pling";
        }

        if (number % 5 == 0) {
            rainDrops += "Plang";
        }

        if (number % 7 == 0) {
            rainDrops += "Plong";
        }

        if (rainDrops.length() == 0){
            rainDrops += Integer.toString(number);
        }
        return rainDrops;
    }
}
