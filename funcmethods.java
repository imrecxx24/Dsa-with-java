public class funcmethods {
    public static int add(int a,int b){
        return a+b;
    }
    public static int factorial(int n){
      int  fact =1;
       for(int i=1;i<=n;i++){
        fact = fact * i;
       }
        return fact;
    }
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }   

    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(factorial(11));
        System.out.println(fibonacci(11));
    }
    
}
