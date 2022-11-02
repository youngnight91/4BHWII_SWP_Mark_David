public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\n" + RekursivSum(6));
        System.out.print("\n" + IterativSum(6));
    }

    public static int RekursivSum(int given) {
        int result = 0;
        if (given > 0) {
            given--;
            result = given + RekursivSum(given);
        }
        return result;

    }

    public static int IterativSum(int given) {
        int result = 0;
        while (given > 0) {
            given--;
            result = result + given;
        }
        return result;
    }

}
