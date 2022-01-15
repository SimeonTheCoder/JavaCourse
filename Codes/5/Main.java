import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        int m = 0;
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());

            arr[i] = current;

            if(m < arr[i]) {
                m = arr[i];
            }
        }

        for(int j=0; j<n; j++){
            for(int i=0; i<n-1; i++){
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        int a = Integer.parseInt(scanner.nextLine());

        int l = 0;
        int r = m;

        int c = 0, br = 0, prC = 0;
        while(c != a) {
            prC = c;

            if(c > a){
                r = c;
            }else if(c < a){
                l = c;
            }

            c = (r + l) / 2;

            if(prC == c) {
                if(a - 1 == c){
                    c ++;
                }else{
                    c --;
                }

                break;
            }

            br ++;
            System.out.println(c);
        }

        System.out.println(c);
    }
}
