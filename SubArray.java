public class SubArray {

    public void printArr(int[] a, int s, int e){
        System.out.print("{");
        for (int i = s; i <= e; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("}");
    }

    public void printAllSubArr(int[] a, int n){
        for (int s = 0; s < n; s++){
            for (int e = s; e < n; e++){
                printArr(a, s, e);
            }
        }
    }

    public static void main(String[] args) {
        SubArray sa = new SubArray();
        int[] a = {1, 2, 3};
        sa.printAllSubArr(a, 3);
    }
}
