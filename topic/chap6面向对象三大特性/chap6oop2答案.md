# 面向对象三大特性练习题

三大特性：封装、继承、多态

## 题1

运行结果：

```JAVA
Super() //  1
Sub()
Super() // 2
Sub()
Sub(int)
Super(String)
SubString)
```



```JAVA
//前面每个sub构造方法前都输出两个Super（）是因为子类的所有构造方法默认都会访问父类的无参构造方法,

最后一个Super（Str）如果不指定父类构造方法时，默认使用父类空参数的构造方法 super();
但如果用super调用了父类的有参方法，就调用有参的方法。
相当于是：

public Sub(){
//Super(); 不写就默认有，和类里无构造方法的话默认添加一个无参构造方法一样
System.out.println("Sub()");
}
public Sub(int i){
//Super();
this();
System.out.println("Sub(int)");
 }
```

## 题2

```java
运行结果：  //此题子类没有用构造方法，所以子类方法调用时跟父类的构造方法无关。
m1() in Sub
m1() in Super
m2() in Super
```

## 题3

```java
//编译看父类，运行看子类，编译的时候用父类调用方法要看父类有没有这个方法，即使子类有，如果父类没有就会报错。
//所以不能调用子类特有的方法;同时也要知道属性没有多态性，当父类和子类都有同名属性的时候，通过父类引用，只能引用父类自己的成员属性；
 //多态向上转型格式就是如下的
父类类型  对象名  =  new 子类类型（）；
这句创建对象是向上转型：实际上就是创建一个子类对象，将其当作父类对象来使用。

向下转型可以调用子类的方法，不过创建时要强制转换 （子类名）
```

## 题4

```java
运行结果：
m() in Sub //将子类作为父类用，调用的是子类的方法
m() in Super
```

## 题5

都可以编译通过，只要返回值是一个Animal对象，或者Anmal的子类或者null

## 题6

这里把四处mc.value改为调用get方法即可，因为value属性是private修饰的，其他类不能访问

```java
//TestMyClass1.java
package corejava.chp6;
public class TestMyClass1{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.getValue());  //这里改成调用对象的get方法
		System.out.println(mc2.getValue()); //
	}
}

//TestMyClass2.java
package corejava.temp;
import corejava.chp6.*;
public class TestMyClass2{
	public static void main(String args[]){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass(10);
		System.out.println(mc1.getValue()); //
		System.out.println(mc2.getValue()); //
	}
}
```

## 题7

```JAVA
//选E，将父类的value属性用protected属性\\修饰，那么不同包的子类就继承了父类的被protected修饰的属性或方法，也就可以访问了
//需要注意的是，这两个类不在同一个包下，就无法访问父类变量，所以this或者BC两个super也不行
```

## 题8

```JAVA
运行结果：
    //cd1实例化时输出：
ClassB()    
ClassA()    //所以就先执行父类构造方法再开始初始化ClassD对象
ClassD()
    //cd2实例化输出
ClassB()  //是因为子类的构造方法里第一条必须是调用父类的无参构造方法，不写系统默认添加
ClassA() 
ClassA()  //同理
ClassC()
ClassD(int)
    //如果子类定义了构造方法,不论是无参数还是带参数,在创建子类的对象的时候,首先执行父类无参数的构造方法,然后执行自己的构造方法。
```

## 题9

```java
运行结果:
1.调用其父类Lunch的无参构造方法时,还要先调用Lunch的父类Meat的构造方法
//Meal()
//Lunch()
2.初始化对象，在成员变量中先创建一个Potato对象，调用Potato的构造方法，就会先调用其父类Vegetable无参构造方法
//Vegetable()
//Potato()
3.第三步在成员变量中创建一个Meat对象，调用构造方法
//Meat()
4.第四步在成员变量中创建一个Tomato对象，调用Tomato的构造方法，就会先调用其父类Vegetable无参构造方法
//Vegetable()
//Tomato()
5.最后再调用Sandwich构造方法
//Sandwich()
```

## 题10

这里子类的单参数构造方法，在调用父类的单参构造方法，但父类只有无参的构造方法，所以只需在Super类中，添加一个单参数构造方法，数据类型要和子类构造方法一样，父类写了单参后，也要把无参构造显式出。

