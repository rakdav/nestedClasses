public class Math
{
    public static class Factorial
    {
        private int result;
        private int key;

        public Factorial(int result, int key) {
            this.result = result;
            this.key = key;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }
    public static Factorial getFactorial(int x)
    {
        int res=1;
        for(int i=1;i<=x;i++)
        {
            res*=i;
        }
        return new Factorial(res,x);
    }
}
