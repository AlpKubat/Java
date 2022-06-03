package filewindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyNotePad {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotePad window = new MyNotePad();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyNotePad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.CYAN);
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		JMenu filemenu = new JMenu("File");
		menuBar.add(filemenu);
		
		JMenuItem newfilemenuitem = new JMenuItem("New File");
		newfilemenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText("");
			}
		});
		filemenu.add(newfilemenuitem);
		
		JMenuItem openfilemenuitem = new JMenuItem("Open File");
		openfilemenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser open = new JFileChooser();
				
				int choice = open.showOpenDialog(openfilemenuitem);
				
				
				if (choice == JFileChooser.APPROVE_OPTION)
				{
					try {
						Scanner sc = new Scanner(new FileReader(open.getSelectedFile().getPath()));
						
						//JOptionPane.showMessageDialog(null,"Dosya Acıldı");
						textArea.setText("");
						while(sc.hasNext())
						{
							textArea.append(sc.nextLine() + "\n");
						}
						}
					catch (FileNotFoundException e1){
						JOptionPane.showMessageDialog(null,e1);
					}
					
					
				}
			}
		});
		filemenu.add(openfilemenuitem);
		
		JMenuItem savemenuitem = new JMenuItem("Save");
		savemenuitem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser save = new JFileChooser();
				int choice= save.showOpenDialog(savemenuitem);
				
				if(choice == JFileChooser.APPROVE_OPTION)
				{
					try {
						BufferedWriter bw = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
						bw.write(textArea.getText());
						bw.close();
						JOptionPane.showMessageDialog(null, "Dosya Kaydedildi.");
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
				}
			}
		});
		filemenu.add(savemenuitem);
		
		JMenu formatmenu = new JMenu("Format");
		menuBar.add(formatmenu);
	}
}
