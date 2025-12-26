class MainManualTest {

    public static void main(String[] args) {
        int result = Main.add(10, 20);

        if (result == 30) {
            System.out.println("TEST PASSED ✅");
        } else {
            System.out.println("TEST FAILED ❌ Expected 30 but got " + result);
            System.exit(1); // Maven will treat this as failure
        }
    }
}