public class Inventory{
    private List<Part> allParts;
    private List<Product> allProducts;

    // Add
    public void addPart(Part newPart){

    }
    public void addProduct(Product newProduct){

    }

    // Lookup
    public Part lookupPart(int partId){
        for(Part part : allParts){
            if(part.getId() == partId){
                return part;
            }
        }
        System.out.println('Invalide PartID.  Please check your search criteria and try again.');
        Part invalidpart = new Part(-1, 'invalid', -1.00, -1, -1, -1);
        return invalidpart
    }
    public Product lookupProduct(int productId){
        for(Product product : allProducts){
            if(product.getId() == productId){
                return product;
            }
        }
    }
    public List<Part> lookupPart(String partName){
        List<Part> returnedParts;
        for(Part part: allParts){
            if(part.getName() == partName){
                //add part to returnedParts
            }
        }
        return returnedParts;
    }
    public List<Product> lookupProduct(String productName){
        List<Product> returnedProducts;
        for(Product product: allProducts){
            if(product.getName() == productName){
                //add part to returnedProducts
            }
        }
        return returnedProducts;
    }

    //
    public void updatePart(int index, Part selectedPart){

    }
    public void updateProduct(int index, Product selectedProduct){

    }

    public void deletePart(Part selectedPart){
        // Delete Part
        // Reindex
    }
    public void deleteProduct(Product selectedProduct){
        // Delete Product
        // Reindex
    }

    // Getters
    public List<Part> getAllParts(){
        return allParts;
    }
    public List<Product> getAllProducts(){
        return allProducts;
    }

}
