abstract class animal{
    public abstract void running();
    public abstract void playing();

    public void add(){
        System.out.println("Regular Method");
    }
}

class human extends animal{
    public void running(){
        System.out.println("Running Method");
    }
    public void playing(){
        System.out.println("Playing Method");
    }
}

public class MainClass {
    public static void main(String[] args) {
        human h=new human();
        h.running();
        h.playing();
        h.add();
    }
}
