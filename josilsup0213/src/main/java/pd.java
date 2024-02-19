public class pd {
    private String n;
    private String s;
    int p;

    public pd(String n, String s, int p) {
        this.n = n;
        this.s = s;
        this.p = p;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return  n +
                ", " + s  +
                ", " + p;
    }
}
