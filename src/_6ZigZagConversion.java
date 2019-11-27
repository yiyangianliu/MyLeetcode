public class _6ZigZagConversion {
    /**
     *6. ZigZag Conversion
     * The string "PAYPALISHIRING" is written in a zigzag pattern
     * on a given number of rows like this:
     * (you may want to display this pattern in a fixed font for better legibility)
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * Write the code that will take a string and
     * make this conversion given a number of rows:
     *
     * string convert(string s, int numRows);
     *
     * Example 1:
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     *
     * Example 2:
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     *
     * Explanation:
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     *
     * */
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        for (int i = 0; i < s.length(); i++) {
            int index = i % (2 * numRows - 2);
            index = index < numRows ? index : 2 * numRows - 2 - index;
            sb[index].append(s.charAt(i));
        }
        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return  sb[0].toString();

    }

    public static void main(String[] args){
        String sss = "";
        sss = convert("abdkbab",3);
        System.out.println(sss);
    }
}
