import java.io.IOException;

class throwsdemo {
    void m() throws IOException{
        throw new IOException("device errror");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("exception Handled");
        }
    }
    public static void main(String[] args) {
        throwsdemo obj =new throwsdemo();
        obj.p();
        System.out.println("Normal Flow....");
    }
}
