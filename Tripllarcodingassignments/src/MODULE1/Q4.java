package MODULE1;

public class Q4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in celsius:");
        int c = sc.nextInt();
        int f=(c*9/5)+32;
        System.out.println("the temperature in fahrenheit " +f);
    }
}

