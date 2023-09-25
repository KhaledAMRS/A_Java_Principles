package P07_otherN;

public class classB {


    public static void main(String[] args) {
        String testCase = "valid login";

        switch (testCase = "invalid login")
        {
            case "valid login":
                System.out.println("user is redirected to home page");

            case "invalid login":
                System.out.println("meaningful error message is displayed: username or password is wrong");

            case "suspended user":
                System.out.println("meaningful error message is displayed: your account is disabled, please contact our support team");

        }


    }



}
