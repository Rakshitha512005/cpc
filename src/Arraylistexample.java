import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<String>();
        fruits.add("mango");
        fruits.add("strawberry");
        fruits.add("avacado");
        fruits.add("dragon fruit");
        System.out.println(fruits);

        String removefunction=fruits.remove(1);
        System.out.println(removefunction);

        System.out.println("after removing"+fruits);

        int read=fruits.size();
        System.out.println("the size of the array is "+read);

        for(String i:fruits){
            System.out.println(i);
        }
    }
}
