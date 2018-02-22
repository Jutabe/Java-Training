public class Main {

    public static void main(String[] args) {
    String valuepayload = "sharepointlink.com:View{LukaszBanaszewski}";

    valuepayload = valuepayload. replace("{", "(").replace("}", ")");
        System.out.println(valuepayload);
    }

}
