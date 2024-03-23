public class sameCharacters 
{
    public String getData(String s4)
    {
        char[] ch = s4.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if (ch[i] != ch[0]) 
            {
                return "False";    
            }
        }
        return "True";
    }
    public static void main(String[] args)
    {
        sameCharacters s1 = new sameCharacters();
        String s4 = "PpP";
        System.out.println(s1.getData(s4));
    }    
}
