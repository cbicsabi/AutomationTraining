package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    private static String ANA = "Ana are multe mere, vreo 30 mai exact";
    private static String TEXT = "numbers 30";

    public static void main(String[] args) {

        match();
    }

    private static void searchWords(){

        Pattern words = Pattern.compile("\\d+");
        Matcher matcher = words.matcher(ANA);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    private static void match(){

        Pattern pattern = Pattern.compile("^(\\w+) (\\d+)$");
        Matcher matcher = pattern.matcher(TEXT);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
