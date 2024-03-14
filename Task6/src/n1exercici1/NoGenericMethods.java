package n1exercici1;

public class NoGenericMethods <T> {

    private T object1;
    private T object2;
    private T object3;

    public NoGenericMethods(T obj1, T obj2, T obj3){
        this.object1 = obj1;
        this.object2 = obj2;
        this.object3 = obj3;

    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject2(T object2) {
        this.object2 = object2;
    }

    public T getObject2() {
        return object2;
    }

    public void setObject3(T object3) {
        this.object3 = object3;
    }

    public T getObject3() {
        return object3;
    }
}
