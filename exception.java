public class exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int q=a+b;
            System.out.println(q);
            int s=a-b;
            System.out.println(s);
            int m=a*b;
            System.out.println(m);
            int c=a/b;
            System.err.println(c);
            int res=a+b;
            System.err.println(res);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally block executated");
        }
    }
}
