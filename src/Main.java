
public class Main {

    public static void main(String[] args) {

        String items = DataIn.input();
        String[] arr = items.split(" ");
        char znak = arr[1].charAt(0);
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        String[] decimal = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false;
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(arr[0])) {
                flag1 = true;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (roman[i].equals(arr[2])) {
                flag2 = true;
            }
        }
        for (int i = 0; i < decimal.length; i++) {
            if (decimal[i].equals(arr[0])) {
                flag3 = true;
            }
        }
        for (int i = 0; i < decimal.length; i++) {
            if (decimal[i].equals(arr[2])) {
                flag4 = true;
            }
        }
        {
            if (flag1 && flag2) {           //отправка в римский калькулятор

                int dec1 = Decode.decode(arr[0]);
                int dec2 = Decode.decode(arr[2]);
                int arr3 = Calc.raschet(dec1, znak, dec2);
                String rom1 = Encode.convert(arr3);
                System.out.println(rom1);
            } else if (flag1 || flag2) {
                System.out.println("неправильная комбинация");
            } else if (flag3 || flag4) {
                System.out.println("неправильная комбинация");
            } else if (flag3 && flag4) {
                int num1 = Integer.parseInt(arr[0]);
                int num2 = Integer.parseInt(arr[2]);
                int arr2 = Calc.raschet(num1, znak, num2);
                System.out.println(arr2);
            } else System.out.println("должны быть цифры 1-10 или римские цифры I-X");
        }
    }
}



