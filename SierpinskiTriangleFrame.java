package Part_3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
    //	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");

	public SierpinskiTriangleFrame() {
        // Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(plusButton);
		panel.add(minusButton);

        // Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
		
        // Register a listener
		plusButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				trianglePanel.increaseOrder();
			}
		});

		minusButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				trianglePanel.decreaseOrder();
			}
		});
	}
}