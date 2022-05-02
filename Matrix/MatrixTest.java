package Exercise_Test2.SourceCode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixTest {

    @Test
    public void testSwitchRowsOfEmpty() {
        int[][] actual = {{}};
        int[][] expected = {{}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf1x1() {
        int[][] actual = {{4}};
        int[][] expected = {{4}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf1x5() {
        int[][] actual = {{1, 2, 3, 4, 5}};
        int[][] expected = {{1, 2, 3, 4, 5}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf5x1() {
        int[][] actual = {
                {1},
                {2},
                {3},
                {4},
                {5}};
        int[][] expected = {
                {5},
                {4},
                {3},
                {2},
                {1}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf2x3() {
        int[][] actual = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] expected = {
                {4, 5, 6},
                {1, 2, 3}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf3x2() {
        int[][] actual = {
                {1, 2},
                {3, 4},
                {5, 6}};
        int[][] expected = {
                {5, 6},
                {3, 4},
                {1, 2}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchRowsOf6x10() {
        int[][] actual = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
                {5, 6, 7, 8, 9, 0, 1, 2, 3, 4},
                {6, 7, 8, 9, 0, 1, 2, 3, 4, 5}};
        int[][] expected = {
                {6, 7, 8, 9, 0, 1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9, 0, 1, 2, 3, 4},
                {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
                {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};

        Matrix.switchRows(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOfEmpty() {
        char[][] actual = {{}};
        char[][] expected = {{}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf1x1() {
        char[][] actual = {{'1'}};
        char[][] expected = {{'1'}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf1x5() {
        char[][] actual = {
                {'1', '2', '3', '4', '5'}
        };
        char[][] expected = {
                {'5', '4', '3', '2', '1'}
        };

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf5x1() {
        char[][] actual = {
                {'1'},
                {'2'},
                {'3'},
                {'4'},
                {'5'}};
        char[][] expected = {
                {'1'},
                {'2'},
                {'3'},
                {'4'},
                {'5'}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf2x3() {
        char[][] actual = {
                {'1', '2', '3'},
                {'4', '5', '6'}};
        char[][] expected = {
                {'3', '2', '1'},
                {'6', '5', '4'}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf3x2() {
        char[][] actual = {
                {'1', '2'},
                {'3', '4'},
                {'5', '6'}};
        char[][] expected = {
                {'2', '1'},
                {'4', '3'},
                {'6', '5'}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testSwitchColumnsOf6x10() {
        char[][] actual = {
                {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'},
                {'2', '3', '4', '5', '6', '7', '8', '9', '0', '1'},
                {'3', '4', '5', '6', '7', '8', '9', '0', '1', '2'},
                {'4', '5', '6', '7', '8', '9', '0', '1', '2', '3'},
                {'5', '6', '7', '8', '9', '0', '1', '2', '3', '4'},
                {'6', '7', '8', '9', '0', '1', '2', '3', '4', '5'}};
        char[][] expected = {
                {'0', '9', '8', '7', '6', '5', '4', '3', '2', '1'},
                {'1', '0', '9', '8', '7', '6', '5', '4', '3', '2'},
                {'2', '1', '0', '9', '8', '7', '6', '5', '4', '3'},
                {'3', '2', '1', '0', '9', '8', '7', '6', '5', '4'},
                {'4', '3', '2', '1', '0', '9', '8', '7', '6', '5'},
                {'5', '4', '3', '2', '1', '0', '9', '8', '7', '6'}};

        Matrix.switchColumns(actual);

        assertArrayEquals("Incorrect result", expected, actual);
    }
}

