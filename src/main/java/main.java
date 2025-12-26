class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int sum = add(first, second);
        System.out.println(first + " + " + second + " = " + sum);
    }
}