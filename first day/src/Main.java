public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=15;
        int temp=a>b ? a:b;
        int max=temp>c? temp:c;
        System.out.printf("%d",max);
    }
}