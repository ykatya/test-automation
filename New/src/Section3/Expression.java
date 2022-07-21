package Section3;

import java.util.regex.Pattern;

public class Expression {
    String text;
    Expression(String input ) {
        this.text = input;
    }
    public void analyzephone(){
        boolean result = Pattern.compile("^380\\d{9}.$").matcher(this.text).matches();
        System.out.println(result);
    }
    public void analyzetext(){
        boolean result = Pattern.compile("^[A-Z]+$").matcher(this.text).matches();
        System.out.println(result);
    }

}
