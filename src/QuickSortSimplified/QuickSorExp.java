package QuickSortSimplified;
import java.io.*;
import java.util.*;

public class QuickSorExp {

    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file
            int[] numbers = readFile("input.txt");

            // Sắp xếp mảng bằng Quick Sort
            quickSort(numbers, 0, numbers.length - 1);

            // Ghi kết quả ra file

            writeFile("output.txt", numbers);

            System.out.println("Sorting complete. Check output.txt for results: " );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc các số nguyên từ file
    private static int[] readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<Integer> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            for (String token : tokens) {
                if (!token.isEmpty()) {
                    list.add(Integer.parseInt(token));
                }
            }
        }
        reader.close();

        // Chuyển List thành mảng
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Viết mảng số nguyên ra file
    private static void writeFile(String filename, int[] numbers) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int number : numbers) {
            writer.write(number + " ");
        }
        writer.newLine();
        writer.close();
    }

    // Phương pháp Quick Sort
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Phân vùng cho Quick Sort
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    // Hoán đổi hai phần tử trong mảng
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
