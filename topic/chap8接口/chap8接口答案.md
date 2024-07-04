# chap8接口

------

## 题1

```java
1实现类的void m1()方法要用public修饰，不然报错，接口中可不写public，但在子类中实现接口的过程中public不可省
2因为接口的方法是默认用public abstract修饰的,实现类是要显式写出的;接口的属性是默认用public static final修饰的，也就是公开，静态(只创建一次，所有对象共享)，常量(不能更改值)的
3如果在父类方法加一个public，会看到Modifier 'public' is redundant for interface members ，解释为public对接口成员是多余的,可以省略不写，因为接口成员默认就是这样的,没有构造方法，没有例外.
```

------

## 题2

```java
1.abstract
2.public void m2()
//解释：
1.一个类只能继承一个类，但是能实现多个接口。这道题使用的是一个抽象类去实现接口中的一个方法，而子类也不需要把m1（）也实现,抽象类中没有修饰该方法为抽象方法的话。
2.如果一个类没有实现接口中的所有抽象方法，则该类必须为抽象类,该抽象类的子类可以重写抽象类需要实现的方法,即使是抽象类没实现的方法
3.抽象类实现接口后，其子类可以继承并实现接口中定义的方法，而不需要实现所有方法。这为开发者提供了一种灵活的方式来组织代码，特别是当某些方法在抽象类中已经有了默认实现时。
抽象类实现接口可以避免直接使用普通类来实现接口时必须实现所有方法的限制，从而减少了代码的冗余。
```

------

## 题3

```java
1. void ma() void mb() void mc() void md()
    //这里要注意，类不可以继承多个父类，而接口可以。
    //一个普通类可以实现一个接口，并且必须提供接口中所有方法的实现。如果一个接口继承了另一个接口，那么实现这个接口的类也必须提供所有继承接口中的所有方法的实现。
    //但如果是抽象类继承接口，因为抽象类里可以有非抽象方法存在，所以父类接口的方法可以不用全部实现
2.((ClassE) ic).ma(); //IC接口和IB接口并无直接关系，所以不能直接调用IB的方法
  ((ClassE) ic).mb(); //向下转型
  ic.mc();
  ((ClassE) ic).md();
3.true true true true
```

------



## 题4

```java
public interface Shape {
    // 求面积
    double area();

    // 求周长
    double girth();
}
```

------

## 题5

```java
输出结果：
    true true true true
    //在Java中，实现接口可以理解为一个类是接口的“子类型”。所以，如果ms是一个实现了IA接口的类的实例，ms instanceof IA将会返回true。
    //严格来说，我们不说是“子类”，但类确实“实现了”接口，这在概念上与继承相似，满足instanceof操作符的条件。
```

------



## 题6

```java
正确：A  C D E    //B错误是因为接口可以有属性，但接口中属性默认被public static final修饰
```

------

## 题7

```java
输出结果：
    impl1 //两个对象都是向上转型，子类当父类用
    //一个是用构造方法传接口对象，一个是用set封装设置对象，两次调用的子类不同
    impl2
```

------

## 题8

```java
输出结果：
    Red Light shine in Red
    Yellow Light shine in Yellow
    Green Light shine in Green
```

------

## 题9

```java
输出结果：
TeacherA teach Java
TeacherB teach Java
```

------

## 题10

```java
//1 for (int i = 0; i < as.length;i++){
			as[i].eat();
	}
//2for (int i = 0; i < as.length;i++){
			if (as[i] instanceof Pet){  //判断这个Animal对象是否是Pet接口的实例
                ((Pet)as[i]).play();
             }
	}
```

------

## 题11

```java
/*家庭影院设备*/
public interface MediaPlayer {
    //播放
    void play();
    //停止
    void stop();
    //开仓
    void open();
}
//DVD
public class DVDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("DVDPlayer play");
    }

    @Override
    public void stop() {
        System.out.println("DVDPlayer stop");
    }

    @Override
    public void open() {
        System.out.println("DVDPlayer open");
    }
}
//CD
public class CDPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("CDPlayer play");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer stop");
    }

    @Override
    public void open() {
        System.out.println("CDPlayer open");
    }
}
//Tape
public class TapePlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("TapePlayer play");
    }

    @Override
    public void stop() {
        System.out.println("TapePlayer stop");
    }

    @Override
    public void open() {
        System.out.println("TapePlayer open");
    }
}
//Controller
public class Controller {
    private MediaPlayer[] players;

    public Controller() {
       players = new MediaPlayer[3];
        players[0] = new DVDPlayer();
        players[1] = new CDPlayer();
        players[2] = new TapePlayer();
    }

    // 将对应的设备调用play方法
    public void play(int i) {
        players[i].play();
    }

    // 将对应的设备调用stop方法
    public void stop(int i) {
        players[i].stop();
    }

    // 将对应的设备调用open方法
    public void open(int i) {
        players[i].open();
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        c.players[0].play();
        c.players[0].stop();
        c.players[0].open();
    }
}

```

