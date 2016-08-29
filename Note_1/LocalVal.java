pubic class LocalVal{
    public void dogAge(){
        int age = 0;     /* age 是局部变量 */
        age = age + 8;
        System.ou.println("The age of dog is " + age);
    }
    
    public static void main(String args[]){
        LocalVal t = new LocalVal();
        t.dogAge();
    }
}
/* 局部变量声明在方法，构造函数或者语句块中 */
/* 局部变量在方法、构造函数、或者语句块被执行的时候创建，当执行完成之后，将销毁 */
/* 访问修饰符不能用于局部变量 */
/* 局部变量只能在声明它的方法，构造函数或语句块中可见 */
/* 局部变量在栈上分配 */
/* 局部变脸必须初始化之后才能使用，没有初始值编译时将会报错 */