## 题11

选择A，

这里子类重写了父类的方法所以必须遵循下面规则
1.参数列表必须完全与被重写的方法参数列表相同；
2.返回的类型必须与被重写的方法的返回类型相同；

## 题12

都可以编译通过，因为父类这个method（）方法是用private修饰的，其他类或子类无法访问或者继承该方法

## 题13

选择C 输出foo() in sub  这里是向下转型，把子类当父类用，所以调用子类重写的m方法，但是这里子类并没有重写该方法，所以调用父类的m方法，父类m方法中又调用了foo方法，因为父类的foo()方法被子类Sub覆盖了，所以在m()内部调用foo()时，Java依然会找到子类Sub的foo()来执行。

## 题14

```java
class Animal{

private String name;
//构造
public Animal(){}
public Animal(String name){
    this.name = name;
}

public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
    
}

class Dog extends Animal{

 public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}

class Cat extends Animal{

 public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

}

public class TestAnimal{

public static void main(String args[]){

Animal[] as = new Animal[]{

new Dog("Pluto"),

new Cat("Tom"),

new Dog("Snoopy"),

new Cat("Garfield")

};

Dog[] dogs = getAllDog(as);

for(int i = 0; i<dogs.length; i++){

System.out.println(dogs[i].getName());}

}

public static Dog[] getAllDog(Animal[] as){

 // 声明一个计算狗狗下标
        int index = 0;
        Dog[] dogs1 = new Dog[as.length];
        for (int i = 0; i < as.length; i++) {
            //判断该数组中的对象是否位Dog的子类  instanceof判断对象是否为某个类的子类
            if (as[i] instanceof Dog) {
                dogs1[index] = (Dog) as[i];
                index++;
            }
        }
        //然后拷贝一个数组，把空值给去掉
        Dog[] dogs2 = new Dog[index];
        System.arraycopy(dogs1, 0, dogs2, 0, index);
        return dogs2;
    }

}

}
```

## 题15

```java
//Woker类
public class Worker {
    private String name; // 姓名
    private int age; // 年龄
    private double salary; // 工资
    private Address addr;

    // 无参构造方法
    public Worker() {
    }

    // 全参数的
    public Worker(String name, int age, double salary, Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    // 无参work方法
    public void work() {
        System.out.println(name + "正在打工！");
    }

    // 有参work方法，表示工作时间
    public void work(int hours) {
        System.out.println(name + "已经工作" + hours + "小时！");
    }
}
//Address类
public class Address {
     private String address; //地址
     private String zipCode; //邮编
    //无参构造方法
    public Address(){
    }
    //全参数构造方法
    public Address(String address,String zipCode){
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
```

## 题16

```java
public class Student {
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;
	//封装 
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
	//无参和全参构造方法
    public Student() {}

    public Student(String name, int age, String address, String zipCode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
    }

    //返回Student对象的地址和邮编
    public String getPostAddress(){
        return "地址：" + this.address + ",邮编：" + this.zipCode;
    }
}
```

## 题17

