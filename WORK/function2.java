public class function2 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }
    //throw = бросить
    public static int divide(int a1, int a2){
        if(a2 == 2){
            throw new RuntimeException("Divide by zero not permited");
        }
        return a1/a2;
    }
}
