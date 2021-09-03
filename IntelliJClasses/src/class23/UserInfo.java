package class23;

public class UserInfo extends UserClass{

    String address;


    UserInfo(String name, String phoneNumber,String address) {
        super(name, phoneNumber);
        this.address=address;

    }

    void userDetails(){
        System.out.println(name+" "+phoneNumber+" "+address);

    }

    public static void main(String[] args) {
        UserInfo userInfo= new UserInfo("Masoud","13546","afkabf");
        userInfo.userDetails();

    }
}
