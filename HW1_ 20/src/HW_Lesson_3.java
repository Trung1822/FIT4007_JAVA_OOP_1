public class HW_Lesson_3 {
    public static void main(String[] args) {
        String str1 = "Dai hoc";
        String str2 = "Dai Nam";

        // Cộng hai chuỗi
        String result = str1 + " " + str2;

        // Hiển thị chuỗi kết quả với tất cả chữ in hoa và chiều dài của chuỗi
        System.out.println("Chuỗi kết quả: " + result.toUpperCase());
        System.out.println("Chiều dài của chuỗi: " + result.length());
    }
}
