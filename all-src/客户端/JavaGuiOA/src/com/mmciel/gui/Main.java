package com.mmciel.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.mmciel.data.DataToLogin;
import com.mmciel.data.DataToMess;
import com.mmciel.data.DataToUser;
import com.mmciel.tool.DataIni;
import com.mmciel.tool.SaveTableData;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;

import javax.swing.JSplitPane;


public class Main {

	private JFrame yisoomain;
	private JTextField username;
	private JTextField number;
	private JTextField name;
	private JTextField age;
	private JTextField pos;
	private JTextField adress;
	private JTextField tel;
	private JTextField qq;
	private JTextField oldpassword;
	private JTextField newpassword;

//	private JPanel panel_1;
//	private JPanel panel_2;
//	private JPanel panel_3;
//	private JPanel panel_4;
//	private JPanel panel_5;
//	private JPanel panel_6;
	
	//MyPanel 
	private MyPanel panel_1;
	private MyPanel panel_2;
	private MyPanel panel_3;
	private MyPanel panel_4;
	private MyPanel panel_5;
	private MyPanel panel_6;
	private static Main window;
	DataToUser data = new DataToUser();// �û�����
	// �洢�û�
	public static DataToUser userdata;
	public static DataToLogin logindata;
	private JTextField findtext;
	private JTextField textsee;
	private JTable table_2;
	private JTextField qxid;

