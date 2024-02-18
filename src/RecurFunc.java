public class RecurFunc {
    public static void main(String[] args) {
        func(3);
    }
    public static void func(int n){
        if (n<1){
            return;
        }
        else{
            func(n-1);
            System.out.println("Hello"+n);
        }
    }
}
