public class PrintIndexed {
    public static void printIndexed(String s) {
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print(len-1-i);
        }
    }
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }
}
