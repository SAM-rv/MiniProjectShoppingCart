package ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class ProductDeatils {
    private Map<Integer,Product> map1=new HashMap<>();

    public void productSetter(){
        map1.put(1,new Product(1,"Laptop",40000));
        map1.put(2,new Product(2,"Mobile",10000));
        map1.put(3,new Product(3,"Mouse",1000));
        map1.put(4,new Product(4,"Tablet",8000));
        map1.put(5,new Product(5,"Keyboard",2000));
        map1.put(6,new Product(6,"watch",1500));
        map1.put(7,new Product(7,"Sound",4000));
        map1.put(8,new Product(8,"Earbuds",900));
        map1.put(9,new Product(9,"Headphone",2500));
        map1.put(10,new Product(10,"Computer",30000));
    }
    public void productViewer(){
        System.out.println("Id\tName\tPrice");
        for (Map.Entry<Integer,Product> entry:map1.entrySet()){
            Product p1=entry.getValue();
            System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getPrice());
        }
    }
    public Product getProductById(int id){
        return map1.get(id);
    }
}
