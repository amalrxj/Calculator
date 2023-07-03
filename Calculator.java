import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;
    String divoldValue,muloldValue,minusoldValue;
    String plusoldValue;
    char operator;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,zeroButton;
    JButton dotButton,equalButton,divButton,mulButton,plusButton,minusButton;
    JButton clearButton,delButton;

    public static void main(String[] args) {
        Calculator Calc=new Calculator();      
    }
    public Calculator(){
        jf=new JFrame("Calculator");
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setSize(423, 620);
        jf.setBackground(Color.gray);
        jf.setLocation(300, 150);


        displayLabel=new JLabel();
        displayLabel.setBounds(27, 30, 356, 60);
        displayLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.white);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.black);
        displayLabel.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 2, Color.black));
        jf.add(displayLabel);

        
        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 32));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(120, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 32));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(210, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 32));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 32));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(120, 220, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 32));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(210, 220, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 32));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 310, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 32));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(120, 310, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 32));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(210, 310, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 32));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 400, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 32));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(120, 400, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 32));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(210, 400, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 32));
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
        divButton=new JButton("/");
        divButton.setBounds(300, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 32));
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton=new JButton("x");
        mulButton.setBounds(300, 220, 80, 80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 32));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        minusButton=new JButton("-");
        minusButton.setBounds(300, 310, 80, 80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 32));
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton=new JButton("+");
        plusButton.setBounds(300, 400, 80, 80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 32));
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton=new JButton("CLR");
        clearButton.setBounds(30, 510, 174, 45);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        delButton=new JButton("DEL");
        delButton.setBounds(207, 510, 174, 45);
        delButton.setFont(new Font("Arial", Font.PLAIN, 30));
        delButton.addActionListener(this);
        jf.add(delButton);
               
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");

            }
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");

            }
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");

            }
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");

            }
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");

            }
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");

            }
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");

            }
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");

            }
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");

            }
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");

            }
        }else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }else if(e.getSource()==equalButton)
        {
            switch(operator)
            {
            case'+':{
                String plusnewValue=displayLabel.getText();
                float plusoldValueF=Float.parseFloat(plusoldValue);
                float plusnewValueF=Float.parseFloat(plusnewValue);
                float plusresult=plusoldValueF +plusnewValueF;
                displayLabel.setText(plusresult+"");
            }
            case'*':
            {
                String mulnewValue=displayLabel.getText();
                float muloldValueF=Float.parseFloat(muloldValue);
                float mulnewValueF=Float.parseFloat(mulnewValue);
                float mulresult=muloldValueF *mulnewValueF;
                displayLabel.setText(mulresult+"");
            }
            case'-':
            {
                String minusnewValue=displayLabel.getText();
                float minusoldValueF=Float.parseFloat(minusoldValue);
                float minusnewValueF=Float.parseFloat(minusnewValue);
                float minusresult=minusoldValueF -minusnewValueF;
                displayLabel.setText(minusresult+"");
            }
            case'/':
            {   
                String divnewValue=displayLabel.getText();
                float divoldValueF=Float.parseFloat(divoldValue);
                float divnewValueF=Float.parseFloat(divnewValue);
                float divresult=divoldValueF /divnewValueF;
                displayLabel.setText(divresult+"");
            }
            }
        divoldValue="";
        muloldValue="";
        plusoldValue="";
        minusoldValue="";
        }else if(e.getSource()==divButton){
            operator='/';
            isOperatorClicked=true;
            divoldValue=displayLabel.getText();    
        }else if(e.getSource()==mulButton){
            operator='*';
            isOperatorClicked=true;
            muloldValue=displayLabel.getText();   
        }else if(e.getSource()==minusButton){
            operator='-';
            isOperatorClicked=true;
            minusoldValue=displayLabel.getText();
        }else if(e.getSource()==plusButton){
            operator='+';
            isOperatorClicked=true;
            plusoldValue=displayLabel.getText();
        }else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }else if(e.getSource()==delButton) {
			String string = displayLabel.getText();
			displayLabel.setText("");
			for(int i=0;i<string.length()-1;i++) {
				displayLabel.setText(displayLabel.getText()+string.charAt(i));
			}
		}
    }
}
