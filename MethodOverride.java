class demo{
    public void eat(){
        System.out.println("I am eating");
    }
}
public class MethodOverride extends demo {
    @Override
    public void eat(){
        System.out.println("I am playing");
    }

    public static void main(String[] args) {
        MethodOverlaod mo =new MethodOverlaod();
        System.out.println(mo);
    }
}
