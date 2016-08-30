public class Students2{
    private static double score;
    public static final String GOV = "管理"；
    public static void main(String args[]){
        score = 100;
        System.out.println(GOV + "得分： " + score);
    }
}
/* 类变量也称为静态变量，在勒种以static关键字声明，但必须在方法和构造函数和语句块之外 */
/* 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝 */
/* 静态变量除了被声明为常量以外很少使用，常量是指声明为public/private/final/static类型的变量，常量初始化后不可改变 */
/* 静态变量储存在静态储存区，经常被声明为常量，很少单独使用static声明变量 */
/* 静态变量在程序开始时创建，在程序结束时销毁 */
/* 与成员变量有相似的可见性。但为了对类的使用者可见，大多数静态变量声明public类型 */
/* 默认值和成员变量相似。数值型默认为0，布尔型默认为false，引用类型默认值是null，变量的值可以在声明的时候制定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。*/
/* 静态变量可以通过：ClassName.VariableName的方式访问 */
/* 类变量被声明为public static final类型时，类变量名称必须使用大写字母。如果静态变量不是public和final类型，其命名方式与成员变量以及局部变量的命名方式一致 */
