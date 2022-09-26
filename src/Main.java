public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        float[] newArr = {1.57f, 7.654f, 9.986f};

        int[] secondNewArr = new int[12];
        int sum = 1;
        for (int i = 0; i < secondNewArr.length; i++) {
            secondNewArr[i] = sum;
            sum += secondNewArr[i];
        }

        //Task 2
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.print(arr[j]);
            } else {
                System.out.print(arr[j] + ", ");
            }
        }
        System.out.println();

        for (int k = 0; k < newArr.length; k++) {
            if (k == newArr.length - 1) {
                System.out.print(newArr[k]);
            } else {
                System.out.print(newArr[k] + ", ");
            }
        }
        System.out.println();

        for (int h = 0; h < secondNewArr.length; h++) {
            if (h == secondNewArr.length - 1) {
                System.out.print(secondNewArr[h]);
            } else {
                System.out.print(secondNewArr[h] + ", ");
            }
        }
        System.out.println();

        //Task 3

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();

        for (int k = newArr.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.print(newArr[k]);
            } else {
                System.out.print(newArr[k] + ", ");
            }
        }
        System.out.println();

        for (int h = secondNewArr.length - 1; h >= 0; h--) {
            if (h == 0) {
                System.out.print(secondNewArr[h]);
            } else {
                System.out.print(secondNewArr[h] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + " ");
        }
    }


}

