package module4.excercise47;

public class Algorithm {
    private int a;
    private int b;

    public Algorithm(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int euclideanAlgorithm() {

        int tempA = Math.abs(a);
        int tempB = Math.abs(b);

        if (a * b == 0) {
            tempA = a + b;
        } else {
            while (tempA != tempB) {
                if (tempA > tempB) {
                    tempA -= tempB;
                } else {
                    tempB -= tempA;
                }
            }
        }
        return tempA;
    }

    public void print() {

        if (euclideanAlgorithm() == 0) {
            System.out.println("Obie liczby muszą być różne od zera!");
        } else {
            System.out.println("NWD(" + a + "," + b + ") = " + euclideanAlgorithm());
        }
    }
}
