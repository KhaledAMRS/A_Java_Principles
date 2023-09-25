package P05_pass_values;

public class classB {

    public static void main(String[] args) {
        P05_pass_values.classA a = new classA();

        System.out.println("sum result:");
        System.out.println(a.x(4)+a.y(5));

        System.out.println("subtract result:");
        System.out.println(a.x(7)-a.y(3));

        System.out.println("multiply result:");
        System.out.println(a.x(3)*a.y(4));


    }
}
