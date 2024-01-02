public class throwdemo {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied : you must be atleast 18 years old");
        }
        else{
            System.out.println("Access : you are old enough");
        }
    }
    public static void main(String[] args){
        checkAge(19);
    }
}
