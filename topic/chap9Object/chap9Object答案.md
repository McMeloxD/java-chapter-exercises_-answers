# chap9Object

------

## 题1

```java
//finalize方法在对象没有任何引用指向，被回收的时候调用
//toString()：返回当前对象的字符串表达 
//equals:判断两个对象的内容是否相同
```

## 题2

------

```java
toString():String   
equals(Object):boolean   
```

------

## 题3

```java
运行结果：
    null 0  //String默认值null，int默认值0
    Tom 18
```

------

## 题4

```java
运行结果：这里判断两个对象在内存中的地址是否相同
    true //这里判断两个对象的内容是否相同
    false //这里判断两个对象在内存中的地址是否相同，也就两个引用是否指向同一个对象
```

------

## 题5

```java
运行结果：
    true //instanceof 判断当前对象是否是该类的实例
    false //getClass返回一个对象的类对象,返回class+类在包中的位置，这里a2指向的是Anmial类对象，a1指向的Dog类对象
```

------

## 题6

```java
int -->  Integer   Integer it = new Integer(int类型变量)
Integer --> int   it.intValue()
String --> Integer  Integer.valueOf(str) / Integer num = Integer.parseInt(str);
Integer --> String  it.toString()
int --> String  String.valueOf(i)
String --> int  Integer.parseInt(Str)
```

------

## 题7

```java
ABCD
    a、成员内部类
成员内部类-----就是位与外部类成员位置的类

特点：可以使用外部类中所有的成员变量和成员方法（包括private）

如果我们的内部类不想轻易被任何人访问，可以选择使用private修饰内部类，这样我们就无法通过创建对象的方法来访问，想要访问只需要再外部类中定义一个public修饰的方法，间接调用。这样做的好处就是，我们可以在这个public方法中增加一些判断语句，起到数据安全的作用。

b、静态内部类
这种被static所修饰的内部类，按位置分，属于成员内部类，但也可以称作静态内部类，也常叫做嵌套内部类，不能使用外部类的非static成员变量和成员方法

c、局部内部类
定义在一个方法或者一个作用域里面的类

特点：主要是作用域发生了变化，只能在自身所在方法和属性中被使用

d、匿名内部类
一个没有名字的类，是内部类的简化写法

3、内部类的特点
内部类仍然是一个独立的类，在编译完成后内部类会被编译成独立的.class文件，但是前面冠以外部类的类名和$符号

内部类不能用普通的方式访问。内部类是外部类的一个成员，因此内部类可以自由地访问外部类的成员变量，无论是否为private的

内部类声明成静态的，就不能随便访问外部类的成员变量，仍然是只能访问外部类的静态成员变量

```

------

## 题8

```java
输出结果：
    true   //指向字符串常量池中的同一个对象
    true
    false //指向不同的对象
    true
    //String str="abc"创建字符串，如果String常量池中有个字符串，则str就指向"abc"内存象地址，多次声明"abc",内存中只会有一个"abc"。
    //因为Java会自动将字符串常量放入字符串常量池中,并在创建字符串对象时,重用已经存在的相同内容的字符串常量

//String str = new String("abc")创建字符串，不管String常量池中是否有个字符串，都会重新分配，然后str指向它。内存中可能会有两个不同内存地址的"abc"。
```

------

## 题9

```java
 //equals方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Worker) {
            Worker worker = (Worker) obj;
            return name.equals(worker.name) && age == worker.age
                    && salary == worker.salary && addr.equals(worker.addr);
        }
        return false;
    }
//返回打印
public String toString() {
        return "姓名：" + name + "\t年龄：" + age
                + "\t工资：" + salary + "\t家庭住址："+
                addr.getAddress() + "\t邮政编码为：" + addr.getZipCode()
                ;
    }
```

------

## 题10

```java
public class Account {
    static int count = 0;
    private final Long ID; // 账户id
    private double balance; // 账户余额
    private String password; // 账户密码

    public Account(){
        this.ID = Long.valueOf(10001 + count);  //long转Long基本类型的包装类型
        count++;
    }
```

------

## 题11

```java
public class TestToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(toInt(str));
        System.out.println(toInt2(str));
    }
    //第一种
    public static int toInt(String str) {
        int n = Integer.parseInt(str);
        return n;
    }

    //第二种
    public static int toInt2(String str) {
        Integer it = Integer.valueOf(str);
        int n = it.intValue();
        return n;
    }
}
```

------

## 题12

```java
A B C  只要前面有字符串类型 后面自动拼接成字符串，D这里字符串“ ”放在最后面，前面一个对象 一个int  是不能使用字符串连接的。
```

------

## 题13

```java
C. 编译通过，输出：“MyClass toString()”  执行看子类，子类已经重写了Object的toString方法。所有类都默认继承Object类
```

------

## 题14

```java
运行结果：
    in method    //1
    ma in anonymous inner class
    in method
    ma in local inner class
    //1这里是匿名内部类，MyClass.method(new IA(){
MyClass.method(new IA(){ //这里相当传值了一个实例化了IA接口的实现类，只是没有类名，直接实现方法，并没有类名
	public void ma(){  
		System.out.println(“ma in anonymous inner class”);
    }
})
```

------

## 题15

```java
ABCD都可以
    public class OuterClass {
    private int value1 = 100;
    private static int value2 = 200;

    public void method(int value3) {
        final int value4 = 400;
        class InnerClass {
            public void print() {
                System.out.println(value1);
                System.out.println(value2);
                System.out.println(value3);
                System.out.println(value4);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.method(300);
    }
}
//定义在外部类方法中，作用范围和创建对象范围仅限于当前方法。
//局部内部类访问外部类当前方法中的局部变量时，因无法保证变量的生命周期与自身相同，变量必须修饰为final。
```

------

## 题16

```java
//1局部内部类：
class JuLamp implements Light{
    public void shine(){
        System.out.println("shine in red");
    }
}
//调用方法输出
lamp.on(new JuLamp());

//2匿内部类  
//这里相当传值了一个实例化了Light接口的实现类，只是没有类名，直接实现方法，并没有类名
        lamp.on(new Light() {
            @Override
            public void shine() {
                System.out.println("SHINE IN Yello");
            }
        });
```

