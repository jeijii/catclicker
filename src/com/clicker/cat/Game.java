package com.clicker.cat;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Game extends JFrame {
	private static final long serialVersionUID = 2269971701250845501L;
	Integer ballQty = 0;
	Integer pillowQty = 0;
	Integer bucketQty = 0;
	Integer tentQty = 0;
	Integer fishes = 0;
	Rate rates;
	JLabel ballQtyLbl;
	JLabel pillowQtyLbl;
	JLabel bucketQtyLbl;
	JLabel tentQtyLbl;
	JButton pillowBtn;
	JButton ballBtn;
	JButton tentBtn;
	JButton bucketBtn;
	JLabel totalFpsLbl;
	JLabel totalFpstxtLbl;
	private JLabel fishesLbl;
	private JLabel lblNewLabel_1;
	Game() {
		setBounds(200, 200, 1024, 700);
		getContentPane().setLayout(null);
		rates = new Rate();
		
		JButton ballBtn = new JButton("BALL ICON");
		ballBtn.setIcon(new ImageIcon(getClass().getResource("ball-icon.png")));
		ballBtn.setBounds(10, 20, 239, 127);
		getContentPane().add(ballBtn);
		ballBtn.setVisible(true);
		ballBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ballQty++;
				totalFpsLbl.setText(rates.addBall().toString());
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
				totalFpsLbl.setText(rates.addPillow().toString());
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
				totalFpsLbl.setText(rates.addBucket().toString());
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
				totalFpsLbl.setText(rates.addTent().toString());
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
		
		totalFpsLbl = new JLabel("0");
		totalFpsLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		totalFpsLbl.setFont(new Font("Tahoma", Font.PLAIN, 44));
		totalFpsLbl.setBounds(354, 20, 317, 70);
		getContentPane().add(totalFpsLbl);
		
		totalFpstxtLbl = new JLabel("Fishes Per Second (FPS)");
		totalFpstxtLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalFpstxtLbl.setBounds(681, 32, 317, 70);
		getContentPane().add(totalFpstxtLbl);
		
		fishesLbl = new JLabel("Fishes");
		fishesLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fishesLbl.setBounds(681, 114, 216, 41);
		getContentPane().add(fishesLbl);
		
		lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(364, 97, 307, 50);
		getContentPane().add(lblNewLabel_1);
		
		// Lambda Runnable
		Runnable updateTotalFps = () -> {
			while(true) {
				System.out.println("Updating total fishes");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		};
		 
		// start the thread
		new Thread(updateTotalFps).start();
		
	}
}
