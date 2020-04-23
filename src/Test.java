import java.io.*;

public class Test {
    public static void main(String[] args) {
        String link = "E:\\Codegym\\Module 2\\Week9\\IOBinaryFile_ProductManager\\product.txt";
        Product[] products = new Product[5];
        products[0] = new Product(1000,"Hammer","Tools and Factory Ware",38,"Only delivery");
        products[1] = new Product(1001,"Axe","Stark Industry",90,"Limited Goods");
        products[2] = new Product(1002,"Tooth brush","",38,"Only delivery");
        products[3] = new Product(1003,"Meat","Funny Piggy",38,"Use in day");
        products[4] = new Product(1004,"Birthday cake","Colgate",38,"Only delivery");
        try {
            FileOutputStream f_o= new FileOutputStream("product.txt");
            for (int i = 0; i < products.length ; i++) {
                byte[] bytes = products[i].inform().getBytes() ;
                byte[] downLine = "\n".getBytes();
                f_o.write(bytes);
                f_o.write(downLine);
            }
            System.out.println("Writer is successful");
            f_o.close();
        } catch (Exception e){
            System.out.println("Buy a new computer , dude ");
        }
        try{
            File file = new File(link);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line=br.readLine())!= null){
                String[] product = line.split(",");
                System.out.println(product[0] + " , " + product[1]+" , "+product[3] );
            }
            br.close();
        }catch (Exception e){
            System.out.println("Trash computer");
        }
    }

}
