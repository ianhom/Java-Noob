/* 类为student */
public class Student{
    public String name;    /* 成员变量               */
    private double score;  /* 成员变量，仅在本类可见 */
    
    /* 构造函数 */
    public Student(String stName){    
        name = stName;
    }
    
    /* 方法：设置分数 */
    public void setScore(double stScore){   
        score = stScore;
    }
    
    /* 方法：打印名字和分数 */
    public void printSt(){     
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    
    public static void main(String args[]){
        Student s = new Student("Ye");      /* 创建一个student的对象s，生成的同时调用构造函数设置名字 */
        s.setScore(100);                    /* 调用方法设置对象s的分数 */
        s.printSt();                        /* 调用方法打印姓名和分数  */
    }
}
