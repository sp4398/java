class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}
public class TestGeneric {
    public static void main(String[] args) {
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        System.err.println(m.get());
    }
}
