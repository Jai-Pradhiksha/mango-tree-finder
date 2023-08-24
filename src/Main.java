import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int treeNumber = scanner.nextInt();

        boolean isMangoTree = checkMangoTree(rows, cols, treeNumber);

        if (isMangoTree) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkMangoTree(int rows, int cols, int treeNumber) {
        int lastRow = rows;
        int lastCol = cols;

        boolean isFirstRow = treeNumber <= cols;
        boolean isFirstCol = treeNumber % cols == 1;
        boolean isLastCol = treeNumber % cols == 0;

        return isFirstRow || isFirstCol || (isLastCol && treeNumber <= lastRow * cols);
    }
}
