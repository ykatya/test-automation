package Section3;

public class Main {
    public static void main(String args[])
    {
        Circle.calculatearea(3);
        Circle.calculatecircumference(3);

        Expression exp = new Expression("380996783498");
        exp.analyzephone();
        Expression exp2 = new Expression("ABC");
        exp2.analyzetext();


    }
}
