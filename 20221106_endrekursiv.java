public class App {
    public static void main(String[] args) throws Exception {
        System.out.print(Fakultaet(8));

    }

    public static int Fakultaet(int x) {
        return add_Fakultaet(1, x);
    }

    public static int add_Fakultaet(int y, int x) {
        if (x == 0) {
            return y;
        } else {
            return add_Fakultaet(y * x, x - 1);
        }
    }

}
