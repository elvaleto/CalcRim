
    public class Main {

        public static void main(String[] args) {

            String items = DataIn.input();
            String[] arr = items.split(" ");
            char znak = arr[1].charAt(0);
            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
            boolean flag1 = false, flag2 = false;
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
            {
                if (flag1 && flag2) {           //отправка в римский калькулятор

                    int dec1 = Decode.decode(arr[0]);
                    int dec2 = Decode.decode(arr[2]);
                    int arr3 = Calc.raschet(dec1, znak, dec2);
                    String rom1 = Encode.convert(arr3);
                    System.out.println(rom1);
                } else if (flag1 || flag2) {
                    System.out.println("неправильная комбинация");
                } else {
                    var num1 = Integer.parseInt(arr[0]);
                    var num2 = Integer.parseInt(arr[2]);
                    {
                        if (num1 <= 10 && num2 <= 10 && num1 >= 0 && num2 >= 0) {
                            var arr2 = Calc.raschet(num1, znak, num2);
                            System.out.println(arr2);
                        } else System.out.println("число должно быть 1-10 ");
                    }
                }
            }
        }
    }


