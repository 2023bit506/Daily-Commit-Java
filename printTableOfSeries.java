public class printTableOfSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print("\n");
            for (int j = 1; j <= 10; j++) {
                // System.out.print("\t");
                System.out.print(i * j);
                System.out.println("\t");
                
            }
        }
    }
}
