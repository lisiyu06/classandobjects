/**
 * Author: lisiyu
 * Created: 2019/10/8
 */
public class Calculator {
    public double num1;
    public double num2;

    public void add(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2));
    }

    public void sub(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(this.num1 + " - " + this.num2 + " = " + (this.num1 - this.num2));
    }

    public void mul(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(this.num1 + " * " + this.num2 + " = " + (this.num1 * this.num2));
    }

    public void div(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(this.num1 + " / " + this.num2 + " = " + (this.num1 / this.num2));
    }
}