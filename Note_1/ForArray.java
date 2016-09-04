public class ForArrayTest{
    public static void main(String args[]){
        int [] Array = {1,2,3,4,5};
        for(int x : Array)
        {
            System.out.println("x is : " + x);
        }
    }
}
/* 与C中不同，新增了针对数组的循环语句，int x为数组的值，而Array为数值名 */
