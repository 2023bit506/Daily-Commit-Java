public class userException {
    
    final String userName;
    final String password;

    public userException(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    public void userLogin(String uname, String pass)throws Exception
    {
        if (uname==userName || pass==password) 
        {
            System.out.println("Login Successful.....");    
        }
        else
        {
            throw new Exception("Invalid username or password.....");
        }
    }
    
    public static void main(String[] args) throws Exception {
        userException e1 = new userException("Shubham", "1234");
        e1.userLogin("s", "4");
    }
}
