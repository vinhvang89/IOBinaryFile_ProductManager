public class Product {
    private int id ;
    private String name;
    private String brand;
    private double price;
    private String other;

    public Product(int id, String name, String brand, double price, String other) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
    public String inform(){
        return "ID: " +getId() + " , name : " +getName()+" , brand : "+getBrand()+
                " , price : "+getPrice()+" ,other : "+getOther() ;
    }
}