------

## 题12

```java
 // 节目表演
    public void show() {
        for (int i = 0; i < ps.length; i++) {
            ps[i].perform();
        }
    }
//主方法测试
    public static void main(String[] args) {
        Program p = new Program();
        p.show();
    }
```

------

## 题13

```java
static double count = 0;// 统计发了几次加班费
public double getSalay(int month) {

        if (this instanceof BasePlusSaleEmployee) {
            System.out.println("因为您是固定底薪+销售人员，所以本月发加班费1000元！,");
            count += 1000;
            if (this.month == month) {
                System.out.println("同时因为您生日是" + month + "月，所以本月奖金100元！,");
                return 1100;
            }
            System.out.println("您的总薪资为：");
            return 1000;
        } else if (this instanceof SalariedEmployee) {
            System.out.println("因为您是固定薪资人员，所以本月发加班费2000元！,");
            count += 2000;
            if (this.month == month) {
                System.out.println("同时因为您生日是" + month + "月，所以本月奖金100元！,");
                return 2100;
            }
            System.out.println("您的总薪资为：");
            return 2000;
        } else if (this.month == month) {
            System.out.println("因为您生日是" + month + "月，所以本月奖金100元！,");
            System.out.println("您的总薪资为：");
            return 100;
        }
        System.out.println("您的总薪资为：");
        return 0;
    }
System.out.println("一共发了加班费：" + employees[0].getCount());
```

## 题14

```java
ACD编译可以通过，但是运行报错
A 因为sub2继承了Super类，所以可以强制向下转型
    //如果向下转型前，没有向上转型，编译无错误，但运行会有错误：显示类型错误
B错虽然都继承了Super，但是彼此没有互相继承关系，所以没法转 
C和D编译没问题,是因为接口比较特殊不算类的一种，在这里可以编译通过，但运行失败，如果sub或super是实现类的话是不用强制转换就可以运行的。
```

## 题15

```java
//实现需要将接口所有方法都重写，而第二种用抽象类先去实现接口，这里抽象类可以不全部重写接口的方法，因为抽象类无需全部抽象方法，再用子类去继承抽象类的方法，所以子类可以选择不用将接口或父类的方法全部重写。
//抽象类实现接口可以避免直接使用普通类来实现接口时必须实现所有方法的限制，从而减少了代码的冗余。
```

## 题16

```java
运行结果：
//ma in IAImpl  
//mb in IBImpl
编译看父类，运行看子类，父类子类都有运行父类，只有父类的，运行父类，只有子类编译错误！

```

## 题17

