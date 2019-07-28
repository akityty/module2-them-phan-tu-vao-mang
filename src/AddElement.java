import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("mang truoc khi them");

        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap phan tu muon them");
        int addElement = scanner.nextInt();
        System.out.println("nhap vi tri muon them");
        int position = scanner.nextInt();
        try {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (position > i) {
                    newArray[i] = array[i];
                } else if (position == i) {
                    newArray[i] = addElement;
                } else {
                    newArray[i] = array[i - 1];
                }
            }
            System.out.println("mang sau khi them");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("vi tri nhap vao vuot qua gioi han mang");
        }


    }
}
