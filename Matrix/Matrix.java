package Exercise_Test2.SourceCode;


public class Matrix {

    public static void switchRows(int[][] anArray) {
        for (int i = 0; i < anArray.length / 2; i++) {
            for (int j = 0; j < anArray[i].length; j++) {
                int temp = anArray[i][j];
                anArray[i][j] = anArray[anArray.length - i - 1][j];
                int temp2 = anArray[i][j];
                anArray[anArray.length - i - 1][j] = temp;

            }
        }
    }


    public static void switchColumns(char[][] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            for (int j = 0; j < anArray[i].length / 2; j++) {
                char temp = anArray[i][j];
                anArray[i][j] = anArray[i][anArray[i].length - j - 1];
                char temp2 = anArray[i][j];
                anArray[i][anArray[i].length - j - 1] = temp;
                char tep = anArray[i][anArray[i].length - j - 1];

            }
        }
    }
}