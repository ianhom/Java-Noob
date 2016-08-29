public class Student{
    public String name;
    private double score;
    public Student(String stName){    /* 构造函数 */
        name = stName;
    }
    
    public void setScore(double stScore){   /* 方法：设置分数 */
        score = stScore;
    }
    
    public void printSt(){     /* 方法：打印名字和分数 */
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
    
    public static void main(String args[]){
        Student s = new Student("Ye");
        s.setScore(100);
        s.printSt();
    }
}
