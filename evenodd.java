
public class evenodd {
    public static void main(String[] args) {
        int n=10;
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                evensum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        System.out.println("Even Sum: " + evensum);
        System.out.println("Odd Sum: " + oddsum);
    }
    
}
