package com.mmciel.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;

import com.mmciel.data.DataToLogin;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author mmciel
 * 2018��12��16��21:54:46
 * ��¼����
 * update��
 * 		null
 */
public class Login {

	private JFrame LoginFrame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void startlogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.LoginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login window = new Login();
//					window.LoginFrame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginFrame = new JFrame();
		LoginFrame.setTitle("YiSoo-OA-java        by:mmciel");
		LoginFrame.setBounds(100, 100, 780, 595);
		//LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MyPanel  panel = new MyPanel ();
		LoginFrame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		

		
		
		JLabel TitleLable = new JLabel("YiSoo-OA \u767B\u5F55");
		TitleLable.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLable.setFont(new Font("��Բ", Font.PLAIN, 40));
		TitleLable.setBounds(15, 15, 728, 76);
		panel.add(TitleLable);
		
		JLabel usernametext = new JLabel("\u8D26\u53F7\uFF1A");
		usernametext.setHorizontalAlignment(SwingConstants.RIGHT);
		usernametext.setFont(new Font("��Բ", Font.PLAIN, 30));
		usernametext.setBounds(122, 127, 113, 70);
		panel.add(usernametext);
		
		JLabel passwordtext = new JLabel("\u5BC6\u7801\uFF1A");
		passwordtext.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordtext.setFont(new Font("��Բ", Font.PLAIN, 30));
		passwordtext.setBounds(122, 236, 113, 70);
		panel.add(passwordtext);
		
		username = new JTextField();
		username.setFont(new Font("��Բ", Font.PLAIN, 26));
		username.setBounds(266, 137, 312, 53);
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setEchoChar('*');
		password.setFont(new Font("��Բ", Font.PLAIN, 26));
		password.setBounds(266, 246, 312, 53);
		panel.add(password);
		
		JButton loginbutton = new JButton("\u767B\u5F55");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * ��¼�¼���Ӧ��
				 * ��ȡ�ı��������Ƿ�Ϊ�ջ�Ƿ��ַ�
				 * �������ݿ⣬��ѯ��¼��������
				 * ��ת��ҳ��
				 */
				String UserName = username.getText();
				String PassWord = new String(password.getPassword());
				if(UserName.isEmpty() || PassWord.isEmpty()) {
					JOptionPane.showMessageDialog(panel, "�û���������Ϊ�գ�", "��ʾ",JOptionPane.WARNING_MESSAGE); 
					return;
				}
				DataToLogin check = new DataToLogin(UserName,PassWord);
				boolean result = check.getLoginResult();
				if(result) {
					//System.out.println("yes");
					DataToLogin temp = new DataToLogin();
					temp.setUsername(UserName);
					temp.setPassword(PassWord);
					Main.startmain(temp);
					LoginFrame.dispose();
				}else {
					//System.out.println(UserName+PassWord);
					//System.out.println("no");
					JOptionPane.showMessageDialog(panel, "��¼ʧ��", "��ʾ",JOptionPane.WARNING_MESSAGE); 
				}
				
			}
		});
		loginbutton.setFont(new Font("��Բ", Font.PLAIN, 30));
		loginbutton.setBounds(189, 383, 107, 53);
		panel.add(loginbutton);
		
		JButton regbutton = new JButton("\u6CE8\u518C");
		regbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reg.start();
			}
		});
		regbutton.setFont(new Font("��Բ", Font.PLAIN, 30));
		regbutton.setBounds(410, 383, 107, 53);
		panel.add(regbutton);
		
//	    ImageIcon img = new ImageIcon(".//bg.png");
//	    JLabel imgLabel = new JLabel(img);
//	    LoginFrame.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����
//	    imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��
//	    Container cp=LoginFrame.getContentPane();
//	    cp.setLayout(null);
//	    ((JPanel)cp).setOpaque(false);
	}
}
class MyPanel extends JPanel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
        super.paintComponent(g);
        //����һ�ű���ͼƬ  2.jpg��ͼƬ��·��  �Լ��趨Ϊ�Լ���Ҫ��ӵ�ͼƬ
        Image image = new ImageIcon(getClass().getResource("/bg.png")).getImage();
        g.drawImage(image, 0, 0, this);
    }
}
