public class Cal{     /* 类名 */
    public static void main(String args[]){    /* 主方法 */
        /* 临时变量 */
        int a = 20;    
        int b = 10;
        int c = 4;
        int d = 5;
        boolean e = true;
        boolean f = false;
        
        /* 打印运算结果 */
        /* 算术运算 */
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % c = " + (a % c));
        System.out.println("b % c = " + (b % c));
        System.out.println("d++ = " + (d++));
        System.out.println("d-- = " + (d--));
        System.out.println("++d = " + (++d));
        
        /* 关系运算 */
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        
        /* 逻辑运算 */
        c = a & b;       
        System.out.println("a & b = " + c );  /* 按位与操作 */
        c = a | b;      
        System.out.println("a | b = " + c );  /* 按位或操作 */
        c = a ^ b;    
        System.out.println("a ^ b = " + c );  /* 按位亦或操作 */
        c = ~a;       
        System.out.println("~a = " + c );     /* 按位取反操作 */
        c = a << 2;   
        System.out.println("a << 2 = " + c ); /* 左移位操作 */
        c = a >> 2;    
        System.out.println("a >> 2  = " + c );/* 右移位操作 */
        c = a >>> 2;     
        System.out.println("a >>> 2 = " + c );/* 右移位操作，空位补零 */
        
        System.out.println("e && f = " + (e && f));
        System.out.println("e || f = " + (e || f));
        System.out.println("!(a && b) = " + !(a && b));
    }
}
/* 普通运算基本与c类似 */
