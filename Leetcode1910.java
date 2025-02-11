class Leetcode1910{
    public static String removeOccurrence(String s, String part){
        StringBuilder str = new StringBuilder(s);
        while(str.indexOf(part) != -1){
            int index = str.indexOf(part);
            str.delete(index, index + part.length());
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.print(removeOccurrence(s, part));
    }
}