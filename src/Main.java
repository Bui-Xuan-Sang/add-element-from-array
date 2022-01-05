import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            size = scanner.nextInt();
            if (size > 100) {
                System.out.println("không được vượt quá 100.");
            }
        } while (size > 100);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Nhập phần tử muốn thêm:");
        int addNumber = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();
        int newArr[] = addElementToArray(index,arr,addNumber);
        System.out.print("Mảng  sau khi thêm phần tử " + addNumber + " là: " + "\n");
        showArray(newArr);
    }

    public static void showArray(int[] array){
        for (int element : array){
            System.out.print(element  + "\n");
        }
    }
    public static int[] addElementToArray(int index, int[] arr,int addNumber){
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < newArr.length;i++){
            if (i < index){
                newArr[i] = arr[i];
            }else if (i == index){
                newArr[i] = addNumber;
            }else {
                newArr[i] = arr[i -1];
            }
        }
        return newArr;
    }
}
