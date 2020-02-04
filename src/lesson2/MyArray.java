package lesson2;

public class MyArray {
    public static int sumMyArray(String[][] arrayStr) throws MyArraySizeException, MyArrayDataException {
        int sum = 4;
        if (arrayStr.length != 4) throw new MyArraySizeException();

        for (int i = 0; i <= arrayStr.length - 1; i++) {
            if (arrayStr[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j <= arrayStr[i].length - 1; j++) {
                try {
                    sum += Integer.parseInt(arrayStr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
