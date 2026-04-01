package ShoppingCart;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ProductDeatils pd=new ProductDeatils();
            pd.productSetter();
            Cart c=new Cart(pd);

            System.out.println("<----Select Operation---->");
            System.out.println("0.View Products\n1. Add Product \n2. Remove Product \n3. Update Quantity\n4. View Cart \n5. Calculate Total bill \n6. Exit");
            int ch;
            do {
                ch=sc.nextInt();
                switch (ch) {
                    case 0:{
                        pd.productViewer();;
                    }
                        break;
                    case 1: {
                        System.out.println("Enter ProductId:-");
                        int id = sc.nextInt();
                        System.out.println("Quantity");
                        int quantity = sc.nextInt();
                        c.addProduct(id, quantity);
                    }
                        break;
                    case 2: {
                        System.out.println("Enter ProductId:-");
                        int id = sc.nextInt();
                        c.removeProduct(id);
                    }
                        break;
                    case 3: {
                        System.out.println("Enter ProductId:-");
                        int id = sc.nextInt();
                        System.out.println("Quantity");
                        int quantity = sc.nextInt();
                        c.updateProduct(id,quantity);
                    }
                        break;
                    case 4:
                        c.viewCart();
                        break;
                    case 5:
                        c.totalBill();
                        break;
                    default:
                        System.out.println("---------Invalid Selection-------");
                }
            }while(ch!=6);
        }
    }