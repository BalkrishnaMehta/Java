public class Variable {
    int m = 10;
    static int n = 5;
    public static void main(String[] args)
    {
        Variable obj = new Variable();
        int  m = 4;
        System.out.println("Local Variable value: "+ m);
        System.out.println("Instance Variable value: "+ obj.m);
        System.out.println("Static Variable value: "+ n);

    }
}
