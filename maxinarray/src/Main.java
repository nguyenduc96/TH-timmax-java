import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] value = displayMax(inputArray());
        System.out.printf("Tỷ phú có giàu nhất giá trị tài sản là : %d tại vị trí %d " ,value[0], value[1]);
    }

    public static int[] displayMax(int[] array){
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
                index = i;
            }
        }
        return new int[] {max, index};
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập kích thước của mảng:");
        int size = scanner.nextInt();
        int[] arrayBillion = new int[size];

        for (int i = 0; i < arrayBillion.length; i++) {
            System.out.println("Nhập vào giá của mảng : ");
            arrayBillion[i] = scanner.nextInt();
        }
        return arrayBillion;
    }
}
