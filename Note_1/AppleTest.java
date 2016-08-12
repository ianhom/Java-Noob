class Apple{
    enum AppleSize {SMALL, MID, BIG}
    AppleSize size;
}

public class AppleTest{
    public static void main(String []args){
        Apple apple = new Apple();
        apple.size  = Apple.AppleSize.BIG;
        System.out.println("Hello World");
        System.out.println("Apple size is" + apple.size);
    }
}
