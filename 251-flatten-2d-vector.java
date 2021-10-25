import java.util.NoSuchElementException;

class Vector2D {
    private int[][] vector;
    private int col = 0;
    private int row = 0;

    public Vector2D(int[][] v) {
        vector = v;
    }

    private void advanceToNext() {
        while (row < vector.length && col == vector[row].length) {
            col = 0;
            row++;
        }
    }

    public int next() {
        if (!hasNext()) throw new NoSuchElementException();
        return vector[row][col++];
    }

    public boolean hasNext() {
        advanceToNext();
        return row < vector.length;
    }
}