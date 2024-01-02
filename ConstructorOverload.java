public class ConstructorOverload {
    int a;
    int b;
    public ConstructorOverload(){
        System.out.println("Default constructor");
    }
    public ConstructorOverload(int num1, int num2){
        a=num1;
        b=num2;
        int res=a+b;
        System.out.println("p");
    }


    public static void main(String[] args)
    {
        ConstructorOverload cc=new ConstructorOverload();
        System.out.println(cc);
        ConstructorOverload co=new ConstructorOverload();
        System.out.println(co);
    }
}
