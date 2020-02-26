import java.lang.Math;

public class Puiss {

    private int A;
    private int B;

    public Puiss(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public double[] racineCarre(double[] t) {
        double k = A;
        for (int i = 0; i < t.length; i++) {
            if (k != B + 1) {
                t[i] = Math.sqrt(k);
                k++;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Puiss p = new Puiss(1,5);
        double[] t = new double[5];
        p.racineCarre(t);
        for(int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}
