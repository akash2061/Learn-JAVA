public class Generics_class<T> {
    T x;

    Generics_class(T x) {
        this.x = x;
    }

    public T getVal() {
        return x;
    }
}
