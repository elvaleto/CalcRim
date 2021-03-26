public class Calc {
    public static int raschet(int num1, char znak, int num2) {
        int result = 0;
        switch (znak) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        return result;


    }
}