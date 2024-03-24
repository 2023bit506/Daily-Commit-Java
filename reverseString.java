public class reverseString {
    public String getData(String s1)
    {
        String nstr = " ";
        char ch;
        for(int i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;

    }
    public static void main(String[] args) {
        reverseString obj1 = new reverseString();
        String s1 = "Hello";
        System.out.println(obj1.getData(s1));
    }
}
