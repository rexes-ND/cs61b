public class Stutter {
    public static String stutter(String s) {
        int len = s.length();
        String res = "";
        for (int i = 0; i < len; ++i) {
            res += s.charAt(i);
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(stutter("Hello!"));
    }
}
