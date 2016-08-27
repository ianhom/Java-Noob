public class TypeTest{
    public static void main(String[] args){
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最大值：Byte.MIN_VALUE="+ Byte.MIN_VALUE);
        System.out.println("最小值：Byte.MAX_VALUE="+ Byte.MAX_VALUE);
        System.out.println();
        
        System.out.println("basic type: short binary:" + Short.SIZE);
        System.out.println("package class: java.lang.Short");
        System.out.println("Max. Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("Max. Short.MAX_VALUE=" + Short.MAX_VALUE);
        
        System.out.println("basic type: int binary:" + Integer.SIZE);
        System.out.println("package class: jave.lang.Integer");
        System.out.println("Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        
        System.out.println("basic type: long binary" + Long.SIZE);
        System.out.println("package class: java.lang.Long");
        System.out.println("Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE=" + Long.MAX_VALUE);
        
        System.out.println("basic type: float binary" + Float.SIZE);
        System.out.println("package class: java.lang.Float");
        System.out.println("Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE=" + Float.MAX_VALUE);
        
        System.out.println("basic type: double binary" + Double.SIZE);
        System.out.println("package class: java.lang.Double");
        System.out.println("Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE=" + Double.MAX_VALUE);
        
        System.out.println("basic type: char binary" + Character.SIZE);
        System.out.println("package class: java.lang.Character");
        System.out.println("Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE=" + (int) Character.MAX_VALUE);
    }
}
