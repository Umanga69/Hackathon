package Model;

public class User{

    String name, age, address, contact;

    public User(String name, String age, String address, String contact) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public void info(){

        System.out.println("Customer Details : --");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + contact);

    }

}