public class Cal{     /* 类名 */
    public static void main(String args[]){    /* 主方法 */
        /* 临时变量 */
        int a = 20;    
        int b = 10;
        int c = 4;
        int d = 5;
        
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
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );
  
        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

    }
}
/* 普通运算基本与c类似 */
