import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class TugasPraktik2 {

    public static void main(String[] args) {

        System.out.println("===== STACK (LIFO) =====");

        Stack<Integer> stack = new Stack<>();

        int[] dataStack = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println("Proses Push:");
        for (int data : dataStack) {
            stack.push(data);
            System.out.println("Push : " + data + " -> " + stack);
        }

        System.out.println("\nIsi Stack Sebelum Pop:");
        System.out.println(stack);

        int popData = stack.pop();

        System.out.println("\nData yang di-pop: " + popData);

        System.out.println("\nIsi Stack Sesudah Pop:");
        System.out.println(stack);


        System.out.println("\n===== QUEUE (FIFO) =====");

        Queue<Integer> queue = new LinkedList<>();

        int[] dataQueue = {11, 22, 33, 44, 55, 66, 77, 88};

        System.out.println("Proses Enqueue:");
        for (int data : dataQueue) {
            queue.offer(data);
            System.out.println("Enqueue : " + data + " -> " + queue);
        }

        System.out.println("\nIsi Queue Sebelum Dequeue:");
        System.out.println(queue);

        int dequeueData = queue.poll();

        System.out.println("\nData yang di-dequeue: " + dequeueData);

        System.out.println("\nIsi Queue Sesudah Dequeue:");
        System.out.println(queue);

        System.out.println("\n===== QUICK SORT =====");

        int[] arr = {45, 12, 78, 34, 23, 89, 67, 10};

        System.out.println("Data Sebelum Diurutkan:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nData Sesudah Diurutkan:");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}