import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/10/8
 */
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        calculator.add(num1, num2);
        calculator.sub(num1, num2);
        calculator.mul(num1, num2);
        calculator.div(num1, num2);

        scanner.close();
    }
}
