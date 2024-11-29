public class Interface {

    public interface A {
        void methodA();
    }

    public interface B {
        void methodB();
    }

    public interface C extends A, B {
        void methodC();
    }

    public class D {
        void methodD() {
            System.out.println("This is method D");
        }
    }

    public class E extends D implements C {
        @Override
        public void methodA() {
            System.out.println("This is method A");
        }

        @Override
        public void methodB() {
            System.out.println("This is method B");
        }

        @Override
        public void methodC() {
            System.out.println("This is method C");
        }

        void methodE() {
            System.out.println("This is method E");
        }
    }

    public static void main(String[] args) {
        Interface example = new Interface();
        E obj = example.new E();

        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
    }
}
