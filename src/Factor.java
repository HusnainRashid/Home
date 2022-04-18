public class Factor {

    public class Main {
        int divisor = 0;
        int result;
        public void main(String[] args) {
            division(120);
        }

        public void division(int number) {
            while (result > 1) {
                if (number % divisor == 0) {
                    divisor += 1;
                    System.out.println(number + "/" + divisor);
                } else {
                    System.out.println("Not working");
                }
            }
        }
    }
}
