package Patterns;

public class Pattern7 {
    public void pattern1(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern7 obj = new Pattern7();
        obj.pattern1(4);

    }
}
