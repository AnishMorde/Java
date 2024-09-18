public class half_pyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                if ((i + j) % 2 == 0) { // Check if sum of row and column index is even
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
