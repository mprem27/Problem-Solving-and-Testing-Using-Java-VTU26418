import java.util.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            // Top
            for (int j = layer; j < n - layer; j++)
                elements.add(matrix.get(layer).get(j));

            // Right
            for (int i = layer + 1; i < m - layer - 1; i++)
                elements.add(matrix.get(i).get(n - layer - 1));

            // Bottom
            for (int j = n - layer - 1; j >= layer; j--)
                elements.add(matrix.get(m - layer - 1).get(j));

            // Left
            for (int i = m - layer - 2; i > layer; i--)
                elements.add(matrix.get(i).get(layer));

            int rotation = r % elements.size();
            Collections.rotate(elements, -rotation);

            int index = 0;

            // Put back

            for (int j = layer; j < n - layer; j++)
                matrix.get(layer).set(j, elements.get(index++));

            for (int i = layer + 1; i < m - layer - 1; i++)
                matrix.get(i).set(n - layer - 1, elements.get(index++));

            for (int j = n - layer - 1; j >= layer; j--)
                matrix.get(m - layer - 1).set(j, elements.get(index++));

            for (int i = m - layer - 2; i > layer; i--)
                matrix.get(i).set(layer, elements.get(index++));
        }

        // Print
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

public class matrixrotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        Result.matrixRotation(matrix, r);
    }
}
