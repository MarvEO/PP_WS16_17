package versuch_4.vorbereitung;

/**
 * Created by Marvin Kirsch on 21.12.2016.
 * Matrikelnr.: 11118687
 */
public class Zufallszahl {

    private int a;
    private int b;
    private int m;
    private int z;
    private int start_z;

    public Zufallszahl(int a, int b, int m) {
        this(a, b, m, 0);
    }

    public Zufallszahl(int a, int b, int m, int z) {
        this.a = a;
        this.b = b;
        this.m = m;
        this.start_z = z;
        this.z = (a * z + b) % m;
    }

    public void setSeed(int aw) {
        this.start_z = aw;
    }

    public void reset() {
        this.z = this.start_z;
    }

    public int nextRand() {
        int c = this.z;
        this.z = (this.a * this.z + this.b) % this.m;
        return c;
    }
}