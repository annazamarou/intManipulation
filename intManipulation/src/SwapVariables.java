public class SwapVariables {
    public static void main(String[] args){
        int x= 5;
        int y = 10;

        //x= 10, y= 5
        // 1st solution with using third variable t
        int t = x;
        x = y;
        y = t;

        System.out.println(x);
        System.out.println(y);

        //2nd solution without using third variable
        int i = 1;
        int j = 2;

        //i=2, j =1
        i = i +j; //3
        j = i -j; //2
        i = i - j; //1
        System.out.println(i);
        System.out.println(j);

        //3rd solution a = 10, b=5
        int a = 5;
        int b = 10;

        a = a *b; //50
        b = a /b; //5
        a = a / b; //10
        System.out.println(a);
        System.out.println(b);

        //4th solution
        int c= 5; //0101
        int d = 10; //1010
        c = c ^ d; //15 -->1111
        d = c ^ d; //10 -->1010
        c = c ^ d; // 5 -->0101
        System.out.println(c);
        System.out.println(d);
    }
}
