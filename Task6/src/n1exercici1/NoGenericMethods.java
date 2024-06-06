public class NoGenericMethods <String> {

    private String object1;
    private String object2;
    private String object3;

    public NoGenericMethods(String obj1, String obj2, String obj3){
        this.object1 = obj1;
        this.object2 = obj2;
        this.object3 = obj3;

    }

    public void setObject1(String object1) {
        this.object1 = object1;
    }

    public String getObject1() {
        return object1;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public String getObject2() {
        return object2;
    }

    public void setObject3(String object3) {
        this.object3 = object3;
    }

    public String getObject3() {
        return object3;
    }
}
