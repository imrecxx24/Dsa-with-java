public class reerse {
    public static void main(String[] args) {
        int reverse=0;
        int n =122463;
        while(n!=0){
            int rem =n%10;
             reverse = reverse *10 +rem;
            n = n/10;

        }
        
System.out.println(reverse);
        
        
    }
    
}
