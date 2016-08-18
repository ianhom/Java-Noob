public class Dog{                /* 狗的类 */
    int dogage;                  /* 狗的参数：年龄 */
    public Dog(String name){     /* 与类名同名的是构造函数，在new时自动调用，无返回值 */
        System.out.println("Dog name is " + name);  /* 在new一个狗的对象时，要求输出狗的名字 */
    }
    
    public void setAge(int age){  /* 狗的对象的方法：设置年龄 */
        dogage = age;
    }
    
    public int getAge(){          /* 狗的对象的方法：获取年龄 */
        System.out.println("Dog age is " + dogage);
    }
    
    public static void main(String []agrs){    /* 函数从这里开始运行 */
        int age = 0;
        Dog littleDog = new Dog("Wangwang");   /* 创建一个狗的对象littleDog，名字叫旺旺 */
        littleDog.setAge(3);                   /* 调用狗对象的方法来设置年龄 */
        age = littleDog.getAge();              /* 调用狗对象的方法来获取年龄 */
        System.out.printf("The age is " + age);/* 打印年龄 */ 
    }
}
