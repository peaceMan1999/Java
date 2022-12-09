import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

//文本框组件
public class TextDemo extends JFrame {
	// 声明组件
	private JPanel p1, p2, p3, p4;
	private JLabel lblName, lblPwd, lblRPwd;
	// 声明一个文本框
	private JTextField txtName;

	private JPasswordField txtPwd, txtRPwd;

	private JButton btnReg, btnCancel;

	public TextDemo() {
		super("注册");
		this.setLayout(new GridLayout(4,1));

		p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		lblName = new JLabel("账     号");
		lblPwd = new JLabel("密     码 ");
		lblRPwd = new JLabel("确认密码");

		txtName = new JTextField(20);
		txtPwd = new JPasswordField(20);
		txtRPwd = new JPasswordField(20);
		// 设置密码框显示的字符为*
		txtPwd.setEchoChar('*');

		btnReg = new JButton("注册");
		btnCancel = new JButton("重置");

		// 将组件添加到面中
		p1.add(lblName);
		p1.add(txtName);
		this.add(p1);
		p2.add(lblPwd);
		p2.add(txtPwd);
		this.add(p2);
		p3.add(lblRPwd);
		p3.add(txtRPwd);
		this.add(p3);
		p4.add(btnReg);
		p4.add(btnCancel);
		this.add(p4);

		// 设置窗口大小
		this.setSize(300, 170);

		this.setLocation(300, 200);
		// 设置窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视性
		this.setVisible(true);

		btnReg.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = new String(txtPwd.getPassword());
				String R_str = new String(txtRPwd.getPassword());
				if (txtName.getText().length()<10){
					JOptionPane.showMessageDialog(null,"用户名长度小于10！");
					JOptionPane.showMessageDialog(null,"注册失败");
				}
				else if(!(str.equals(R_str))){
					JOptionPane.showMessageDialog(null,"密码与确认密码不一致!");
					JOptionPane.showMessageDialog(null,"注册失败..");
				}
				else{
					JOptionPane.showMessageDialog(null,"注册成功！");
				}
			}
		});
		btnCancel.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtPwd.setText("");
				txtRPwd.setText("");
			}
		});

	}
	
	public static void main(String[] args) {
		new TextDemo();
	}
}
