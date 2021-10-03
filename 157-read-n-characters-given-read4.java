/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int index = 0;
        while (index < n) {
            char[] buf4 = new char[4];
            int r = read4(buf4);
            int i = 0;
            while (i < r && index < n) {
                buf[index++] = buf4[i++];
            }
            if (i != 4) return index;
        }
        return index;
    }
}