```java
//Role职业类
public class Role {
    private String name; //角色名字
    
    //构造方法
    public Role(){}
    public Role(String name) {
        this.name = name;
    }
    //封装
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //返回角色的攻击对敌人的伤害。
    public int attack(){
        return 0;
    }
}

//魔法师职业类
public class Magicer extends Role{
    private int level; //魔法等级（范围为1 ~ 10）

    //封装
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        //先判断目前等级是否在1 ~ 10之间，不在则返回错误信息
        if (level < 1 || level > 10) {
            System.out.println("魔法等级必须在1 ~ 10之间");
            return; //结束方法
        }
        this.level = level;
    }

    //重写
    @Override
    public int attack() {
        //该方法返回法师的攻击对敌人造成的伤害值。
        // 法师攻击伤害值为：魔法等级*魔法基本伤害值（固定为5）
        return level * 5;
    }
}

//战士职业类
public class Soldier extends Role{
    private int hurt; //物理伤害值
    //封装
    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    //重写
    @Override
    public int attack() {
        //该方法返回战士的攻击对敌人造成的伤害值。
        // 战士的攻击伤害值为：其攻击伤害属性值
        return hurt;
    }
}

//Team类
public class Team {
    private int teamCount = 0; // 统计队伍人数
    // 创建一个队伍数组，最多6人
    Role[] roles = new Role[6];

    // 返回队伍对敌人造成的总伤害值
    public int attackSum() {
        int sum = 0; // 用于计算总伤害
        for (int i = 0; i < roles.length; i++) {
            // 此时还要判断该成员是否是魔法师 instanceof作用是一个对象判断是否是该类的实例
            if (roles[i] instanceof Magicer) {
                sum += roles[i].attack();
                System.out.println("魔法职业" + roles[i].getName() + "对敌人造成了" + roles[i].attack() + "点伤害");
            } else if (roles[i] instanceof Soldier) {
                sum += roles[i].attack();
                System.out.println("战士职业" + roles[i].getName() + "对敌人造成了" + roles[i].attack() + "点伤害");
            }else { //如果非这两个类对象就跳过
                continue;
            }
        }
        return sum;
    }

    // 组队方法
    public void addMember(Role role) {
        // 判断该队伍人数是否已满
        if (this.teamCount < 6) {
            roles[teamCount] = role;
            this.teamCount++;
            System.out.println(role.getName() + "加入成功！队伍已经" + this.teamCount + "人啦");
        } else {
            System.out.println("勇士，当前队伍已满！");
        }
    }
}

//测试类
public class TestGame {
    public static void main(String[] args) {
        Magicer m1 = new Magicer();
        m1.setName("光辉女郎");
        m1.setLevel(5);
        Soldier s1 = new Soldier();
        s1.setName("盖伦");
        s1.setHurt(30);
        Magicer m2 = new Magicer();
        m2.setName("大发明家");
        m2.setLevel(8);
        Soldier s2 = new Soldier();
        s2.setName("皇子");
        s2.setHurt(35);
        Magicer m3 = new Magicer();
        m3.setName("飞机");
        m3.setLevel(10);
        Soldier s3 = new Soldier();
        s3.setName("盲僧");
        s3.setHurt(20);
        Soldier s4 = new Soldier();
        s4.setName("武器大师");
        s4.setHurt(21);
        Team team1 = new Team();
        team1.addMember(m1);
        team1.addMember(s1);
        team1.addMember(s2);
        team1.addMember(s3);
        team1.addMember(s4);
        team1.addMember(m3);
        team1.addMember(m2);
        System.out.println("这个队伍的总伤害为：" + team1.attackSum());
    }
}

```

## 题18

```java
//银行账户类
public class Account {
    private long id; // 账户id
    private double balance; // 账户余额
    private String password; // 账户密码

    public Account() {
    }

    // 构造方法
    public Account(long id, double balance, String password) {
        this.id = id;
        this.balance = balance;
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码必须是6位数！请重试~");
        }

    }

    // 封装
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

 public String getPassword(String glymm) {
        //设一个管理员密码，ATM机器上默认有密码
        if (glymm.equals("fuckyoujava")){
            return password;
        }else {
            System.out.println("密码错误！已报警！");
            return null;
        }
    }

    //设置密码
    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码必须是6位数！请重试~");
        }
    }

    public static void main(String[] args) {

    }
}
//储蓄账户
public class SavingAccount extends Account{
    private double interestRate; //存款利率

    //封装
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0 && interestRate < 0.1) {
            this.interestRate = interestRate;
        }else {
            System.out.println("利率要在10%以内！请重试~");
        }
    }
}
//信用账户
public class CreditAccount extends Account{
    private double creditLine; //信用额度

    //封装
    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}
```

## 题19-22

