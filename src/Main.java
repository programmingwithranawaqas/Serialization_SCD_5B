import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Product p = new Product(1, 20, "p1", "d1");
//        try(FileOutputStream fos = new FileOutputStream("data.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)){
//
//            oos.writeObject(p);
//            System.out.println("Product has been written in to the file");
//
//        }catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

//        try(FileInputStream fis = new FileInputStream("data.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis)){
//
//            Product p1 = (Product) ois.readObject();
//            System.out.println(p1.toString());
//
//        }catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

//        List<Product> products = new ArrayList<>();
//        products.add(new Product(1, 100, "p1","d1" ));
//        products.add(new Product(2, 200, "p2","d2" ));
//        products.add(new Product(3, 300, "p3","d3" ));
//        try(FileOutputStream fos = new FileOutputStream("data.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)){
//
//            oos.writeObject(products);
//            System.out.println("Products has been written in to the file");
//
//        }catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

//        List<Product> products = null;
//        try(FileInputStream fis = new FileInputStream("data.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis)){
//
//            products = (List<Product>) ois.readObject();
//            System.out.println(products.toString());
//
//        }catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

//        if(products==null) {
//            products = new ArrayList<>();
//        }
//        products.add(new Product(4, 400, "p4","d4" ));
//        try(FileOutputStream fos = new FileOutputStream("data.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)){
//
//            oos.writeObject(products);
//            System.out.println("Products has been written in to the file");
//
//        }catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }


//        HashMap<Integer, Product> hm_products = new HashMap<>();
//        hm_products.put(1,new Product(1, 100, "p1","d1" ));
//        hm_products.put(2,new Product(2, 200, "p2","d2" ));
//        hm_products.put(3,new Product(3, 300, "p3","d3" ));
//
//        try(FileOutputStream fos = new FileOutputStream("data.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)){
//
//            oos.writeObject(hm_products);
//            System.out.println("Product has been written in to the file");
//
//        }catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }

//        try(FileInputStream fis = new FileInputStream("data.ser");
//            ObjectInputStream ois = new ObjectInputStream(fis)){
//
//            HashMap<Integer, Product> products = (HashMap<Integer, Product>) ois.readObject();
//            Product p = products.get(4);
//            if(p != null)
//               System.out.println(p.toString());
//            else
//                System.out.println("Product not found");
//
//        }catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }


    }
}