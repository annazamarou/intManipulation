public class PalindromeNumber {

    public static void isPalindromeNumber(int num){
        int reverse = 0;
        int sum = 0;
        int temp = num;

        while(num>0){
            reverse = num % 10; //extract the last digit
            sum = (sum*10) + reverse; //Increase the place value of the sum and add the last digit
            num /= 10; //remove the last digit
        }

        if(temp ==sum){
            System.out.println("palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }
    }

    public static void main(String[] args){
        isPalindromeNumber(151);
        isPalindromeNumber(1);
        isPalindromeNumber(1110);
    }
}
