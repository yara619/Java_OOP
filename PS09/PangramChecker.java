package PS09;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean isPangram(String sentence){
        boolean result = true;

        Map<Character, Integer> dict = new HashMap<>();
        for (char i='a'; i<='z'; i++){
            dict.put(i, 0);
        }

        sentence=sentence.toLowerCase();
        for (int i=0; i<sentence.length(); i++){
            for (Character check : dict.keySet()){
                if (sentence.charAt(i)==check){
                    dict.put(sentence.charAt(i), 1);
                }
            }
        }

        for (int num : dict.values()){
            if (num==0){
                result=false;
                break;
            }
        }

        return result;
    }
}