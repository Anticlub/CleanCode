public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(App.dividir(6, 0));
    }
    static int dividir(int a, int b) {
        if (b == 0) return -1; // Devuelve un código de error
        return a / b;
    }
}
