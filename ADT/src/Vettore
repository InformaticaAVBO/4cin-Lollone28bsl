public class Vettore<T> {

    T[] v;
    int n, start, delta;

    @SuppressWarnings("unchecked")
    public Vettore( int start, int delta ) {
        if (start<=0) start=10;
        if (delta<=10) delta=10;
        v = (T[]) new Object[start];
        this.start = start;
        this.delta = delta;
        n = 0;
    }

    @SuppressWarnings("unchecked")
    public void add( T s ) {
        if (v.length==n) {
            T[] v2 = (T[]) new Object[v.length + delta];
            for (int i=0; i<n; i++) v2[i]=v[i];
            v = v2;
        }
        v[n++] = s;
    }

    public T get( int i ) {
        if (i<0 || i>=v.length) return null;
        return v[i];
    }

    public String toString() {
        String s = "Sono dimensionato a " + v.length + ", ma contengo " + n + " valori, che sono questi:\n";
        for (int i=0; i<n; i++)
            s += v[i] + "\t";
        return s;
    }

}