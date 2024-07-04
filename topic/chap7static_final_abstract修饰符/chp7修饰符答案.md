# Chp7 三个修饰符

------



## 题1

```java
运行结果：
    300 //这里是因为a变量是被static静态修饰的，被该类的所有对象共享，不单独属于某个对象
    200 // 第一次赋值确实是100，不过m2调用的时候还是同一个地址,被其修饰的方法或变量在内存中只有一份
    300
    400
```

------



## 题2

```java
//5报错
//7报错 
//是因为m2是静态方法，在静态方法内部只能调用静态变量或静态方法，非静态的方法内可以调用非静态或静态的变量和方法。
```

------



## 题3

```java
运行结果：
    1 ////本题还是count变量是被static静态修饰的，被该类的所有对象共享，不单独属于某个对象
    2
    3
```

------



## 题4

```java
运行结果：
    In Static ////static{}(即static块)，会在类被加载的时候执行且仅会被执行一次，一般用来初始化静态变量和调用静态方法
    MyClass()
    20  
    MyClass(int)
    10
```

------



## 题5

```java
运行结果：
    m1 in Super //执行顺序：父类的静态，子类静态，父类非静态，父类构造方法，子类非静态，子类构造方法。所以这里先执行父类的静态方法
    m2 in Sub
    m1 in Sub //因为sub是将原本Super类的对象直接强制向下转型了，指向的还是原本地址，原本对象的父类静态已经调用过了，所以调用子类的
    m2 in Sub
```

------



## 题6

```java
正确的有：
A D E
//B非静态方法可以调用非或静态方法；C静态方法可以被重写覆盖；F但是静态方法里不能用this，因为它不属于任何一个对象，是该类所有对象共享的。
```

------



## 题7

```java
正确答案：C
    //这里是因为 final变量是需要初始化的，要么在声明时就初始化赋值，要么可以在构造方法内进行赋值，但是要在所有构造方法中都有初始化，也就是说要保证要么声明就初始化，要么每个构造方法都要保证创建对象时能对其进行赋值。
```

------



## 题8

```java
这道题编译通过，//4这里输出20，是因为changeValue方法只是将常量fvalue的值传入当作一个参数在栈种进行计算，传入的并不是常量在堆中的地址，方法结束后这个值就消失了，并没有改变内存堆中常量的值,常量本身并没有变化。
```

------



## 题9

```java
C,//final可以修饰类，属性，方法，也可以是对象，修饰对象后，该对象的指向无法改变，但值或内容是可以改变的。
```

------



## 题10

```java
可以通过,
运行结果：
    m1() in Super
    m1(int) in Sub
    m1(double) in Subt
```

------

## 题11

```java
//B后面花括号删了
//C 这里有错误，子类重写父类方法的时候，修饰符也要一样，这里加一个public即可
```

------

## 题12

```java
正确答案：
    A B(子类不重写或者没写完父类抽象方法，也要变抽象类) C D
```

------

## 题13

```java
正确答案： D F
     
    A  C E错在：抽象方法要被子类继承重写，所以不能用final和private或static修饰
    B 错在final要放在void前面
```

------



## 题14

```java
public abstract class Shape {
    //求面积
    public abstract double area();

    //求周长
    public abstract double girth();
}
```

------



## 题15

```java
public abstract class Role {
    private String name; //角色名字

    //返回角色的攻击对敌人的伤害。
    public abstract int attack();
}
```

------

## 题16

```java
public class MyClass {
    static int count = 0; //不管该类多少个对象，共享这个属性

    public MyClass(){
        //统计创建了多少个对象
        count++;
        System.out.println("这是第" + count + "个对象");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new MyClass();
        }
        System.out.println("创建了" + count + "个对象");
    }
}
```

------

## 题17

```java
//Account类
public class Account {
    static int count = 0; //声明一个常量
    private final long ID; // 账户id
    private double balance; // 账户余额
    private String password; // 账户密码

    public Account(){
        //每次创建对象都+常量来统计
        this.ID = 10001 + count;
        count++;
    }
}
//Test类
public class TestAc {
    public static void main(String[] args) {
        Account arr[] = new Account[10];
        for (int i = 0; i < 10; i++){
            arr[i] = new Account();
        }
        for (Account num : arr){
            System.out.println(num.getID());
        }
    }
}
```

------

## 题18

```java
	//java类的初始化执行顺序
    1.无继承关系的类
    //静态变量→静态代码块→非静态变量→非静态代码块→构造方法
	2.有继承关系的类
    //父类静态变量→父类静态代码块→子类静态变量→子类静态代码块→父类非静态变量→父类非静态代码块→父类构造方法→子类非静态变量→子类非静态代码块→子类构造方法
    3.总结：
    //静态变量和静态代码块初始化是平级的，按照从上往下的顺序执行
	//静态变量（代码块）比非静态变量（代码块）先初始化
	//静态变量（代码块）只初始化一次，非静态变量（代码块）可以初始化多次
    //静态对象是一种特殊的对象,它只会被创建一次并且在整个程序的生命周期中都存在
	//父类比子类先初始化
运行结果：
	//mc1初始化
    In ClassA Static //先执行自身的创建静态对象语句，进行初始化
    ClassA()//ca的构造方法
    In MyClass Static//初始化完回到mc1，跳过第二句，优先执行静态代码块
    In ClassB Static//实例化C对象，因为c有父类，先执行父类的静态块，
    In ClassC Static//然后是子类静态块
    ClassB()//然后父类构造方法
    ClassC()//子类构造方法
    MyClass()//最后执行自己的构造方法
   //mc2初始化
    ClassB()//然后父类构造方法
    ClassC()//子类构造方法
    MyClass()//最后执行自己的构造方法
    //两条判断
    false //这里两个cc在内存中指向的不是一个对象和堆地址。
   	true //因为创建的ca是静态的，所有对象共享，且只创建了一次，所以这两个ca指的是同一个堆地址
```