	/**
	 * Launch the application.
	 */
	public static void startmain(DataToLogin temp) {
		logindata = temp;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Main();
					window.setPanelSee(6);
					window.yisoomain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	public static void main(String[] args) {
//
//		logindata = new DataToLogin();
//		logindata.setUsername("sys");
//		logindata.setPassword("1234");
//
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					window = new Main();
//					window.setPanelSee(6);
//					window.yisoomain.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * panel�л�����
	 */
	public void setPanelSee(int order) {
		switch (order) {
		case 1:
			panel_1.setVisible(true);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			break;
		case 2:
			panel_1.setVisible(false);
			panel_2.setVisible(true);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			break;
		case 3:
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(true);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			break;
		case 4:
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(true);
			panel_5.setVisible(false);
			panel_6.setVisible(false);
			break;
		case 5:
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(true);
			panel_6.setVisible(false);
			break;
		case 6:
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
			panel_4.setVisible(false);
			panel_5.setVisible(false);
			panel_6.setVisible(true);
			break;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		yisoomain = new JFrame();
		yisoomain.setTitle("YiSoo-OA         \u2014\u2014by\uFF1Ammciel");
		yisoomain.setBounds(100, 100, 1221, 724);
		yisoomain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		yisoomain.getContentPane().setLayout(null);

		//getClass().getResource(".\\bg.png")
	    //ImageIcon img = new ImageIcon(".\\bg.png");
		ImageIcon img = new ImageIcon(getClass().getResource("/bg.png"));
	    JLabel imgLabel = new JLabel(img);
	    yisoomain.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//ע�������ǹؼ�����������ǩ��ӵ�jfram��LayeredPane����
	    imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//���ñ�����ǩ��λ��
	    Container cp=yisoomain.getContentPane();
	    cp.setLayout(null);
	    ((JPanel)cp).setOpaque(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 15, 283, 638);
		yisoomain.getContentPane().add(panel);
		panel.setLayout(null);

		JButton button1 = new JButton("\u4FE1\u606F\u4FEE\u6539");
		button1.setFont(new Font("��Բ", Font.PLAIN, 44));
		button1.setBounds(0, 41, 283, 100);
		panel.add(button1);

		JButton button2 = new JButton("\u56E2\u961F\u6210\u5458");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.setPanelSee(2);
			}
		});
		button2.setFont(new Font("��Բ", Font.PLAIN, 44));
		button2.setBounds(0, 140, 283, 100);
		panel.add(button2);

		JButton button3 = new JButton("\u6D88\u606F\u5FEB\u8BAF");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.setPanelSee(3);
			}
		});
		button3.setFont(new Font("��Բ", Font.PLAIN, 44));
		button3.setBounds(0, 240, 283, 100);
		panel.add(button3);

		JButton button4 = new JButton("��������");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.setPanelSee(4);
				// DataToUser temp = new DataToUser();
				 new Client(panel_4,new DataToUser().getUserData(logindata).getName());
			}
		});
		button4.setFont(new Font("��Բ", Font.PLAIN, 44));
		button4.setBounds(0, 340, 283, 100);
		panel.add(button4);

		JButton button5 = new JButton("\u6587\u4EF6\u91C7\u96C6");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//window.setPanelSee(5);
				if(Desktop.isDesktopSupported()){
					try {
					//����һ��URIʵ��
						URI uri = URI.create(DataIni.mmciel_ip_web_file);
						Desktop dp = Desktop.getDesktop();
						if(dp.isSupported(Desktop.Action.BROWSE)){//��ȡϵͳĬ�������������
							dp.browse(uri);
						}
					} catch (IOException ea) {
						//System.out.println("��ȡĬ�������ʧ��");
					}
				}
			}
		});
		button5.setFont(new Font("��Բ", Font.PLAIN, 44));
		button5.setBounds(0, 439, 283, 100);
		panel.add(button5);

		JButton button6 = new JButton("\u656C\u8BF7\u671F\u5F85");

		button6.setFont(new Font("��Բ", Font.PLAIN, 44));
		button6.setBounds(0, 538, 283, 100);
		panel.add(button6);

		JLabel lblNewLabel = new JLabel("\u83DC  \u5355");
		lblNewLabel.setFont(new Font("��Բ", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 283, 45);
		panel.add(lblNewLabel);

		panel_4 = new MyPanel();
		panel_4.setBounds(297, 15, 887, 638);
		yisoomain.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		panel_3 = new MyPanel();
		panel_3.setBounds(297, 15, 887, 638);
		yisoomain.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblYisoooa = new JLabel("YiSoo-OA \u6D88\u606F\u5FEB\u8BAF");
		lblYisoooa.setHorizontalAlignment(SwingConstants.CENTER);
		lblYisoooa.setFont(new Font("��Բ", Font.PLAIN, 40));
		lblYisoooa.setBounds(15, 15, 857, 82);
		panel_3.add(lblYisoooa);
		


		JButton allbutton = new JButton("\u67E5\u770B\u6240\u6709");
		allbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] MessolumnNames = { "���", "����", "ʱ��", "������", "��Ҫ��" };
				Object[][] messobj = DataToMess.getObjectData();
				DefaultTableModel messtableModel = new DefaultTableModel(messobj, MessolumnNames);
				table_2 = new JTable(messtableModel);
				table_2.setBounds(25, 469, 821, -309);
				table_2.setRowHeight(38);
				table_2.setFont(new Font("��Բ", Font.PLAIN, 18));
				TableColumn messcolumn = null;
				int messcolunms = table_2.getColumnCount();
				for (int i = 0; i < messcolunms; i++) {
					messcolumn = table_2.getColumnModel().getColumn(i);
					/* ��ÿһ�е�Ĭ�Ͽ������Ϊ100 */
					messcolumn.setPreferredWidth(60);
				}
				table_2.getColumnModel().getColumn(1).setPreferredWidth(495);
				table_2.getColumnModel().getColumn(2).setPreferredWidth(175);
				table_2.getColumnModel().getColumn(4).setPreferredWidth(50);

				// ����JTable�Զ������б��״̬���˴�����Ϊ�ر�
				table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

				/* ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 */
				JScrollPane messscroll = new JScrollPane(table_2);
				messscroll.setLocation(15, 150);
				messscroll.setSize(843, 298);
				panel_3.add(messscroll);
			}
		});
		allbutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		allbutton.setBounds(15, 112, 422, 36);
		panel_3.add(allbutton);

		JButton upbutton = new JButton("\u67E5\u770B\u7D27\u6025\u901A\u77E5");
		upbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] MessolumnNames = { "���", "����", "ʱ��", "������", "��Ҫ��" };
				Object[][] messobj = DataToMess.getObjectDataUp();
				DefaultTableModel messtableModel = new DefaultTableModel(messobj, MessolumnNames);
				table_2 = new JTable(messtableModel);
				table_2.setBounds(25, 469, 821, -309);
				table_2.setRowHeight(38);
				table_2.setFont(new Font("��Բ", Font.PLAIN, 18));
				TableColumn messcolumn = null;
				int messcolunms = table_2.getColumnCount();
				for (int i = 0; i < messcolunms; i++) {
					messcolumn = table_2.getColumnModel().getColumn(i);
					/* ��ÿһ�е�Ĭ�Ͽ������Ϊ100 */
					messcolumn.setPreferredWidth(60);
				}
				table_2.getColumnModel().getColumn(1).setPreferredWidth(495);
				table_2.getColumnModel().getColumn(2).setPreferredWidth(175);
				table_2.getColumnModel().getColumn(4).setPreferredWidth(50);
				// ����JTable�Զ������б��״̬���˴�����Ϊ�ر�
				table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

				/* ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 */
				JScrollPane messscroll = new JScrollPane(table_2);
				messscroll.setLocation(15, 150);
				messscroll.setSize(843, 298);
				panel_3.add(messscroll);
			}
		});
		upbutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		upbutton.setBounds(437, 112, 422, 36);
		panel_3.add(upbutton);

		String[] MessolumnNames = { "���", "����", "ʱ��", "������", "��Ҫ��" };
		Object[][] messobj = DataToMess.getObjectData();
		DefaultTableModel messtableModel = new DefaultTableModel(messobj, MessolumnNames);
		table_2 = new JTable(messtableModel);
		table_2.setBounds(25, 469, 821, -309);
		table_2.setRowHeight(38);
		table_2.setFont(new Font("��Բ", Font.PLAIN, 18));
		TableColumn messcolumn = null;
		int messcolunms = table_2.getColumnCount();
		for (int i = 0; i < messcolunms; i++) {
			messcolumn = table_2.getColumnModel().getColumn(i);
			/* ��ÿһ�е�Ĭ�Ͽ������Ϊ100 */
			messcolumn.setPreferredWidth(60);
		}
		table_2.getColumnModel().getColumn(1).setPreferredWidth(495);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(50);

		// ����JTable�Զ������б��״̬���˴�����Ϊ�ر�
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		/* ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 */
		JScrollPane messscroll = new JScrollPane(table_2);
		messscroll.setLocation(15, 150);
		messscroll.setSize(843, 298);
		panel_3.add(messscroll);

		JLabel lblId = new JLabel("id");
		lblId.setFont(new Font("��Բ", Font.PLAIN, 25));
		lblId.setBounds(15, 463, 72, 36);
		panel_3.add(lblId);

		JLabel textlebel = new JLabel("\u5185\u5BB9");
		textlebel.setFont(new Font("��Բ", Font.PLAIN, 25));
		textlebel.setBounds(15, 509, 72, 36);
		panel_3.add(textlebel);

		JTextPane qxtext = new JTextPane();
		qxtext.setFont(new Font("��Բ", Font.PLAIN, 25));
		qxtext.setBounds(102, 509, 744, 114);
		panel_3.add(qxtext);

		qxid = new JTextField();
		qxid.setFont(new Font("��Բ", Font.PLAIN, 25));
		qxid.setBounds(99, 463, 251, 36);
		panel_3.add(qxid);
		qxid.setColumns(10);

		JCheckBox qxup = new JCheckBox("\u7D27\u6025\u901A\u77E5");
		qxup.setFont(new Font("��Բ", Font.PLAIN, 25));
		qxup.setBounds(460, 467, 149, 29);
		panel_3.add(qxup);

		JButton qxbutton = new JButton("\u63D0\u4EA4\u5FEB\u8BAF");
		qxbutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		qxbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataToUser t = new DataToUser();
				t = t.getUserData(logindata);
				if (t.getAd().equals("0")) {
					JOptionPane.showMessageDialog(null, "�ǹ���Ա�˻��޷�����", "��ʾ", JOptionPane.WARNING_MESSAGE);
					return;
				}
				String id = qxid.getText();
				String text = qxtext.getText();
				if (id.isEmpty() || text.isEmpty()) {
					JOptionPane.showMessageDialog(null, "id������Ϊ��", "��ʾ", JOptionPane.WARNING_MESSAGE);
					return;
				}
				boolean up = qxup.isSelected();
				DataToMess data = new DataToMess(id, text, up, logindata);
				data.setMessData(data);
				JOptionPane.showMessageDialog(null, "�����ɹ�", "��ʾ", JOptionPane.WARNING_MESSAGE);
			}
		});
		qxbutton.setBounds(681, 463, 165, 36);
		panel_3.add(qxbutton);

		panel_2 = new MyPanel();
		panel_2.setBounds(300, 15, 884, 638);
		yisoomain.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("YiSoo-OA\u56E2\u961F\u6210\u5458");
		lblNewLabel_3.setBounds(15, 15, 857, 82);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("��Բ", Font.PLAIN, 40));

		// ========================��
		String[] columnNames = { "���", "����", "����", "�Ա�", "ְλ", "��ַ", "�绰", "QQ" };
		Object[][] obj = logindata.getObjectData();
		DefaultTableModel tableModel = new DefaultTableModel(obj, columnNames);
		JTable table_1 = new JTable(tableModel);
		table_1.setRowHeight(38);
		table_1.setFont(new Font("��Բ", Font.PLAIN, 19));
		table_1.setBounds(15, 613, 840, -434);
		TableColumn column = null;
		int colunms = table_1.getColumnCount();
		for (int i = 0; i < colunms; i++) {
			column = table_1.getColumnModel().getColumn(i);
			/* ��ÿһ�е�Ĭ�Ͽ������Ϊ100 */
			column.setPreferredWidth(100);
		}
		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(50);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(80);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(170);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(170);
		// ����JTable�Զ������б��״̬���˴�����Ϊ�ر�
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		/* ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 */
		JScrollPane scroll = new JScrollPane(table_1);
		scroll.setLocation(29, 213);
		scroll.setSize(819, 425);
		panel_2.add(scroll);

		JButton updatebutton = new JButton("\u5237\u65B0");
		updatebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// tableModel.setRowCount( 0 );
				// DefaultTableModel model = new DefaultTableModel(logindata.getObjectData(),
				// columnNames);
				// table_1.setModel(model);
				String[] columnNames = { "���", "����", "����", "�Ա�", "ְλ", "��ַ", "�绰", "QQ" };
				Object[][] obj = logindata.getObjectData();
				DefaultTableModel tableModel = new DefaultTableModel(obj, columnNames);
				JTable table_1 = new JTable(tableModel);
				table_1.setRowHeight(38);
				table_1.setFont(new Font("��Բ", Font.PLAIN, 19));
				table_1.setBounds(15, 613, 840, -434);

				TableColumn column = null;
				int colunms = table_1.getColumnCount();
				for (int i = 0; i < colunms; i++) {
					column = table_1.getColumnModel().getColumn(i);
					/* ��ÿһ�е�Ĭ�Ͽ������Ϊ100 */
					column.setPreferredWidth(100);
				}
				table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
				table_1.getColumnModel().getColumn(2).setPreferredWidth(50);
				table_1.getColumnModel().getColumn(3).setPreferredWidth(50);
				table_1.getColumnModel().getColumn(4).setPreferredWidth(80);
				table_1.getColumnModel().getColumn(5).setPreferredWidth(170);
				table_1.getColumnModel().getColumn(6).setPreferredWidth(170);
				// ����JTable�Զ������б��״̬���˴�����Ϊ�ر�
				table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

				/* ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴 */
				JScrollPane scroll = new JScrollPane(table_1);

				scroll.setLocation(29, 213);
				scroll.setSize(819, 425);
				panel_2.add(scroll);
			}
		});
		updatebutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		updatebutton.setBounds(54, 112, 88, 37);
		panel_2.add(updatebutton);

		JButton outputbutton = new JButton("\u5BFC\u51FA");
		outputbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(); // ����ѡ����
				chooser.setMultiSelectionEnabled(true); // ��Ϊ��ѡ
				int returnVal = chooser.showOpenDialog(outputbutton); // �Ƿ���ļ�ѡ���
				// System.out.println("returnVal="+returnVal);

				if (returnVal == JFileChooser.APPROVE_OPTION) { // ��������ļ�����
					String filepath = chooser.getSelectedFile().getAbsolutePath(); // ��ȡ����·��
					// System.out.println(filepath);
					Object[][] obj = logindata.getObjectData();
					SaveTableData.SaveTableDataToTxtFile(filepath, obj);
				}
			}
		});
		outputbutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		outputbutton.setBounds(235, 112, 88, 37);
		panel_2.add(outputbutton);

		JButton finddata = new JButton("\u67E5\u627E");
		finddata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = findtext.getText();
				Object[][] obj = logindata.getObjectData();

				int ans = -1;
				for (int i = 0; i < obj.length; i++) {
					for (int j = 0; j < obj[i].length; j++) {
						if (temp.equals(obj[i][j])) {
							ans = i;
							break;
						}
					}
					if (ans != -1) {
						break;
					}
				}
				textsee.setVisible(true);
				if (ans == -1) {
					textsee.setText("δ�ҵ�");
				} else {
					String see = "";
					for (int i = 0; i < obj[ans].length; i++) {
						see += obj[ans][i] + "  ";
					}
					textsee.setText(see);
				}
			}
		});
		finddata.setFont(new Font("��Բ", Font.PLAIN, 25));
		finddata.setBounds(449, 112, 88, 37);
		panel_2.add(finddata);

		findtext = new JTextField();
		findtext.setFont(new Font("��Բ", Font.PLAIN, 25));
		findtext.setBounds(586, 112, 256, 37);
		panel_2.add(findtext);
		findtext.setColumns(10);

		textsee = new JTextField();
		textsee.setFont(new Font("��Բ", Font.PLAIN, 25));
		textsee.setBounds(29, 164, 819, 34);
		panel_2.add(textsee);
		textsee.setColumns(10);
		textsee.setVisible(false);

		// ===============================================

		panel_1 = new MyPanel();
		panel_1.setBounds(297, 15, 887, 638);
		yisoomain.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("YiSoo-OA \u4EBA\u5458\u4FE1\u606F\u4FEE\u6539");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("��Բ", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(15, 15, 857, 82);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u7528\u6237\u540D");
		lblNewLabel_2.setFont(new Font("��Բ", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(15, 133, 122, 46);
		panel_1.add(lblNewLabel_2);

		username = new JTextField();
		username.setFont(new Font("��Բ", Font.PLAIN, 25));
		username.setBounds(156, 133, 275, 46);
		panel_1.add(username);
		username.setColumns(10);

		JLabel label = new JLabel("\u7F16\u53F7");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("��Բ", Font.PLAIN, 25));
		label.setBounds(15, 207, 122, 46);
		panel_1.add(label);

		JLabel label_1 = new JLabel("\u59D3\u540D");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_1.setBounds(15, 279, 122, 46);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("\u5E74\u9F84");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_2.setBounds(15, 359, 122, 46);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_3.setBounds(15, 432, 122, 46);
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("\u6743\u9650");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_4.setBounds(15, 505, 122, 46);
		panel_1.add(label_4);

		JLabel label_5 = new JLabel("\u804C\u4F4D");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_5.setBounds(464, 133, 122, 46);
		panel_1.add(label_5);

		JLabel label_6 = new JLabel("\u5730\u5740");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_6.setBounds(464, 207, 122, 46);
		panel_1.add(label_6);

		JLabel label_7 = new JLabel("\u7535\u8BDD");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_7.setBounds(464, 279, 122, 46);
		panel_1.add(label_7);

		JLabel lblQq = new JLabel("QQ");
		lblQq.setHorizontalAlignment(SwingConstants.CENTER);
		lblQq.setFont(new Font("��Բ", Font.PLAIN, 25));
		lblQq.setBounds(464, 359, 122, 46);
		panel_1.add(lblQq);

		JLabel label_9 = new JLabel("\u539F\u5BC6\u7801");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_9.setBounds(464, 432, 122, 46);
		panel_1.add(label_9);

		JLabel label_10 = new JLabel("\u65B0\u5BC6\u7801");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("��Բ", Font.PLAIN, 25));
		label_10.setBounds(464, 505, 122, 46);
		panel_1.add(label_10);

		JButton savebutton = new JButton("\u4FDD\u5B58\u4FE1\u606F");
		savebutton.setFont(new Font("��Բ", Font.PLAIN, 25));
		savebutton.setBounds(685, 575, 157, 48);
		panel_1.add(savebutton);

		number = new JTextField();
		number.setFont(new Font("��Բ", Font.PLAIN, 25));
		number.setColumns(10);
		number.setBounds(156, 207, 275, 46);
		panel_1.add(number);

		name = new JTextField();
		name.setFont(new Font("��Բ", Font.PLAIN, 25));
		name.setColumns(10);
		name.setBounds(156, 279, 275, 46);
		panel_1.add(name);

		age = new JTextField();
		age.setFont(new Font("��Բ", Font.PLAIN, 25));
		age.setColumns(10);
		age.setBounds(156, 359, 275, 46);
		panel_1.add(age);

		pos = new JTextField();
		pos.setFont(new Font("��Բ", Font.PLAIN, 25));
		pos.setColumns(10);
		pos.setBounds(581, 133, 275, 46);
		panel_1.add(pos);

		adress = new JTextField();
		adress.setFont(new Font("��Բ", Font.PLAIN, 25));
		adress.setColumns(10);
		adress.setBounds(581, 207, 275, 46);
		panel_1.add(adress);

		tel = new JTextField();
		tel.setFont(new Font("��Բ", Font.PLAIN, 25));
		tel.setColumns(10);
		tel.setBounds(581, 279, 275, 46);
		panel_1.add(tel);

		qq = new JTextField();
		qq.setFont(new Font("��Բ", Font.PLAIN, 25));
		qq.setColumns(10);
		qq.setBounds(581, 359, 275, 46);
		panel_1.add(qq);

		oldpassword = new JTextField();
		oldpassword.setFont(new Font("��Բ", Font.PLAIN, 25));
		oldpassword.setColumns(10);
		oldpassword.setBounds(581, 432, 275, 46);
		panel_1.add(oldpassword);

		newpassword = new JTextField();
		newpassword.setFont(new Font("��Բ", Font.PLAIN, 25));
		newpassword.setColumns(10);
		newpassword.setBounds(581, 505, 275, 46);
		panel_1.add(newpassword);

		JRadioButton nan = new JRadioButton("\u7537");
		nan.setFont(new Font("��Բ", Font.PLAIN, 25));
		nan.setBounds(172, 441, 90, 29);
		panel_1.add(nan);

		JRadioButton nv = new JRadioButton("\u5973");
		nv.setFont(new Font("��Բ", Font.PLAIN, 25));
		nv.setBounds(295, 442, 90, 29);
		panel_1.add(nv);

		nan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �Ա��б���ѡ
				nv.setSelected(false);
			}
		});
		nv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// �Ա�nv����ѡ
				nan.setSelected(false);
			}
		});

		JCheckBox ad = new JCheckBox("\u7BA1\u7406\u5458");
		ad.setFont(new Font("��Բ", Font.PLAIN, 25));
		ad.setBounds(172, 515, 149, 29);
		panel_1.add(ad);

		panel_6 = new MyPanel();
		panel_6.setBounds(297, 15, 887, 638);
		yisoomain.getContentPane().add(panel_6);
		panel_6.setLayout(null);

		JLabel lblYisoooa_1 = new JLabel("Hi "+logindata.getUsername()+"! welcome YiSoo-OA!");
		lblYisoooa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblYisoooa_1.setFont(new Font("��Բ", Font.PLAIN, 40));
		lblYisoooa_1.setBounds(15, 15, 857, 82);
		panel_6.add(lblYisoooa_1);

		JTextPane txtpnYisoooaVersion = new JTextPane();
		txtpnYisoooaVersion.setFont(new Font("��Բ", Font.PLAIN, 32));
		txtpnYisoooaVersion.setText(
				"Project\uFF1AYiSoo-OA \u529E\u516C\u81EA\u52A8\u5316\u7CFB\u7EDF\r\nVersion\uFF1A1.3\r\nBy\uFF1Ammciel\u3001SXY\r\nGitHub\uFF1Anull\r\nmarkdown\uFF1Ahttp://blog.csdn.net/f_zmmfs/");
		txtpnYisoooaVersion.setBounds(67, 140, 777, 325);
		panel_6.add(txtpnYisoooaVersion);
		txtpnYisoooaVersion.setVisible(false);
		JButton closeButton = new JButton("�˳�ϵͳ");
		
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yisoomain.dispose();
			}
		});
		closeButton.setFont(new Font("��Բ", Font.PLAIN, 26));
		closeButton.setBounds(610, 515, 243, 50);
		panel_6.add(closeButton);
		closeButton.setVisible(false);
		JButton seedoc = new JButton("\u67E5\u770B\u5F00\u53D1\u65E5\u5FD7");
		seedoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Desktop.isDesktopSupported()){
					try {
						Runtime.getRuntime().exec("cmd.exe /c start "+DataIni.mmciel_doc);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		seedoc.setFont(new Font("��Բ", Font.PLAIN, 26));
		seedoc.setBounds(610, 585, 243, 50);
		panel_6.add(seedoc);
		seedoc.setVisible(false);

		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("��Բ", Font.PLAIN, 40));
		label_8.setBounds(15, 143, 857, 82);
		panel_6.add(label_8);
		
		panel_5 = new MyPanel();
		panel_5.setBounds(297, 15, 887, 638);
		yisoomain.getContentPane().add(panel_5);
		panel_5.setLayout(null);

		panel_6.setOpaque(false);
		Color c = new Color(0,0,0);
		button1.setBackground(c);
		button1.setOpaque(false);
		button2.setBackground(c);
		button2.setOpaque(false);
		button3.setBackground(c);
		button3.setOpaque(false);
		button4.setBackground(c);
		button4.setOpaque(false);
		button5.setBackground(c);
		button5.setOpaque(false);
		button6.setBackground(c);
		button6.setOpaque(false);
		/**
		 * �¼���Ӧ
		 */
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.setPanelSee(1);
				// ��panel1�������
				// �õ����ݿ�����
				data = data.getUserData(logindata);
				// д���ı���
				username.setText(data.getUsername());
				number.setText(data.getNumber());
				name.setText(data.getName());
				age.setText(data.getAge());
				pos.setText(data.getPos());
				adress.setText(data.getAdress());
				tel.setText(data.getTel());
				qq.setText(data.getQq());
				// дѡ���
				if (data.getSex().equals("��")) {
					nan.setSelected(true);
				} else {
					nv.setSelected(true);
				}
				if (data.getAd().equals("1")) {
					ad.setSelected(true);
				}

			}
		});
		savebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (oldpassword.getText().equals(logindata.getPassword())) {
					data.setUsername(username.getText());
					;
					data.setNumber(number.getText());
					data.setName(name.getText());
					data.setAge(age.getText());
					data.setPos(pos.getText());
					data.setAdress(adress.getText());
					data.setTel(tel.getText());
					data.setQq(qq.getText());
					// дѡ���
					if (nan.isSelected()) {
						data.setSex("��");
					} else {
						data.setSex("Ů");
					}
					if (ad.isSelected()) {
						data.setAd("1");
					}
					data.UpdateUserData(data);

					// ��������
					if (!newpassword.getText().isEmpty()) {
						logindata.setPassword(newpassword.getText());
						logindata.UpdateLoginData(logindata);
					}
					JOptionPane.showMessageDialog(null, "����ɹ�", "��ʾ", JOptionPane.WARNING_MESSAGE);

					// ˢ�½���
					// �õ����ݿ�����
					data = data.getUserData(logindata);
					// д���ı���
					username.setText(data.getUsername());
					number.setText(data.getNumber());
					name.setText(data.getName());
					age.setText(data.getAge());
					pos.setText(data.getPos());
					adress.setText(data.getAdress());
					tel.setText(data.getTel());
					qq.setText(data.getQq());
					// дѡ���
					if (data.getSex().equals("��")) {
						nan.setSelected(true);
					} else {
						nv.setSelected(true);
					}
					if (data.getAd().equals("1")) {
						ad.setSelected(true);
					}
				} else {// ԭʼ�������
					JOptionPane.showMessageDialog(null, "ԭʼ�������", "��ʾ", JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.setPanelSee(6);
				seedoc.setVisible(true);
				closeButton.setVisible(true);
				txtpnYisoooaVersion.setVisible(true);
			}
		});
	}
}

