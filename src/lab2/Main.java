package lab2;

import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {

        System.out.println("" +
                "                \"    +”””””””””+        \" +\n" +
                "                \"    |  o   o  |        \" +\n" +
                "                \"    |    ^    |        \" +\n" +
                "                \"    |   '__'  |        \" +\n" +
                "                \"    +---------+    ");


        System.out.println("" +
                "          \"                J     A     V     V     A   \"+\n" +
                "          \"                J    A A     V   V     A A     \"+\n" +
                "          \"            j   J   AAAAA     V V     AAAAA      \"+\n" +
                "          \"             jjj   A     A     V     A     A       ");

        int d, f, g;
        d=10;
        f=15;
        g=20;
        int med = d + f + g;

        System.out.println("Rezultatul ecuatiei este:"+ med /3);

        int x;
        x = 200-100;

        float y= 32.5f;
        float a= 8888888888f;
        float sum = y / a;

        int r = 9;
        boolean b = true;

        System.out.println("Rezultatul adunarii este:" + adunare(100,500));

        System.out.println("Aceasta ecuatie este:" +  (b));
        System.out.println(x);
        System.out.println(x);
        System.out.println(sum());
        printName("Cezar");

    }

    public static int sum(){
        int first = 125;
        int second = 245;
        int sum = first + second;
        return sum;
    }
    public static void printName(String name){
        System.out.println("The name is:");
        System.out.println(name);
    }

    public static int adunare(int firstNumber, int secoundNumber) {
        int result = firstNumber + secoundNumber;
        return result;

    }

}

