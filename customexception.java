import java.lang.Exception;
class AgeValidation extends Exception{
    public AgeValidation(String s){
        super(s);
    }
}
class customexception {
    static void checkAge(int age) throws AgeValidation{
        if(age<18){
            throw new AgeValidation("Age is not Valid");
        }
        else{
            System.out.println("Age is Valid");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(19);
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
