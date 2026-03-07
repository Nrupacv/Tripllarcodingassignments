package MODULE3;
    public class squarenumber {
        int findSquare(int n) {
            return n * n;
        }
        public static void main(String[] args) {

            squarenumber obj = new squarenumber();

            int number = 15;
            int result = obj.findSquare(number);

            System.out.println("Square of " + number + " is " + result);
        }
    }
}
