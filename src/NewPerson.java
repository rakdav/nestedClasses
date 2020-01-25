public class NewPerson
{
    private String name;

    public NewPerson(String name) {
        this.name = name;
    }
    public void setAccount(String password)
    {
        class Account//локальный
        {
            void display()
            {
                System.out.println("Account "+name+" password "+password);
            }
        }
        Account account=new Account();
        account.display();
    }
}
