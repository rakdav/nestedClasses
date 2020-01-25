public class Person
{
    private String name;
    Account account;

    public Person(String name,String passwd) {
        this.name = name;
        account=new Account(passwd);
    }

    public class Account
    {
        private String password;

        public Account(String password) {
            this.password = password;
        }
        void displayAccount()
        {
            System.out.println("Account Login:"+Person.this.name+
                    " password "+password);
        }
    }
}
