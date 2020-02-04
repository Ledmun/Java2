package lesson2;

public class MyArrayDataException extends MyException {
    public MyArrayDataException(int x, int y) {
        super("В ячейке: " + (x + 1) + "x" + (y + 1) + " не верный формат данных");
    }
}
