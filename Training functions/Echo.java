public class Echo {
    
    public static void main(String[] args) {
        System.out.println(echo("hello"));
    }

    static String echo(String s) {

        if (s.length() == 1)
            return s;

        return s + " " + echo(s.substring(0, s.length() - 1));
    }

}