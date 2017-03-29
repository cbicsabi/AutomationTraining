package generics;

public class Box <T> {

    T content;

    public Box(T x){
        this.content = x;
    }

    public T getContent() {
        return content;
    }
}
