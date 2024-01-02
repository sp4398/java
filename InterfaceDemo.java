interface idemo{
    public void add();
    public void sub();
}
class abc implements idemo{
    public void add(){
        System.out.println("Addition Method");
    }
    public void sub(){
        System.out.println("Subtration Method");

    }
}
class InterfaceDemo extends abc{
    public static void main(String args[]) {
        InterfaceDemo id=new InterfaceDemo();
        id.add();
        id.sub();
    }
}
