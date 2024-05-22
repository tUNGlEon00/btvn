package LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Slide96 {
    public static void main(String[] args) {
        // Khởi tạo LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Thêm phần tử vào LinkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");

        // Hiển thị LinkedHashMap trước khi xóa
        System.out.println("Trước khi xóa:");
        show(linkedHashMap);

        // Xóa phần tử
        linkedHashMap.remove(2);

        // Hiển thị LinkedHashMap sau khi xóa
        System.out.println("Sau khi xóa:");
        show(linkedHashMap);
    }

    private static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        // Lấy tập khóa của LinkedHashMap
        Set<Integer> keySet = linkedHashMap.keySet();

        // Duyệt qua từng khóa trong tập khóa
        for (Integer key : keySet) {
            // Hiển thị khóa và giá trị tương ứng
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
    
}