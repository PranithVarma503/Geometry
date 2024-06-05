package Model;

public interface Solid<T> {
    //this is the generic interface that need to be implemented by any object.i.e., sphere or cube
    double volume(T properties);
}