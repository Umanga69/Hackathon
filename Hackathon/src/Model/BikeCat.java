package Model;

public class BikeCat {

    String bike, price;

    public BikeCat(String bike, String price) {
        this.bike = bike;
        this.price = price;
    }



    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public void det(){

        System.out.println("Bikes : ");
        System.out.println("Model : " + bike);
        System.out.println("Amount : " + price);

    }
}