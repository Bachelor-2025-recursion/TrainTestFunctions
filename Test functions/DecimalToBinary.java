public class DecimalToBinary {
    
    public static void main(String[] args) {
        System.out.println("Return is: " + decToBin(4));
    }

    static int decToBin(int d) {
        if (d == 0)
            return 0;

        return (d % 2 + 10 * decToBin(d / 2));
    }
}
