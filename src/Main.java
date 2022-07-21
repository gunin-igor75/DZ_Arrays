public class Main {
// Задание №1
    static int[] arrayInt = new int[]{1, 2, 3};
    static double[] arrayDouble = {1.57, 7.654, 9.986};
    static char[] arrayChar = {'i', 'g', 'o', 'r'};

    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }


    public static void task2() {
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i != arrayDouble.length - 1) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayChar.length; i++) {
            if (i != arrayChar.length - 1) {
                System.out.print(arrayChar[i] + ", ");
            } else {
                System.out.println(arrayChar[i]);
            }
        }
    }

    public static void task3() {
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayChar[i] + ", ");
            } else {
                System.out.println(arrayChar[i]);
            }
        }
    }

    public static void task4() {
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
    }
}