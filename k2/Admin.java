package k2;

public class Admin {

    private String name;
    private String address;
    private String number;
    private String email;



    public Admin(String name, String address, String number, String email){
        this.name=name;
        this.address=address;
        this.number=number;
        this.email=email;
        System.out.println(this.toString());

    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        Admin a1=new Admin("eric","hongkong","28261904","568915433@qq.com");
        System.out.println(a1);//k2.Admin@776ec8df
        System.out.println(a1.toString());//k2.Admin@776ec8df
        System.out.println(a1.hashCode());//2003749087

    }

}
