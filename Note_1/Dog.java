public class Dog{
    int dogage;
    public Dog(String name){
        System.out.println("Dog name is " + name);
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
