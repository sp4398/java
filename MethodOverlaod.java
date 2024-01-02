class arithmetic{
    public void add(){
        System.out.println("Add Member");
    }
    public void add(int a, int b){
        int c=a+b;
        System.out.println("Addition is "+c);
    }
    public void add(int a, int b, int c){
        int d=a+b;
        System.out.println("Addition is "+d);
    }
}
public class MethodOverlaod {
    public static void main(String[] args) {
        arithmetic a=new arithmetic();
        a.add();
        a.add(4,5);
        a.add(4,5,7);
    }
}
