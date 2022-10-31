import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> getAllProducts(){
        Gson gson = new Gson();
        List<Product> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader("Product.json");
            Type type = new TypeToken<List<Product>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;
    }
}