```java
//图形类
public class Shape {
    //求面积
    public double area(){
        return 0.0;
    }

    //求周长
    public double girth(){
        return 0.0;
    }
}
//圆形类
public class Circle extends Shape{
    private double radius; //半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //求面积
    public double area(){
        return Math.PI * radius * radius;
    }

    //求周长
    public double girth(){
        return Math.PI*2*radius;
    }
}
//矩形类
public class Rect extends Shape{
    private double width; //宽
    private double length; //长
    public Rect() {}
    public Rect(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //面积
    @Override
    public double area() {
        return length * width;
    }
    // 周长
    @Override
    public double girth() {
        double a = length + width;
        return a*2;
    }
}
//正方形类
public class Square extends Rect{
    private double slength;//边长

    public Square(double slength) {
        super();
        this.slength = slength;
    }

    public double getSlength() {
        return slength;
    }

    public void setSlength(double slength) {
        this.slength = slength;
    }

    @Override
    public double area() {
        return slength*slength;
    }

    @Override
    public double girth() {
        return slength*4;
    }
}
//测试类
ublic class TestShape {
    public static void main(String[] args) {
        //创建一个长度为3 的数组
        Shape[] shapes = new Shape[3];
        //创建三个不同类型对象
        Circle circle = new Circle(2.5);
        Rect rect = new Rect(3.0,5.0);
        Square square = new Square(3.0);
        shapes[0] = circle;
        shapes[1] = rect;
        shapes[2] = square;
        for (int i = 0; i < shapes.length; i++) {
            //.getClass().getSimpleName()获得对象的类名
            System.out.println(shapes[i].getClass().getSimpleName() +"的面积为：" + shapes[i].area());
            System.out.println(shapes[i].getClass().getSimpleName() +"的周长为：" + shapes[i].girth());
        }
    }
}
//21小题的函数：
     public static Shape getShaper(int i) {
        switch (i){
            case 0:
                return new Circle(1);
            case 1:
                return new Rect(3,2);
            case 2:
                return new Square(2);
            default:
                System.out.println("请输入1-3之间的数哦~");
                return null;
        }
//22小题代码
     public static void printShape(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() +"面							积："+shape.area());
        System.out.println(shape.getClass().getSimpleName() +"周							长："+shape.girth());
    	}
         
```

## 题23

```JAVA
输出结果： //5 5
//虽然两个类不在同一个包下，但是父类的value属性被protected修饰，其不同包的子类是可以访问的
```

## 题24-25

```JAVA
//Employee类
public class Employee {
    private String name; //姓名
    private int month; //员工生日月份
    private double salary;//工资

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Employee() {}
    //构造方法
    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }
    //根据月份确定实际工资
    public double getSalay(int month){
        if(month == this.month) {
            System.out.println(this.name + "因为您生日在本月，工资加100! ");
            return salary + 100;
        }
        return salary;
    }
}

//SalariedEmployee
public class SalariedEmployee extends Employee {
    private double salary1; // 月薪

    public double getSalary() {
        return salary1;
    }

    public double getSalay(int month) {
        if (month == this.getMonth()) {
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
            System.out.print("正式工（固定薪资）---" + this.getName() + "辛苦了！您的本月份工资为：");
            return salary1 + 100;
        }
        System.out.print("正式工（固定薪资）---" + this.getName() + "辛苦了！您的本月份工资为：");
        return salary1;
    }

    public void setSalary(double salary) {
        this.salary1 = salary;
    }

    public SalariedEmployee(String name, int month, double salary) {
        super(name, month);
        this.salary1 = salary;
    }
}

//HourlyEmployee类
public class HourlyEmployee extends Employee {
    private double hourlySalary;// 每小时的工资
    private int hours;// 工作的小时数
    private double salary3; // 工资

    public HourlyEmployee(String name, int month, int hours, double hourlySalary) {
        super(name, month);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalay(int month) {
        if (month == this.getMonth()) {
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
            salary3 += 100;
        }
        if (hours > 160) {
            System.out.print("小时工---" + this.getName() + "这个月一共干了" + hours + "小时,本月工作小时超出" + (hours - 160) + "小时,辛苦了！您的本月工资为：");
            salary3 += hourlySalary * 160 + (hours - 160) * hourlySalary * 1.5;
        } else {
            System.out.print("小时工---" + this.getName() + "这个月一共干了" + hours + "小时,辛苦了！" + "您的本月工资为：");
            salary3 += hourlySalary * hours;
        }

        return salary3;
    }
}

//SalesEmployee类
public class SalesEmployee extends Employee {
    private double sales;// 月销售额
    private double rate;// 提成率
    private double salary4; // 工资

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int month, double sales, double rate) {
        super(name, month);
        this.sales = sales;
        this.rate = rate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalay(int month) {
        if (month == this.getMonth()) {
            salary4 = 100 + sales * rate;
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
        }else {
            salary4 = sales * rate;
        }
        System.out.print("纯提成销售员---" + getName() + "本月提成：" + sales * rate + ",辛苦了！" + month + "你的本月份工资为：");
        return salary4;
    }
}

//BasePlusSaleEmployee类
public class BasePlusSaleEmployee extends SalesEmployee{
    private double baseSalary;//底薪
    private double salary5;//工资

    public BasePlusSaleEmployee(String name, int month, double sales, double rate, double baseSalary) {
        super(name, month, sales, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getSalay(int month) {
        if (month == this.getMonth()) {
            salary5 = 100 + baseSalary + this.getSales() * this.getRate();
            System.out.println(this.getName() + "因为您生日在本月，工资加100! ");
        }else {
            salary5 = baseSalary + this.getSales() * this.getRate();
        }
        System.out.print("固定工资+提成销售员---" + this.getName() + "本月提成：" + this.getSales() * this.getRate() + ",辛苦了！"  + "你的本月份工资为：" );
        return salary5;
    }
}

//TestEmployee测试类
public class TestEmployee {
    public static void main(String[] args) {
        SalariedEmployee zsg = new SalariedEmployee("张三", 2, 3250);
        System.out.println(zsg.getSalay(3));

        HourlyEmployee hour = new HourlyEmployee("李四", 2, 165, 20);
        System.out.println(hour.getSalay(2));

        SalesEmployee sale = new SalesEmployee("王五", 5, 20000, 0.35);
        System.out.println(sale.getSalay(5));

        BasePlusSaleEmployee base = new BasePlusSaleEmployee("赵六", 11, 15000, 0.15, 2250);
        System.out.println(base.getSalay(11));
    }
}
//25题在上面测试类基础上加一点
Employee [] employees = new Employee[4];
        employees[0] = zsg;
        employees[1] = hour;
        employees[2] = sale;
        employees[3] = base;
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getSalay(11));
        }
```

