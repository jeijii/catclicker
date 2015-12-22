package com.clicker.cat;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Game extends JFrame {
	private static final long serialVersionUID = 2269971701250845501L;
	Integer ballQty = 0;
	Integer pillowQty = 0;
	Integer bucketQty = 0;
	Integer tentQty = 0;
	JLabel ballQtyLbl;
	JLabel pillowQtyLbl;
	JLabel bucketQtyLbl;
	JLabel tentQtyLbl;
	JButton pillowBtn;
	JButton ballBtn;
	JButton tentBtn;
	JButton bucketBtn;
	Game() {
		setBounds(200, 200, 1024, 700);
		getContentPane().setLayout(null);
		
		JButton ballBtn = new JButton("BALL ICON");
		ballBtn.setIcon(new ImageIcon(getClass().getResource("ball-icon.png")));
		ballBtn.setBounds(10, 20, 239, 127);
		getContentPane().add(ballBtn);
		ballBtn.setVisible(true);
		ballBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballQty++;
				ballQtyLbl.setText(ballQty.toString());
			}
		});
		
		JButton pillowBtn = new JButton("PILLOW ICON");
		pillowBtn.setIcon(new ImageIcon(getClass().getResource("pillow-icon.png")));
		pillowBtn.setBounds(10, 180, 239, 127);
		getContentPane().add(pillowBtn);
		pillowBtn.setVisible(true);
		pillowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pillowQty++;
				pillowQtyLbl.setText(pillowQty.toString());
			}
		});
		
		JButton bucketBtn = new JButton("BUCKET ICON");
		bucketBtn.setIcon(new ImageIcon(getClass().getResource("bucket-icon.png")));
		bucketBtn.setBounds(10, 340, 239, 127);
		getContentPane().add(bucketBtn);
		bucketBtn.setVisible(true);
		bucketBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bucketQty++;
				bucketQtyLbl.setText(bucketQty.toString());
			}
		});
		
		JButton tentBtn = new JButton("TENT ICON");
		tentBtn.setIcon(new ImageIcon(getClass().getResource("tent-icon.png")));
		tentBtn.setBounds(10, 500, 239, 127);
		getContentPane().add(tentBtn);
		tentBtn.setVisible(true);
		tentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tentQty++;
				tentQtyLbl.setText(tentQty.toString());
			}
		});

		
		ballQtyLbl = new JLabel(ballQty.toString());
		ballQtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 64));
		ballQtyLbl.setBounds(269, 20, 85, 127);
		getContentPane().add(ballQtyLbl);
		
		pillowQtyLbl = new JLabel(pillowQty.toString());
		pillowQtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 64));
		pillowQtyLbl.setBounds(269, 180, 85, 127);
		getContentPane().add(pillowQtyLbl);
		
		bucketQtyLbl = new JLabel(bucketQty.toString());
		bucketQtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 64));
		bucketQtyLbl.setBounds(269, 340, 85, 127);
		getContentPane().add(bucketQtyLbl);
		
		tentQtyLbl = new JLabel(tentQty.toString());
		tentQtyLbl.setFont(new Font("Tahoma", Font.PLAIN, 64));
		tentQtyLbl.setBounds(269, 500, 85, 127);
		getContentPane().add(tentQtyLbl);
		
	}
}
