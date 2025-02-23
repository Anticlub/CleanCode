public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(App.dividir(6, 0));
    }
    static int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("División por cero");
        return a / b;
    }
}
