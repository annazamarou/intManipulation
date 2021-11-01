public class ReverseInteger {
    public static void main(String[] args) {
        int num = 12345;

        //1st solution with algorithm
        int rev = 0;
        while(num !=0){
            rev = rev*10 + num%10;
            num/= 10;
        }
        System.out.println(rev);

        //2nd solution
        long num1 = 12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
