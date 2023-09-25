package P07_otherN;

public class classC {


    public static void main(String[] args) {
/*
        for (int x= 1 ; x < 4; x++)
        {
            System.out.println("number of attempt: "+x);
        }

        System.out.println("your account is deactivated");
*/

        int i = 1;
        while (i < 4) {
            System.out.println("number of attempt: "+i);
            i++;
            if (i == 4) {
                System.out.println("your account is deactivated");
                break;
            }
        }

    }



}
