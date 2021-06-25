public class Product{
    private List<Part> associatedParts;
    int id;
    String name;
    double price;
    int stock;
    int min;
    int max;

    //Constructor
    public Product( int productid,
                    String productname,
                    double productprice,
                    int productstock,
                    int productmin,
                    int productmax){

        id = productid;
        name = productname;
        price = productprice;
        stock = productstock;
        min = productmin;
        max = productmax;
    }

    // Setters
    public void setId(int productid){
        id = productid;
    }
    public void setName(String productname){
        name = productname;
    }
    public void setPrice(double productprice){
        price = productprice;
    }
    public void setStock(int productstock){
        stock = productstock;
    }
    public void setMin(int productmin){
        min = productmin;
    }
    public void setMax(int productmax){
        max = productmax;
    }
    public void setPrice(int productmax){
        price = productmax;
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
    public List<Part> getAllAssociatedParts(){
        return associatedParts;
    }

    public void addAssociatedPart(Part associatedPart){

    }
    public void deleteAssociatedPart(Part associatedPart){

    }
}
