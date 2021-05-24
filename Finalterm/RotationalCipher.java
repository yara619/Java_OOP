public class RotationalCipher {
    private String inputString;
    private int rot;

    public RotationalCipher(int rot) {
        this.rot = rot;
    }


    public String rotate (String inputString) {
        StringBuilder finalResult = new StringBuilder();
        char[] text = inputString.toCharArray();



        for(char a : text) {
            boolean isUpper = a > 64 && a < 91;
            boolean isLower = a  > 96 && a < 123;

            char afterShift = a;

            if (isUpper){
                afterShift = (char) ((a - 65 + rot) % 26 + 65);
            } else if (isLower){
                afterShift = (char) ((a - 97 + rot) % 26 + 97);
            }
            finalResult.append(afterShift);
        }
        return finalResult.toString();
    }
}