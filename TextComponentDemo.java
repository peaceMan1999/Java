import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//文本框组件
public class TextComponentDemo extends JFrame {
	// 声明组件
	private JPanel p1, p2, p3;
	private JLabel lblName, lblPwd;
	// 声明一个文本框
	private JTextField txtName;

	private JPasswordField txtPwd;

	private JButton btnReg, btnCancel;

	public TextComponentDemo() {
		super("注册新用户");
		this.setLayout(new GridLayout(3,1));

		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		lblName = new JLabel("账 号");
		lblPwd = new JLabel("密 码");

		txtName = new JTextField(20);
		txtPwd = new JPasswordField(20);

		// 设置密码框显示的字符为*
		txtPwd.setEchoChar('*');

		btnReg = new JButton("注册");
		btnCancel = new JButton("清空");

		// 将组件添加到面中
		p1.add(lblName);
		p1.add(txtName);
		this.add(p1);
		p2.add(lblPwd);
		p2.add(txtPwd);
		this.add(p2);
		p3.add(btnReg);
		p3.add(btnCancel);
		this.add(p3);

		// 设置窗口大小
		this.setSize(275, 150);

		this.setLocation(300, 200);
		// 设置窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视性
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextComponentDemo();
	}
}
