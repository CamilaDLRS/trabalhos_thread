public class AppV1SemThread {
    public static void main(String[] args) throws Exception {
        
        int inicio = 1;
        int fim = 1000000;

        imprimirPrimos(inicio, fim);
    }

    private static void imprimirPrimos(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (Primo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean Primo(int valor) {
        for (int j = 2; j < valor; j++) {
            if (valor % j == 0) {
                return false;
            }
        }
        return true;
    }
}
