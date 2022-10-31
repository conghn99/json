import java.util.*;

public class App {
    public static void main( String[] args ) {
        ProductService service = new ProductService();
        List<Product> list = service.getAllProducts();

        //Liệt kê tất cả các hãng sản phẩm (Sử dụng Set)
        Set<String> set = new HashSet<>();
        for(Product p : list) {
            set.add(p.getBrand());
        }
        System.out.println(set);

        //Liệt kê Danh mục sản phẩm(Category) và số lượng sản phẩm thuộc danh mục đó (Map)
        Map<String, Integer> map = new HashMap<>();
        for(Product p : list) {
            if(!map.containsKey(Arrays.toString(p.getCategory()))) {
                map.put(Arrays.toString(p.getCategory()), 1);
            } else {
                map.replace(Arrays.toString(p.getCategory()), map.get(Arrays.toString(p.getCategory())) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}