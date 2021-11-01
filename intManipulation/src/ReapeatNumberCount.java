import java.util.HashMap;
import java.util.Set;

public class ReapeatNumberCount {
    public static void main(String[] args) {
        getDigitCount(121);
        System.out.println("********************");
        getDigitCount(12154154454545454L);
        System.out.println("********************");
        getDigitCount(001);
        System.out.println("********************");
        getDigitCount(-1);
        System.out.println("////////////////////");
        frequencyDigit(111);
        System.out.println("////////////////////");
        frequencyDigit(12255214566L);
    }

    //1st solution
    public static void getDigitCount(long num) {

        if (String.valueOf(num).length() == 1){
            System.out.println(num + " : " +1);
            return;
        }
        HashMap<Long, Integer> digitMap = new HashMap<Long, Integer>();

        while (num !=0){
            long lastDigit = num % 10;
            if (digitMap.containsKey(lastDigit)){
                digitMap.put(lastDigit, digitMap.get(lastDigit) +1);
            }else{
                digitMap.put(lastDigit, 1);
            }
            num = num /10;
        }
        Set<Long> keys = digitMap.keySet();
        for(Long key : keys){
            System.out.println(key+ " : "+ digitMap.get(key));
        }
    }

    //2nd solution
    public static void frequencyDigit(long num){
        long[] digitCount = new long[10];
        while (num != 0)
        {
            //Get the lastDigit of num

            long lastDigit = num % 10;

            //incrementing the lastDigit's count

            digitCount[(int) lastDigit]++;

            //Removing the lastDigit from num

            num = num / 10;
        }

        //Printing digits and their frequency

        System.out.println("===================");

        System.out.println("Digits : Frequency");

        System.out.println("===================");

        for (int i = 0; i < digitCount.length; i++)
        {
            if(digitCount[i] != 0)
            {
                System.out.println("   "+i+"   :   "+digitCount[i]);
            }
        }
    }
}
