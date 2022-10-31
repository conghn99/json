import com.google.gson.annotations.SerializedName;

public class Product {

    private int id;
    private String name;
    private String description;
    private String color;
    private String[] category;
    private String brand;
    private double price;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String description, String color, String[] category, String brand, double price, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.status = status;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getBrand() { return brand; }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
