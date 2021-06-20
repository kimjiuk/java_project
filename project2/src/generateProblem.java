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
 본 클래스는 수학문제를 만들고 문제에 대한 답을 확인하는 gui 프로그램입니다.
 */
public class generateProblem extends JFrame implements ActionListener{
    String[] cal;//랜덤 문제를 제공하기 위해 배열cal에 난수를 입력합니다. 
    String s;//위 난수입력한 cal 배열을 s에 할당합니다.
    JLabel[] labels; 
    JButton button;
    //frame의 label과 button 을 정의합니다.
    int number1; //10미만의 난수를 할당합니다.
    int number2; //10미만의 난수를 할당합니다.
    int num1; // number1과 number2의 계산결과를 num1에 할당합니다.
    int count=0;//문제를 맞추기까지 시도한 횟수를 나타내어줍니다.
    JTextField textfield;//답을 적기위한 칸을 만듭니다.
    public generateProblem() {
        setSize(500, 300);
        JPanel panel = new JPanel();//패널을 생성합니다.
        panel.setLayout(null);//패널의 레이아웃값을 null값으로 해줌으로써 크기 배치가 가능하도록 합니다.
        panel.setBackground(Color.orange);//gui배경을 orange로 정했습니다.
        labels = new JLabel[2];//배열의 크기를 2만큼 정의합니다.
        cal = new String[] {"plus","minus","times"};//cal에 +, -, x 와 같은 연산을 문자열로 입력합니다.
        
        labels[0] = new JLabel("Welcome to my math class!");
        labels[0].setForeground(Color.BLACK);
        labels[0].setFont(new Font("", Font.ITALIC , 20));
        labels[0].setSize(350, 80);
        labels[0].setLocation(150, 20);
        // 다음의 코드는 수학교실에 온것을 환영한다는 문구를 화면에 나타냅니다.         
        labels[1]= new JLabel("Click \"New Problem\" button");
        labels[1].setForeground(Color.BLACK);
        labels[1].setFont(new Font("", Font.ITALIC , 20));
        labels[1].setSize(350,80);
        labels[1].setLocation(50, 40);
        //다음의 코드는 new problem 의 버튼을 눌르라는 문구를 화면에 나타냅니다.
        panel.add(labels[0]);
        panel.add(labels[1]);        
        //패널에 라벨을 더해줍니다.          
        button = new JButton("New Problem");
        button.setSize(250, 50);
        button.setLocation(100, 150);
        panel.add(button);
        button.addActionListener(this);
        JTextField textfield = new JTextField();
        textfield.setText("");
        textfield.setBounds(400,100,80,40);
        panel.add(textfield);
        // 다음의 코드는 new problem 버튼을 만들어주는 코드입니다.
        textfield.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		/*다음 메소드는 문제의 답을 확인해주는 checkAnswer입니다.
              	 enter 입력시 발생하는 사건들을 나타냅니다.
                */
        		String t=textfield.getText();//텍스트에 입력한 값을 t에 할당합니다.
        		int tt = Integer.parseInt(t);//입력한 값을 integer로 강제형변환 합니다.
        		count++;//한번에 맞출경우 1이 출력되고 그렇지않은 경우 count의 수는 계속 증가합니다.
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
        		//num1 과 비교하기 위해 위의 텍스트 입력값을 integer로 형변환 하였고 비교를 통해 답이 맞았는지 보여줍니다.
        	}
        });
        add(textfield);
        add(panel);
        setTitle("MyClass");
        setVisible(true); 
            
    }	
   
    public void actionPerformed(ActionEvent event) {
    /*
          다음 메소드는 버튼입력시 발생하는 사건들을 나타냅니다.
     s, 즉 난수로 입력받은 문자열이 minus,plus,times 중 하나와 같을경우
     num1 에 할당해 화면에 나타납니다.      		
     */
    		int i = (int)(Math.random()*3);
        	count = 0;//버튼 클릭시 count를 초기화 해줍니다.
    		s=cal[i];
        	number1 = (int)(Math.random()*10);
            number2 = (int)(Math.random()*10);
                //난수를 number1과number2에 할당해줍니다.
        	if(s=="minus") {
            	num1 = number1-number2;
            }//-일경우 두 난수를 뺍니다.
            if(s=="plus") {
            	num1 = number1+number2;
            }//+일경우 두 난수를 더해줍니다.
            if(s=="times") {
            	num1 = number1*number2;	
            }//x일경우 두 난수를 곱해줍니다.
        	
            labels[0].setText("How much is "+number1+" "+ s+" " +number2+"?");            
            labels[1].setText("Please Enter your answer");
    }           
}