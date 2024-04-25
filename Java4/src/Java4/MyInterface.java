package Java4;
//接口中的抽象方法修饰符必须是两个固定的关键字：public abstract
//方法的三要素可以随意定义
public interface MyInterface {
    public abstract void methodAbs();
    public static void main(String[] args){
        MyInterfaceImpl impl=new MyInterfaceImpl();
        impl.methodAbs();
    } 
}
