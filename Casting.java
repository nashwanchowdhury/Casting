public class Casting {
    public static void main(String[] args){
        double b = 112.35;
        int a = (int)b;
        System.out.println("Double: " + b);
        System.out.println("int: " + a);

        String c = "49";
        int d = Integer.parseInt(c);
        System.out.println("The string value is: " + c);
        System.out.println("The integer value is: " + d);
    }
}