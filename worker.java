import java.util.Random;

public class worker {
    public static void main(String[] args) {
        int []nums=new int[101];
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        System.out.println("幸运奖获得者是：");
        // 哈希
        while (b != 20)
        {
            a = (int)(Math.random()*99)+1;
            if (nums[a] == 0){
                System.out.println("工号："+a);
                nums[a]++;
                b++;
            }else{
                System.out.println("重复");
            }
        }
        System.out.println("三等奖获得者是：");
        while (c != 10)
        {
            a = (int)(Math.random()*99)+1;
            if (nums[a] == 0){
                System.out.println("工号："+a);
                nums[a]++;
                c++;
            }else{
                System.out.println("重复");
            }
        }
        System.out.println("二等奖获得者是：");
        while (d != 7)
        {
            a = (int)(Math.random()*99)+1;
            if (nums[a] == 0){
                System.out.println("工号："+a);
                nums[a]++;
                d++;
            }else{
                System.out.println("重复");
            }
        }
        System.out.println("一等奖获得者是：");
        while (e != 2)
        {
            a = (int)(Math.random()*99)+1;
            if (nums[a] == 0){
                System.out.println("工号："+a);
                nums[a]++;
                e++;
            }else{
                System.out.println("重复");
            }
        }
        System.out.println("特等奖获得者是：");
        while (f != 1)
        {
            a = (int)(Math.random()*99)+1;
            if (nums[a] == 0){
                System.out.println("工号："+a);
                nums[a]++;
                f++;
            }else{
                System.out.println("重复");
            }
        }
    }
}
