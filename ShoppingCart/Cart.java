package ShoppingCart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart {
    Map<Integer,CartItem> map2=new HashMap<>();
    ProductDeatils pd;

    public Cart(ProductDeatils pd) {
        this.pd = pd;
    }
    Scanner sc=new Scanner(System.in);
    Product p1=null;
    CartItem c1=null;

    void addProduct(int id,int quantity){
        if(quantity<0){
            System.out.println("Add Valid Quantity");
            return;
        }
    if(map2.containsKey(id)){
        c1= map2.get(id);
        c1.setQuantity(c1.getQuantity() + quantity);
        return;
    }
    p1=pd.getProductById(id);
        if(p1==null){
            System.out.println("Invalid Product ID");
            return;
        }
    map2.put(id,new CartItem(p1,quantity));
        System.out.println("Item Added To Cart Successfully");
}

void removeProduct(int id){
    if(!map2.containsKey(id)){
        System.out.println("Item Not Present In cart");
        return;
    }
    map2.remove(id);
    System.out.println("Item Removed From Cart Successfully");
}

void updateProduct(int id,int quantity){
    if(!map2.containsKey(id)){
        System.out.println("Item Not Present In cart");
        return;
    }
    if(quantity<0){
        System.out.println("Add Valid Quantity");
        return;
    }
    CartItem c1=map2.get(id);
    c1.setQuantity(quantity);
    System.out.println("Item Updated in Cart Successfully");
    if(c1.getQuantity()==0)
        map2.remove(id);
}

void viewCart(){
    System.out.println("Id\tName\tPrice\tQuantity\tTotal");
    if(map2.isEmpty()){
        System.out.println("---------Cart is Empty---------");
        return;
    }
    for(Map.Entry<Integer,CartItem> entry:map2.entrySet()){
        int id=entry.getKey();
        c1=entry.getValue();
        p1=c1.getP();
        System.out.println(id+"\t"+p1.getName()+"\t"+p1.getPrice()+"\t\t"+c1.getQuantity()+"\t"+c1.getTotalPrice());
    }
}

void totalBill(){
        if(map2.isEmpty()){
            System.out.println("Cart Is Empty");
            return;
        }
        int totalCartBill=0;
    for(Map.Entry<Integer,CartItem> entry:map2.entrySet()) {
        c1 = entry.getValue();
        totalCartBill+=c1.getTotalPrice();
    }
    System.out.println("Total Bill :- "+totalCartBill);
    }
}