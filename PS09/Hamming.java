package PS09;

public class Hamming {
    private String DNA1 = "";
    private String DNA2 = "";

    public Hamming(String DNA1, String DNA2){
        if (DNA1.length() != DNA2.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.DNA1=DNA1;
        this.DNA2=DNA2;
    }

    public int getHammingDistance(){
        int count = 0;
        for (int i=0; i<DNA1.length(); i++){
            if (DNA1.charAt(i)!=DNA2.charAt(i)){
                count++;
            }
        }
        return count;
    }

}