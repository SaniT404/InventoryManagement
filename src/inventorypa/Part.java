public class Part{
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    // Constructor
    public Part(int partid,
                String partname,
                double partprice,
                int partstock,
                int partmin,
                int partmax) {
        id = partid;
        name = partname;
        price = partprice;
        stock = partstock;
        min = partmin;
        max = partmax;
    }

    // Setters
    public void setId(int partid){
        id = partid;
    }
    public void setName(String partname){
        name = partname;
    }
    public void setPrice(double partprice){
        price = partprice;
    }
    public void setStock(int partstock){
        stock = partstock;
    }
    public void setMin(int partmin){
        min = partmin;
    }
    public void setMax(int partmax){
        max = partmax;
    }
    public void setPrice(int partmax){
        price = partmax;
    }

    // Getters
    public final int getId(){
        return id;
    }
    public final String getName(){
        return name;
    }
    public final double getPrice(){
        return price;
    }
    public final int getStock(){
        return stock;
    }
    public final int getMin(){
        return min;
    }
    public final int getMax(){
        return max;
    }
}
