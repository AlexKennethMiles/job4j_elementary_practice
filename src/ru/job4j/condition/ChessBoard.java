package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int res = (Math.abs(x2 - x1) == Math.abs(y2 - y1)) ? Math.abs(x2 - x1) : 0;
        return res;
    }
}