## 题26

```java
//Bank类
public class Bank {
    // 开户方法
    public static Account openAccount(long id, String password, int type) {
        switch (type) {
            case 0:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "普通账户");
                return new Account(id, password);
            case 1:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "储蓄账户");
                return new SavingAccount(id, password);
            case 2:
                System.out.println("开户成功！您的账户id：" + id + ",密码：****** , 账户类型：" + "信用账户");
                return new CreditAccount(id, password);
            default:
                System.out.println("请输入0-2开户哦！");
                return null;
        }
    }

    // 存款
    public static double deposit(Account a, double amount) {
        int count = 5;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入银行密码:");
            String psw = sc.nextLine();
            if (a.getPassword("fuckyoujava").equals(psw)) {
                a.setBalance(a.getBalance() + amount);
                System.out.println("存款" + amount+"成功！您当前的账户余额：" + a.getBalance());
                return a.getBalance();
            } else {
                System.out.println("密码错误！请重试");
                count--;
                if (count == 0) {
                    System.out.println("密码错误次数过多，账户被锁定！请联系柜台人员！");
                    return -1;
                }
            }
        }
    }

    // 取款
    public static double withdraw(Account a, double amount) {
        int count = 5;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入银行密码:");
            String psw = sc.nextLine();
            if (a.getPassword("fuckyoujava").equals(psw)) {
                if (a.getBalance() <= amount) {
                    a.setBalance(a.getBalance() - amount);
                    System.out.println("取款"+ amount +"成功！您当前的账户余额：" + a.getBalance());
                    return a.getBalance();
                }else {
                    System.out.println("余额不足，取款失败！");
                    return -1;
                }
            } else {
                System.out.println("密码错误！请重试");
                count--;
                if (count == 0) {
                    System.out.println("密码错误次数过多，账户被锁定！请联系柜台人员！");
                    return -1;
                }
            }
        }
    }

}
//测试类
public class TestAc {
    public static void main(String[] args) {
       // SavingAccount as = new SavingAccount();
       // as.setInterestRate(0.12);
       //  Account a = new Account(1001111,1000,"666888");
        // Bank.deposit(a,500); //存钱
        // Bank.withdraw(a,1000); //取钱
        Bank.openAccount(1001111,"666888",1);
    }
}
```

