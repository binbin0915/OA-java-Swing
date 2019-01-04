package com.mmciel.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import com.mmciel.data.DataToLogin;
import com.mmciel.data.DataToUser;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reg {

	private JFrame RegFrame;
	private JTextField username;
	private JPasswordField password;
	private JTextField number;
	private JTextField name;
	private JTextField age;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Reg window = new Reg();
//					window.RegFrame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	//另一界面调用
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
					window.RegFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		RegFrame = new JFrame();
		RegFrame.setTitle("YiSoo-OA-\u6CE8\u518C");
		RegFrame.setBounds(100, 100, 519, 754);
		//RegFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RegFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MyPanel panel = new MyPanel();
		RegFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YiSoo-OA-\u6CE8\u518C");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("幼圆", Font.PLAIN, 40));
		lblNewLabel.setBounds(15, 15, 467, 75);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("幼圆", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(44, 105, 100, 45);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u5BC6\u7801");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("幼圆", Font.PLAIN, 25));
		label.setBounds(44, 164, 100, 45);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u7F16\u53F7");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("幼圆", Font.PLAIN, 25));
		label_1.setBounds(44, 224, 100, 45);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("幼圆", Font.PLAIN, 25));
		label_2.setBounds(44, 284, 100, 45);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u5E74\u9F84");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("幼圆", Font.PLAIN, 25));
		label_3.setBounds(44, 349, 100, 45);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("\u6027\u522B");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("幼圆", Font.PLAIN, 25));
		label_4.setBounds(44, 414, 100, 45);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\u6743\u9650");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("幼圆", Font.PLAIN, 25));
		label_5.setBounds(44, 481, 100, 45);
		panel.add(label_5);
		
		username = new JTextField();
		username.setFont(new Font("幼圆", Font.PLAIN, 25));
		username.setHorizontalAlignment(SwingConstants.LEFT);
		username.setBounds(160, 105, 255, 45);
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("幼圆", Font.PLAIN, 25));
		password.setEchoChar('*');
		password.setHorizontalAlignment(SwingConstants.LEFT);
		password.setBounds(159, 164, 255, 45);
		panel.add(password);
		
		number = new JTextField();
		number.setHorizontalAlignment(SwingConstants.LEFT);
		number.setFont(new Font("幼圆", Font.PLAIN, 25));
		number.setColumns(10);
		number.setBounds(159, 224, 255, 45);
		panel.add(number);
		
		name = new JTextField();
		name.setHorizontalAlignment(SwingConstants.LEFT);
		name.setFont(new Font("幼圆", Font.PLAIN, 25));
		name.setColumns(10);
		name.setBounds(159, 284, 255, 45);
		panel.add(name);
		
		age = new JTextField();
		age.setHorizontalAlignment(SwingConstants.LEFT);
		age.setFont(new Font("幼圆", Font.PLAIN, 25));
		age.setColumns(10);
		age.setBounds(159, 349, 255, 45);
		panel.add(age);
		
		JRadioButton nan = new JRadioButton("\u7537");
		JRadioButton nv = new JRadioButton("\u5973");
		
		
		nv.setFont(new Font("幼圆", Font.PLAIN, 25));
		nv.setBounds(270, 418, 80, 36);
		panel.add(nv);
		nan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//性别男被单选
				nv.setSelected(false);
			}
		});
		nv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//性别nv被单选
				nan.setSelected(false);
			}
		});
		nan.setFont(new Font("幼圆", Font.PLAIN, 25));
		nan.setBounds(160, 418, 80, 36);
		panel.add(nan);
		

		
		JCheckBox ad = new JCheckBox("\u7BA1\u7406\u5458");
		ad.setFont(new Font("幼圆", Font.PLAIN, 25));
		ad.setBounds(155, 490, 149, 29);
		panel.add(ad);
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataToUser data = new DataToUser();
				DataToLogin logindata = new DataToLogin(username.getText(),new String(password.getPassword()));
				
				//数据校验
				if(username.getText().isEmpty()||number.getText().isEmpty()||name.getText().isEmpty()||age.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "数据异常", "标题",JOptionPane.WARNING_MESSAGE);
					return;
				}
				if(!nan.isSelected()&&!nv.isSelected()) {
					JOptionPane.showMessageDialog(null, "数据异常", "标题",JOptionPane.WARNING_MESSAGE);
					return;
				}
				data.setUsername(username.getText());
				data.setNumber(number.getText());
				data.setName(name.getText());
				data.setAge(age.getText());
				
				
				if(nan.isSelected()) {
					data.setSex("男");
				}else {
					data.setSex("女");
				}
				
				if(ad.isSelected()) {
					data.setAd("1");
				}else {
					data.setAd("0");
				}
				//登录信息写入mysql
				logindata.setLoginData(logindata);
				data.setUserData(data);

				JOptionPane.showMessageDialog(null, "注册成功", "标题",JOptionPane.WARNING_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("幼圆", Font.PLAIN, 28));
		btnNewButton.setBounds(160, 591, 154, 61);
		panel.add(btnNewButton);
	}
}
