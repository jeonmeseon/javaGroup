package t20_AWT.T1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Test9 extends Frame {

	public Test9() {
		super("AWT 프레임");
		//setTitle("AWT 프레임");
		//setSize(300,250);
		setBounds(300, 200, 350, 250);
		
		// 레이블 컴포넌트
		Label label = new Label("레이블 테스트 입니다.");
		this.add(label);
		
		// 버튼 컴포넌트
		Button exitBtn = new Button("Exit");
		//this.add(button);
		add(exitBtn);
		
		exitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test9();
	}
	
}
