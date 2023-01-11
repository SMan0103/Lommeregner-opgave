public class Andengradslining {
    int a;
    int b;
    int c; 
    static double x1,x2;
  
    public Andengradslining() {
        a = 5;
        b = 6;
        c = -5;
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }
  
    public static void main(String[] args) {
        new Andengradslining();

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
  }