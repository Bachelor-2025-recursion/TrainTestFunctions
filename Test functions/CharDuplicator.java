public class CharDuplicator {
    
    public static void main(String[] args) {
        System.out.println("Return is: " + dup("echo"));
    }

    static String dup(String s) {
        if (s.length() == 0)
            return "";

        return s.charAt(0) + s.charAt(0) + dup(s.substring(0, s.length() - 1));
    }
}
