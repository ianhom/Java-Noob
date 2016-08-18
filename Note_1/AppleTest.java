class Apple{
    enum AppleSize {SMALL, MID, BIG}
    AppleSize size;
}

/* 一个源文件中可以有很多类，但只能有一个public类，且类名同文件名 */
public class AppleTest{
    public static void main(String []args){
        Apple apple = new Apple();
        apple.size  = Apple.AppleSize.BIG;
        System.out.println("Hello World");  /* 纯字符串同C语言的printf，无需增加\n来换行 */
        System.out.println("Apple size is" + apple.size);  /* 如果有参数需要打印，直接在双引号之外写明，通过加号连接 */
    }
}
