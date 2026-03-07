package MODULE3;

    public class add_method {
        int add(int a, int b) {
            return a + b;
        }
        int subtract(int a, int b) {
            return a - b;
        }
        public static void main(String[] args) {
            add_method obj = new add_method();
            int sum = obj.add(10, 5);
            int difference = obj.subtract(10, 5);
            System.out.println("Addition: " + sum);
            System.out.println("Subtraction: " + difference);
        }
    }
}
