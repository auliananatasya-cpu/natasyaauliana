public class FactorialDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.num = 10;
        System.out.println(f.toString());
    }
}

class Factorial {
    public int num;

    int getFactorial() {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");

        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) {
                sb.append(" * ");
            }
        }

        sb.append(" = ").append(getFactorial());
        return sb.toString();
    }
}