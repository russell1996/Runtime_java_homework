public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i< 21; i++){
            if (i % 3 ==0){
                System.out.println("Hello");
            } else if (i % 5 ==0) {
                System.out.println("Runtime");
            } else if (i % 3 ==0 && i % 5 ==0) System.out.println("Hello.Runtime");
            else System.out.println(i);
        }
    }
}