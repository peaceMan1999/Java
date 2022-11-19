import javax.swing.*;
import java.awt.*;

public class ex_3_2 extends JFrame {
    private JLabel file;    //文本路径标签
    private JButton openFile, openFilePath, saveFile, saveFileTo, reset; //定义打开文件、打开文件路径、保存文件、另存为、重置按钮
    private JTextField jf;  //单行文本框
    private JTextArea ja;   //多行文本框
    private JPanel p1, p2;       //中间容器面板

    public ex_3_2() {
        super("简易记事本");
        //实例化
        file = new JLabel("文本文件路径、名称：");
        openFile = new JButton("打开文件");
        openFilePath = new JButton("打开文件路径");
        saveFile = new JButton("保存文件");
        saveFileTo = new JButton("另存为");
        reset = new JButton("重置");
        //设置文本框长度
        jf = new JTextField(30);
        ja = new JTextArea("开始进行记录吧！", 40, 1);
        ja.setFont(new Font("罙体", Font.PLAIN, 20));   //设置多选文本框字体样式大小等
        ja.setLineWrap(true);       //设置自动换行
        //添加按钮进面板对象
        p1 = new JPanel();
        p2 = new JPanel();
        p1.add(file);
        p1.add(jf);
        p2.add(openFile);
        p2.add(openFilePath);
        p2.add(saveFile);
        p2.add(saveFileTo);
        p2.add(reset);
        //添加至上中下部
        this.add(p1, "North");
        this.add(ja, "Center");
        this.add(p2, "South");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //关闭方式
        this.setSize(900, 600);  //窗口大小
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ex_3_2();
    }
}
