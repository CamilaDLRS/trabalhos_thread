public class ContaPrimosThread extends Thread {

  private int limiteMin, limiteMax;

  public ContaPrimosThread (int _limiteMin, int _limiteMax) {
    this.limiteMin = _limiteMin;
    this.limiteMax = _limiteMax;
  }

  @Override
  public void run() {
    for (int i = limiteMin; i <= limiteMax; i++) {
      if (EPrimo(i)) {
        System.out.println(i + " " + this.getName());
      }
    }
  }

  private boolean EPrimo(int valor) {
    for (int j = 2; j < valor; j++) {
        if (valor % j == 0) {
            return false;
        }
    }
    return true;
  }
}