```java
//Role接口
public interface Role {
    //攻击 返回值表示对敌人的伤害
    int attack();
    //练习 练习之后对敌人的伤害会增加。
    void practise();
}
//抽象类NameRole
abstract class NamedRole implements Role {
    private String name; // 角色名
    private int age; // 角色年龄

    public NamedRole() {}

    public NamedRole(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//MagicStick接口
public interface MagicStick {
    //开火
    int fire();
}
//两个实现类
public class BlackStic implements MagicStick {
    private int month;// 月份

    public int getMonth() {
        return month;
    }
    public BlackStic() {
    }
    public BlackStic(int month) {
        this.month = month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            System.out.println("月份不合法");
        this.month = month;
    }

    @Override
    public int fire() {
        if (month % 2 == 0) {
            System.out.println("魔法等级已提升！黑魔棒在" + month + "月" + "会增加2魔法等级！");
            return 2;
        }
        System.out.println("魔法等级已提升！黑魔棒在" + month + "月" + "会增加1魔法等级！");
        return 1;
    }
}
//
public class GreenStick implements MagicStick {
    private int month; // 月份

    public int getMonth() {
        return month;
    }

    public GreenStick() {
    }

    public GreenStick(int month) {
        this.month = month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            System.out.println("月份不合法");
        this.month = month;
    }

    @Override
    public int fire() {
        if (month <= 8 && month >= 6) {
            System.out.println("魔法等级已提升！绿魔棒在" + month + "月" + "会增加2魔法等级！");
            return 2;
        }
        System.out.println("魔法等级已提升！绿魔棒在" + month + "月" + "会增加1魔法等级！");
        return 1;
    }
}
//Magicer类
public class Magicer extends NamedRole{
    private int level; //魔法等级
    private MagicStick stick; //法师用的法杖

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public MagicStick getStick() {
        return stick;
    }

    public void setStick(MagicStick stick) {
        this.stick = stick;
    }
    public Magicer(){}

    public Magicer(int level, String name, int age) {
        super(name, age);
        this.level = level;
    }

    @Override
    public int attack() {
        //当前对象的魔法等级(level) *每一级的固定伤害(5)
        System.out.println("法师的输出：" + level * 5);
        return level * 5;
    }

    @Override
    public void practise() {
        if (null == stick)
            level++;
        level += 1 + stick.fire();
    }
}
//Soldier类
public class Soldier extends NamedRole{
    private int hurt; //伤害
    private Weapon weapon; //武器

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Soldier() {}

    public Soldier(int hurt,  String name, int age) {
        super(name, age);
        this.hurt = hurt;
    }

    @Override
    public int attack() {
        //总攻击输出 = 战士的徒手伤害值 + 武器的伤害值
        int sum = hurt + weapon.fire();
        System.out.println("战士的攻击输出：" + sum);
        return sum;
    }

    @Override
    public void practise() {
        //每调用一次则战士的 hurt 值+10
        System.out.println(getName() + "进行了一次训练,伤害值+10");
        hurt += 10;
    }
}
//Weapon接口
public interface Weapon {
    void setSoldier(Soldier s);
    int fire();
}
//两个实现类
public class Pike implements Weapon {
    private String name; // 长矛名字
    private Soldier s2;

    public Pike() {}
    public Pike(String name, Soldier s) {
        this.name = name;
        this.s2 = s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setSoldier(Soldier s) {
        this.s2 = s;
    }

    @Override
    public int fire() {
        if (this.name.equals(s2.getName())) {
            System.out.println(s2.getName() + "使用了专属武器：" + name + "，增加1000伤害值！");
            return 1000;
        }
        System.out.println(s2.getName() + "使用普通武器：" + name + "，增加25伤害值！");
        return 25;
    }
}
//
public class Bolo implements Weapon {
    private Soldier s1;
    @Override
    public void setSoldier(Soldier s) {
        this.s1 = s;
    }

    public Bolo() {
    }

    public Bolo(Soldier s1) {
        this.s1 = s1;
    }

    @Override
    public int fire() {
        if (s1.getAge() >= 18) {
            System.out.println(s1.getName() + "今年" + s1.getAge() + "岁，可以用千斤武器，"  + "，增加100伤害值！");
            return 100;
        }
        System.out.println(s1.getName() + "今年" + s1.getAge() + "岁，只能用小型武器，"  + "增加50伤害值！");
        return 50;
    }

}
//测试类
public class TestRole {
    public static void main(String[] args) {
        Soldier s = new Soldier(30, "李青", 18);
        // //先测试战士用长矛武器
        // Pike changmao = new Pike("李青", s); //创建长矛对象
        // s.setWeapon(changmao);
        // s.practise();
        // s.attack();
        // //测试战士用大刀
        // Soldier s2 = new Soldier(25, "男刀", 18);
        // Bolo dadao = new Bolo(s2);
        // s2.setWeapon(dadao);
        // s2.practise();
        // s2.attack();
        //测试法师用绿法杖
        Magicer m = new Magicer(5, "光辉", 18);
        GreenStick lfz = new GreenStick(8);
        m.setStick(lfz);
        m.practise();
        m.attack();
        //测试法师用黑法杖
        Magicer m2 = new Magicer(8, "小炮", 18);
        GreenStick lfz2 = new GreenStick(8);
        m2.setStick(lfz2);
        m2.practise();
        m2.attack();
    }
}
```

## 题18

```java
 /**
     * 判断是否质数方法
     */
    public static boolean isZhiShu(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
//拆分判断
 public static void zsh() {
        //获取一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于6的偶数:");
        int n = sc.nextInt();
        //判断是否大于6的偶数
        if (n > 6 && n % 2 == 0) {
            //因为是要质数，所以两个数一定不是0或本身,以及1(不是质数)
            //开始循环判断数组里的哪两个因子加起来等于n
            for (int i = 2; i < n - 1; i++) {
                //这里j也可以等于2，不过下面最后一次判断要加上&& i <= j
                for (int j = i; j < n - 1; j++) {
                    //判断两个数是否都是质数
                    if (isZhiShu(i) && isZhiShu(j)) {
                        //判断两个质数相加是否等于n，两个数可以相等但是不能重复出现
                        if (i + j == n) {
                            System.out.println(i + "+" + j + "=" + n);
                        }
                    }
                }
            }
        } else {
            System.out.println("您输入的数非偶数或非大于6的数");
        }
    }
```
