public class Main
{
    public static void main(String[] args) {
        Math.Factorial fact=Math.getFactorial(6);
        System.out.println("Факториал числа "+fact.getKey()+" равен "+fact.getResult());

        Person tom=new Person("Tom","qwerty");
        tom.displayPerson();
        tom.account.displayAccount();

        NewPerson Sam=new NewPerson("Sam");
        Sam.setAccount("qwerty");
    }
}
