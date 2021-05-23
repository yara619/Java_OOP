package PS09;

public class RnaTranscription {
    public String transcribe(String sentence){
        String result = "";
        for (int i=0; i<sentence.length(); i++){
            Character check = sentence.charAt(i);
            if (check.equals('G')){
                result+="C";
            }else if (check.equals('C')){
                result+="G";
            }else if (check.equals('T')){
                result+="A";
            }else if (check.equals('A')){
                result+="U";
            }
        }
        return result;
    }
}