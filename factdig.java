public class factdig {
   public int countFactorialDigits(int n) {
        if (n <= 1) return 1;

        double sum = 0;
        for (int i = 2; i <= n; i++) {
            sum += Math.log10(i);
        }

       System.out.println((int) sum + 1);
       return n;
    }
}

    

