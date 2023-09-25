package L04_objects;

public class classB {

    public static void main(String[] args) {
        classA a = new classA();

        System.out.println("sum result:");
        System.out.println(a.x() + a.y());

        System.out.println("subtract result:");
        System.out.println(a.x() - a.y());

        System.out.println("multiply result:");
        System.out.println(a.x() * a.y());


    }
}
