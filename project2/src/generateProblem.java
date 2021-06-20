package project2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
/*
 �� Ŭ������ ���й����� ����� ������ ���� ���� Ȯ���ϴ� gui ���α׷��Դϴ�.
 */
public class generateProblem extends JFrame implements ActionListener{
    String[] cal;//���� ������ �����ϱ� ���� �迭cal�� ������ �Է��մϴ�. 
    String s;//�� �����Է��� cal �迭�� s�� �Ҵ��մϴ�.
    JLabel[] labels; 
    JButton button;
    //frame�� label�� button �� �����մϴ�.
    int number1; //10�̸��� ������ �Ҵ��մϴ�.
    int number2; //10�̸��� ������ �Ҵ��մϴ�.
    int num1; // number1�� number2�� ������� num1�� �Ҵ��մϴ�.
    int count=0;//������ ���߱���� �õ��� Ƚ���� ��Ÿ�����ݴϴ�.
    JTextField textfield;//���� �������� ĭ�� ����ϴ�.
    public generateProblem() {
        setSize(500, 300);
        JPanel panel = new JPanel();//�г��� �����մϴ�.
        panel.setLayout(null);//�г��� ���̾ƿ����� null������ �������ν� ũ�� ��ġ�� �����ϵ��� �մϴ�.
        panel.setBackground(Color.orange);//gui����� orange�� ���߽��ϴ�.
        labels = new JLabel[2];//�迭�� ũ�⸦ 2��ŭ �����մϴ�.
        cal = new String[] {"plus","minus","times"};//cal�� +, -, x �� ���� ������ ���ڿ��� �Է��մϴ�.
        
        labels[0] = new JLabel("Welcome to my math class!");
        labels[0].setForeground(Color.BLACK);
        labels[0].setFont(new Font("", Font.ITALIC , 20));
        labels[0].setSize(350, 80);
        labels[0].setLocation(150, 20);
        // ������ �ڵ�� ���б��ǿ� �°��� ȯ���Ѵٴ� ������ ȭ�鿡 ��Ÿ���ϴ�.         
        labels[1]= new JLabel("Click \"New Problem\" button");
        labels[1].setForeground(Color.BLACK);
        labels[1].setFont(new Font("", Font.ITALIC , 20));
        labels[1].setSize(350,80);
        labels[1].setLocation(50, 40);
        //������ �ڵ�� new problem �� ��ư�� ������� ������ ȭ�鿡 ��Ÿ���ϴ�.
        panel.add(labels[0]);
        panel.add(labels[1]);        
        //�гο� ���� �����ݴϴ�.          
        button = new JButton("New Problem");
        button.setSize(250, 50);
        button.setLocation(100, 150);
        panel.add(button);
        button.addActionListener(this);
        JTextField textfield = new JTextField();
        textfield.setText("");
        textfield.setBounds(400,100,80,40);
        panel.add(textfield);
        // ������ �ڵ�� new problem ��ư�� ������ִ� �ڵ��Դϴ�.
        textfield.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		/*���� �޼ҵ�� ������ ���� Ȯ�����ִ� checkAnswer�Դϴ�.
              	 enter �Է½� �߻��ϴ� ��ǵ��� ��Ÿ���ϴ�.
                */
        		String t=textfield.getText();//�ؽ�Ʈ�� �Է��� ���� t�� �Ҵ��մϴ�.
        		int tt = Integer.parseInt(t);//�Է��� ���� integer�� ��������ȯ �մϴ�.
        		count++;//�ѹ��� ������ 1�� ��µǰ� �׷������� ��� count�� ���� ��� �����մϴ�.
        		if(tt==num1) {
        			if(count==1) {
        			labels[1].setText("Very good! It only took you "+count+" try.");
        			}
        			else {
        				labels[1].setText("Very good! It only took you "+count+" tries.");
        			}
        		}
        		else {
        			labels[1].setText("I'sorry, but no. Please try again.");
        		}
        		textfield.setText("");
        		//num1 �� ���ϱ� ���� ���� �ؽ�Ʈ �Է°��� integer�� ����ȯ �Ͽ��� �񱳸� ���� ���� �¾Ҵ��� �����ݴϴ�.
        	}
        });
        add(textfield);
        add(panel);
        setTitle("MyClass");
        setVisible(true); 
            
    }	
   
    public void actionPerformed(ActionEvent event) {
    /*
          ���� �޼ҵ�� ��ư�Է½� �߻��ϴ� ��ǵ��� ��Ÿ���ϴ�.
     s, �� ������ �Է¹��� ���ڿ��� minus,plus,times �� �ϳ��� �������
     num1 �� �Ҵ��� ȭ�鿡 ��Ÿ���ϴ�.      		
     */
    		int i = (int)(Math.random()*3);
        	count = 0;//��ư Ŭ���� count�� �ʱ�ȭ ���ݴϴ�.
    		s=cal[i];
        	number1 = (int)(Math.random()*10);
            number2 = (int)(Math.random()*10);
                //������ number1��number2�� �Ҵ����ݴϴ�.
        	if(s=="minus") {
            	num1 = number1-number2;
            }//-�ϰ�� �� ������ ���ϴ�.
            if(s=="plus") {
            	num1 = number1+number2;
            }//+�ϰ�� �� ������ �����ݴϴ�.
            if(s=="times") {
            	num1 = number1*number2;	
            }//x�ϰ�� �� ������ �����ݴϴ�.
        	
            labels[0].setText("How much is "+number1+" "+ s+" " +number2+"?");            
            labels[1].setText("Please Enter your answer");
    }           
}