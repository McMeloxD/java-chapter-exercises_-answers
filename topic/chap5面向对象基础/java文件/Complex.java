package com.Work.chap5Oop;

/**
 * --- Be Humble and Hungry ---
 *
 * @author Liyuexian
 * @date 2024/5/23
 * @desc
 */
public class Complex {
    double real; // 实部
    double im; // 虚部

    // 有参数构造方法就需要把无参也写出来。。
    public Complex() {
    }

    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    // 将结果控制到1位小数并且转为字符串输出
    public String toString(Complex c) {
        //String.format是String类提供的格式化方法
        String Sreal = String.format("%.1f", c.real);
        String Sim = String.format("%.1f", c.im);
        String result;
        //为了按格式表达复数，虚部位负数时，加括号 格式：a+bi
        if (c.im < 0) {
            result = Sreal + "+(" + Sim + "i)";
        }else {
            result = Sreal + "+" + Sim + "i";
        }
        return result;
    }

    // 复数加法
    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = (this.real + c.real);
        result.im = (this.im + c.im);
        return result;
    }

    // 复数减法
    public Complex sub(Complex c) {
        Complex result = new Complex();
        result.real = (this.real - c.real);
        result.im = (this.im - c.im);
        return result;
    }

    // 复数乘法
    public Complex mul(Complex c) {
        Complex result = new Complex();
        result.real = (this.real * c.real) - (this.im * c.im);
        result.im = (this.real * c.im) + (this.im * c.real);
        return result;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(4, 6);
        // 创建一个Complex对象接受相加结果
        Complex c3 = c1.add(c2);
        System.out.println("两个复数相加结果为：" +  c3.toString(c3));
        // 创建一个Complex对象接受相减结果
        Complex c4 = c1.sub(c2);
        System.out.println("两个复数相减结果为：" +  c4.toString(c4));
        // 创建一个Complex对象接受相乘结果
        Complex c5 = c1.mul(c2);
        System.out.println("两个复数相乘结果为：" +  c5.toString(c5));
    }
}
