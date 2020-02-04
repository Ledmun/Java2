package lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arrayStr = {{"1", "2", /*"e"*/"3", "4"},
                {"1", "2", "8", "4"},
                {"1", "2", "3", "4"},
                //{"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        int sum = 0;
        try {
            try {
                sum = MyArray.sumMyArray(arrayStr);
            } catch (MyArraySizeException e) {
                System.out.println(e.toString());
            }
        } catch (MyArrayDataException e1) {
            System.out.println(e1.toString());
        }

        System.out.println("Сумма элементов равна " + sum);
    }
}