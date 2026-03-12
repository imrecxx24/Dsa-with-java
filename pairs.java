public class pairs{

    public static void pairups(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                System.out.print("(" + n[i] + ", " + n[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6};
        pairups(n);
    }
}
