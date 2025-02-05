public class LeetCode1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int count = 0;
        int[] diff = new int[2];
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(count == 2) return false;
                diff[count++] = i;
            }
        }
        return count == 0 || (count == 2 && s1.charAt(diff[0]) == s2.charAt(diff[1]) && s1.charAt(diff[1]) == s2.charAt(diff[0]));
    }
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
