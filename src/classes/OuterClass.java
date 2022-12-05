package classes;

public class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 5;
        public int myInnerMethod() {
            return x;
        }
    }
    static class InnerClass2 {
        int z = 8;
    }
}
class Principal {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass2 myInner2 = new OuterClass.InnerClass2();
        System.out.println(myInner.y + myOuter.x);
        System.out.println(myInner2.z);
        System.out.println(myInner.myInnerMethod());
    }
}
