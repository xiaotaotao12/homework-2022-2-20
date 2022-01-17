package k2;

public class SendsAdmin extends Admin {


    public SendsAdmin(String name, String address, String number, String email) {
        super(name, address, number, email);
    }

    @Override
    public String toString() {
        return "SendsAdmin{}" + "name'" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", number='" + getNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
    class test1 {
        public static void main(String[] args) {
            SendsAdmin a2 = new SendsAdmin("tim", "taiwan", "24458899", "542392663@qq.com");
            System.out.println(a2.toString());
        }
    }
