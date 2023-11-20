package ch03.study.study_3_6;


public class example {
    public static void main(String[] args) {
        saveUser(new userTest(1, "", "","",""));
    }

    private static void saveUser(userTest user) {
        if (user.getName().isEmpty()) {
            throw new IllegalArgumentException(
                    "Can't save user " + user.getId() + ": empty Name");
        }

        if (user.getAddress().isEmpty()) {
            throw new IllegalArgumentException(
                    "Can't save user " + user.getId() + ": empty Address");
        }

        if (user.getPhoneNumber().isEmpty()) {
            throw new IllegalArgumentException(
                    "Can't save user " + user.getId() + ": empty Name");
        }

        if (user.getGender().isEmpty()) {
            throw new IllegalArgumentException(
                    "Can't save user " + user.getId() + ": empty Address");
        }
    }
}

class userTest {

    private final int id;
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String gender;

    public userTest(int id, String name, String address,String phoneNumber,String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender =gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getGender(){
        return gender;
    }
    public static void main(String args[]){

    }
}
