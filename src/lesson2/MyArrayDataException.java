package lesson2;

public class MyArrayDataException extends MyException {
    public MyArrayDataException(int x, int y) {
        super("В ячейке: " + x + " " + y + " не верный формат данных");
    }
}
