import java.util.Scanner;
public class houme {
           public static void main(String[] args) {
            // TODO Auto-generated method stub
            int e=30;
            int f= 20;
            boolean bool = false;
            System.out.println("первый дом: задайте ширину и длину");
            Scanner a =new Scanner(System.in);
            int x = a.nextInt();
            int y = a.nextInt();
            System.out.println("второй дом: задайте ширину и длину");
            int z = a.nextInt();
            int c = a.nextInt();

            if(x+z<=e && y+c<=f)
            {
                bool = true;
            }
            if((x+c<=e)&&(y+z)<=f) {
                bool = true;
            }
            if((x+z)<=f && (y+c)<=e)
            {bool = true;}
            if((x+c)<=f&&(z+y)<=e) {
                bool = true;

            }
            else{
                System.out.println("Дома  не помещаются");}
                if (bool==true){
                    System.out.println("Дома помещаются");

                }
        }}

