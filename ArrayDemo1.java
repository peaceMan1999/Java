import javax.swing.*;
import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[ ] args){
        int [][] myArray = new int[2][];
        myArray[0]=new int[5];
        myArray[1]=new int[10];
//        //用1-10之间的随机整数给第一行元素赋值
        Random r1 = new Random();
        for(int j=0;j<myArray[0].length;j++)
            myArray[0][j]= (int)(Math.random()*10);

//    //用100-200之间的随机整数给第二行元素赋值
        for(int j=0;j< myArray[1].length;j++)
            myArray[1][j]=(int)(Math.random()*100)+100;

        for(int i=0;i< myArray.length;i++){    //输出myArray数组各元素的值
            for(int j=0;j<myArray[i].length;j++)
                System.out.print(myArray[i][j]+ " ");
            System.out.println();
        }
    }

//    public static void main(String args[]){
//        String str01 = JOptionPane.showInputDialog("请输入三角形的一条边a的值：");
//        double a = Double.parseDouble(str01);
//        String str02 = JOptionPane.showInputDialog("请输入三角形的一条边b的值：");
//        double b = Double.parseDouble(str02);
//        String str03 = JOptionPane.showInputDialog("请输入三角形的一条边c的值：");
//        double c = Double.parseDouble(str03);
//
//        boolean d = a+b>c && a+c>b && b+c>a;
//
//        JOptionPane.showMessageDialog(null,"a+b>c&&a+c>b&&b+c>a为"+d);
//    }

}

