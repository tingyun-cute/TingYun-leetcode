package doing;

public class Test1 {
    public static void main(String[] args) {
        String s = "abcabcabc";
        boolean res = test(s);
        System.out.println(res);
    }

    public static boolean test(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            int left = i + 1;
            int right = i + 1 + i;
            while (right < s.length()) {
                String s2 = s.substring(left, right);
                if (!s1.equalsIgnoreCase(s2)) {
                    continue;
                }
                left = left + i;
                right = right + i;
            }
        }
        return true;
    }
}
