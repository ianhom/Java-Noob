public class Dog{                /* 狗的类 */
    int dogage;                  /* 狗的参数：年龄 */
    public Dog(String name){     /* 与类名同名的是构造函数，在new时自动调用，无返回值 */
        System.out.println("Dog name is " + name);  /* 在new一个狗的对象时，要求输出狗的名字 */
    }
    
    public void setAge(int age){
        dogage = age;
    }
    
    public int getAge(){
        System.out.println("Dog age is " + dogage);
    }
    
    public static void main(String []agrs){
        int age = 0;
        Dog littleDog = new Dog("Wangwang");
        littleDog.setAge(3);
        age = littleDog.getAge();
        System.out.printf("The age is " + age);
    }
}
