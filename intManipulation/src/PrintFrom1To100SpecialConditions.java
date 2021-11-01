import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class PrintFrom1To100SpecialConditions {
    public static void main(String[] args) {
//        printWithoutNumbers();
//        System.out.println("**********");
//        printWithoutNumbersII();
//        System.out.println("**********");
//        printWithoutLoops(1);
//        System.out.println("**********");
//        printWithoutNumbersII();
        System.out.println("**********");
        printWithoutLoopsOrRecursion();
        System.out.println("**********");
        printWithoutLoopsOrRecursionII();
    }

    //print 1...100 without using numbers
    //1st solution
    public static void printWithoutNumbers(){
        int one = 'A'/'A'; // equals 1
        String s1 = ".........."; //10 dots

        for (int i= one; i<=(s1.length()*s1.length()); i++){
            System.out.println(i);
        }
    }
    //2nd solution
    //using ASCII-Binary Character Table 'd'=100
    public static void printWithoutNumbersII(){
        int one = 'A'/'A'; // equals 1
        for (int i= one; i<='d'; i++){
            System.out.println(i);
        }

    }


    //print 1...100 without using loops
    //1st solution using recursive function
    public static void printWithoutLoops(int num){
        if (num<=100) {
            System.out.println(num);
            num++;
            printWithoutLoops(num);
        }
    }

    //2nd solution using Java streams
    public static void printWithoutLoopsII(){
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }

    //print 1...100 without using loops or recursion
    //1st solution using Arrays fill
    public static void printWithoutLoopsOrRecursion(){
        Object num[] = new Object[100];
        Arrays.fill(num, new Object(){
            int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));
    }

    //2nd solution using BitSet
    public static void printWithoutLoopsOrRecursionII() {
        String set = new BitSet() {{set(1, 101);}}.toString();
        System.out.append(set, 1, set.length());
    }
}