class User{
	private String name;
	private String ip;

	public User(String name, String ip) {
		this.name = name;
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
class Client{
	 
	private JPanel frame;
	private JList<String> userList;
	private JTextArea textArea;
	private JTextField texttext;
	private JTextField txt_port;
	private JTextField txt_hostIp;
	private JTextField txt_name;
	private JButton btn_start;
	private JButton btn_stop;
	private JButton btn_send;
	private JPanel northPanel;
	private JPanel southPanel;
	private JScrollPane rightScroll;
	private JScrollPane leftScroll;
	private JSplitPane centerSplit;
 
	private DefaultListModel<String> listModel;
	private boolean isConnected = false;
 
	private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;
	private MessageThread messageThread;// ���������Ϣ���߳�
	private Map<String, User> onLineUsers = new HashMap<String, User>();// ���������û�
 

 
	// ִ�з���
	public void send() {
		if (!isConnected) {
			JOptionPane.showMessageDialog(frame, "��û�����ӷ��������޷�������Ϣ��", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		String message = texttext.getText().trim();
		if (message == null || message.equals("")) {
			JOptionPane.showMessageDialog(frame, "��Ϣ����Ϊ�գ�", "����",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		sendMessage(txt_name.getText() + "@" + "ALL" + "@" + message);
		texttext.setText(null);
	}
 
	// ���췽��
	public Client(JPanel panel,String name) {
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.blue);
		texttext = new JTextField();
		txt_port = new JTextField("6666");
		txt_hostIp = new JTextField(DataIni.mmciel_ip);
		txt_name = new JTextField(name);
		btn_start = new JButton("����");
		btn_stop = new JButton("�Ͽ�");
		btn_send = new JButton("����");
		listModel = new DefaultListModel<String>();
		userList = new JList<String>(listModel);
 
		northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1, 7));
		northPanel.add(new JLabel("�˿�"));
		northPanel.add(txt_port);
		northPanel.add(new JLabel("������IP"));
		northPanel.add(txt_hostIp);
		northPanel.add(new JLabel("����"));
		northPanel.add(txt_name);
		northPanel.add(btn_start);
		northPanel.add(btn_stop);
		northPanel.setBorder(new TitledBorder("������Ϣ"));
 
		rightScroll = new JScrollPane(textArea);
		rightScroll.setBorder(new TitledBorder("��Ϣ��ʾ��"));
		leftScroll = new JScrollPane(userList);
		leftScroll.setBorder(new TitledBorder("�����û�"));
		southPanel = new JPanel(new BorderLayout());
		southPanel.add(texttext, "Center");
		southPanel.add(btn_send, "East");
		southPanel.setBorder(new TitledBorder("д��Ϣ"));
 
		centerSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftScroll,
				rightScroll);
		centerSplit.setDividerLocation(100);
 		frame = panel;
		frame.setLayout(new BorderLayout());
		frame.add(northPanel, "North");
		frame.add(centerSplit, "Center");
		frame.add(southPanel, "South");
		frame.setSize(840, 600);

		frame.setLocation(320,30);
		// д��Ϣ���ı����а��س���ʱ�¼�
		texttext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				send();
			}
		});
		// �������Ͱ�ťʱ�¼�
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		// �������Ӱ�ťʱ�¼�
		btn_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int port;
				if (isConnected) {
					JOptionPane.showMessageDialog(frame, "�Ѵ���������״̬����Ҫ�ظ�����!",
							"����", JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {
					try {
						port = Integer.parseInt(txt_port.getText().trim());
					} catch (NumberFormatException e2) {
						throw new Exception("�˿ںŲ�����Ҫ��!�˿�Ϊ����!");
					}
					String hostIp = txt_hostIp.getText().trim();
					String name = txt_name.getText().trim();
					if (name.equals("") || hostIp.equals("")) {
						throw new Exception("������������IP����Ϊ��!");
					}
					boolean flag = connectServer(port, hostIp, name);
					if (flag == false) {
						throw new Exception("�����������ʧ��!");
					}
					//frame.setTitle(name);
					JOptionPane.showMessageDialog(frame, "�ɹ�����!");
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(frame, exc.getMessage(),
							"����", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
 
		// �����Ͽ���ťʱ�¼�
		btn_stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isConnected) {
					JOptionPane.showMessageDialog(frame, "�Ѵ��ڶϿ�״̬����Ҫ�ظ��Ͽ�!",
							"����", JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {
					boolean flag = closeConnection();// �Ͽ�����
					if (flag == false) {
						throw new Exception("�Ͽ����ӷ����쳣��");
					}
					JOptionPane.showMessageDialog(frame, "�ɹ��Ͽ�!");
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(frame, exc.getMessage(),
							"����", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	/**
	 * ���ӷ�����
	 */
	public boolean connectServer(int port, String hostIp, String name) {
		// ���ӷ�����
		try {
			socket = new Socket(hostIp, port);// ���ݶ˿ںźͷ�����ip��������
			writer = new PrintWriter(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));
			// ���Ϳͻ����û�������Ϣ(�û�����ip��ַ)
			sendMessage(name + "@" + socket.getLocalAddress().toString());
			// ����������Ϣ���߳�
			messageThread = new MessageThread(reader, textArea);
			messageThread.start();
			isConnected = true;// �Ѿ���������
			return true;
		} catch (Exception e) {
			textArea.append("��˿ں�Ϊ��" + port + "    IP��ַΪ��" + hostIp
					+ "   �ķ���������ʧ��!" + "\r\n");
			isConnected = false;// δ������
			return false;
		}
	}
 
	/**
	 * ������Ϣ
	 */
	public void sendMessage(String message) {
		writer.println(message);
		writer.flush();
	}
	/**
	 * �ͻ��������ر�����
	 */
	@SuppressWarnings("deprecation")
	public synchronized boolean closeConnection() {
		try {
			sendMessage("CLOSE");// ���ͶϿ����������������
			messageThread.stop();// ֹͣ������Ϣ�߳�
			// �ͷ���Դ
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (socket != null) {
				socket.close();
			}
			isConnected = false;
			return true;
		} catch (IOException e1) {
			e1.printStackTrace();
			isConnected = true;
			return false;
		}
	}
	// ���Ͻ�����Ϣ���߳�
	class MessageThread extends Thread {
		private BufferedReader reader;
		private JTextArea textArea;
		// ������Ϣ�̵߳Ĺ��췽��
		public MessageThread(BufferedReader reader, JTextArea textArea) {
			this.reader = reader;
			this.textArea = textArea;
		}
		// �����Ĺر�����
		public synchronized void closeCon() throws Exception {
			// ����û��б�
			listModel.removeAllElements();
			// �����Ĺر������ͷ���Դ
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (socket != null) {
				socket.close();
			}
			isConnected = false;// �޸�״̬Ϊ�Ͽ�
		}
		@SuppressWarnings("unlikely-arg-type")
		public void run() {
			String message = "";
			while (true) {
				try {
					message = reader.readLine();
					StringTokenizer stringTokenizer = new StringTokenizer(
							message, "/@");
					String command = stringTokenizer.nextToken();// ����
					if (command.equals("CLOSE"))// �������ѹر�����
					{
						textArea.append("�������ѹر�!\r\n");
						closeCon();// �����Ĺر�����
						return;// �����߳�
					} else if (command.equals("ADD")) {// ���û����߸��������б�
						String username = "";
						String userIp = "";
						if ((username = stringTokenizer.nextToken()) != null
								&& (userIp = stringTokenizer.nextToken()) != null) {
							User user = new User(username, userIp);
							onLineUsers.put(username, user);
							listModel.addElement(username);
						}
					} else if (command.equals("DELETE")) {// ���û����߸��������б�
						String username = stringTokenizer.nextToken();
						User user = (User) onLineUsers.get(username);
						onLineUsers.remove(user);
						listModel.removeElement(username);
					} else if (command.equals("USERLIST")) {// ���������û��б�
						int size = Integer
								.parseInt(stringTokenizer.nextToken());
						String username = null;
						String userIp = null;
						for (int i = 0; i < size; i++) {
							username = stringTokenizer.nextToken();
							userIp = stringTokenizer.nextToken();
							User user = new User(username, userIp);
							onLineUsers.put(username, user);
							listModel.addElement(username);
						}
					} else if (command.equals("MAX")) {// �����Ѵ�����
						textArea.append(stringTokenizer.nextToken()
								+ stringTokenizer.nextToken() + "\r\n");
						closeCon();// �����Ĺر�����
						JOptionPane.showMessageDialog(frame, "������������������", "����",
								JOptionPane.ERROR_MESSAGE);
						return;// �����߳�
					} else {// ��ͨ��Ϣ
						textArea.append(message + "\r\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
