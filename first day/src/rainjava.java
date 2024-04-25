import java.util.Random;
import java.util.Scanner;
public class rainjava {
    //打印九九乘法表
    /*public static void main(String args[]){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=10-i;j++){
                System.out.printf("%d*%d=%d",i,j,i*j);
                System.out.print("    ");
            }
            System.out.println();
        }
    }*/
    //打印3~7的随机数
    /*public static void main(String args[]){
        Random r=new Random();
        for (int i=1;i<=10;i++) {
            int number=r.nextInt(5)+3;//只能从0开始
            System.out.println(number);
        }
    }*/
    //猜数游戏
    /*public static void main(String args[]){
        Random r=new Random();
        int cnt=0;
        int luckynumber=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的数字");
            int guessnumber=sc.nextInt();
            if(guessnumber>luckynumber) {
                System.out.println("您猜的数字过大");
                cnt += 1;
            }else if(guessnumber<luckynumber){
                System.out.println("您猜的数字过小");
                cnt += 1;
            }else{
                System.out.println("恭喜您猜对了");
                cnt += 1;
                break;
            }

        }
        System.out.printf("本次您共猜了%d次",cnt);

    }*/
    //随机排名问题
    public static void main(String args[]){
        int []codes=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<codes.length;i++){
            System.out .println("请输入当前第"+i+1+"个员工的工号");
            int code=sc.nextInt();
            codes[i]=code;
        }
        Random r=new Random();
        for (int i=0;i< codes.length;i++){
            int index=r.nextInt(codes.length);
            int temp=codes[index];
            codes[index]=codes[i];
            codes[i]=temp;
        }
        for (int i=0;i< codes.length;i++){
            System.out.print(codes[i]+" ");
        }
    }
}
