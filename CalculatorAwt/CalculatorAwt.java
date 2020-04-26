import java.awt.*;
import java.awt.event.*;
class CalculatorAwt extends Frame implements ActionListener
{
	static Frame f;
	static TextField t;
	static double x;
	static String op;
	
	public static void main(String args[])
	{
		CalculatorAwt c = new CalculatorAwt();
		f = new Frame();        // object of frame
		t = new TextField();    // object of TextFeild
			
		t.setBounds(20,50,260,80);

		Button b1 =new Button("0");
		Button b2 =new Button("1");
		Button b3 =new Button("2");
		Button b4 =new Button("3");
		Button b5 =new Button("4");
		Button b6 =new Button("5");
		Button b7 =new Button("6");
		Button b8 =new Button("7");
		Button b9 =new Button("8");
		Button b10 =new Button("9");
		Button b11 =new Button("+");
		Button b12 =new Button("-");
		Button b13 =new Button("*");
		Button b14 =new Button("/");
		Button b15 =new Button("=");
		Button b16 =new Button(".");
		Button b17 =new Button("%");
		Button b18 =new Button("+/-");
		Button b19 =new Button("CLR");
		Button b20 =new Button("C");
		Button b21 =new Button(" ");

		b1.setBounds(30,150,50,50);
		b2.setBounds(90,150,50,50);
		b3.setBounds(150,150,50,50);
		b4.setBounds(210,150,50,50);

		b5.setBounds(30,210,50,50);
		b6.setBounds(90,210,50,50);
		b7.setBounds(150,210,50,50);
		b8.setBounds(210,210,50,50);

		b9.setBounds(30,270,50,50);
		b10.setBounds(90,270,50,50);
		b11.setBounds(150,270,50,50);
		b12.setBounds(210,270,50,50);

		b13.setBounds(30,330,50,50);
		b14.setBounds(90,330,50,50);
		b15.setBounds(150,330,50,50);
		b16.setBounds(210,330,50,50);

		b17.setBounds(30,390,50,50);
		b18.setBounds(90,390,50,50);
		b19.setBounds(150,390,50,50);
		b20.setBounds(210,390,50,50);

		b1.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);

		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);

		b9.addActionListener(c);
		b10.addActionListener(c);
		b11.addActionListener(c);
		b12.addActionListener(c);

		b13.addActionListener(c);
		b14.addActionListener(c);
		b15.addActionListener(c);
		b16.addActionListener(c);

		b17.addActionListener(c);
		b18.addActionListener(c);
		b19.addActionListener(c);
		b20.addActionListener(c);
		
		f.add(t);               // frame add TextField
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(b18);
		f.add(b19);
		f.add(b20);
		f.add(b21);

		f.setSize(300,500);     // size of frame
                f.setVisible(true);     // for visibility

	}

		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand()=="0")
                        {
				t.setText(t.getText()+"0");
			}
			if(e.getActionCommand()=="1")
                        {
				t.setText(t.getText()+"1");
			}
			if(e.getActionCommand()=="2")
                        {
				t.setText(t.getText()+"2");
			}
			if(e.getActionCommand()=="3")
                        {
				t.setText(t.getText()+"3");
			}
			if(e.getActionCommand()=="4")
                        {
				t.setText(t.getText()+"4");
			}
			if(e.getActionCommand()=="5")
                        {
				t.setText(t.getText()+"5");
			}
			if(e.getActionCommand()=="6")
                        {
				t.setText(t.getText()+"6");
			}
			if(e.getActionCommand()=="7")
                        {
				t.setText(t.getText()+"7");
			}
			if(e.getActionCommand()=="8")
                        {
				t.setText(t.getText()+"8");
			}
			if(e.getActionCommand()=="9")
                        {
				t.setText(t.getText()+"9");
			}
			if(e.getActionCommand()=="+")
                        {
				x = Double.parseDouble(t.getText());
				t.setText("");
				op="+";
			}
			if(e.getActionCommand()=="-")
                        {
				x = Double.parseDouble(t.getText());
				t.setText("");
				op="-";
			}
			if(e.getActionCommand()=="*")
                        {
				x = Double.parseDouble(t.getText());
				t.setText("");
				op="*";
			}
			if(e.getActionCommand()=="/")
                        {
				x = Double.parseDouble(t.getText());
				t.setText("");
				op="/";
			}
			if(e.getActionCommand()=="=")
                        {
				//t.setText(t.getText()+"=");
			}
			if(e.getActionCommand()==".")
                        {
				t.setText(t.getText()+".");
			}
			if(e.getActionCommand()=="%")
                        {
				x = Double.parseDouble(t.getText());
				t.setText("");
				op="%";
			}
			if(e.getActionCommand()=="C")
                        {
				t.setText("");
			}
			if(e.getActionCommand()=="CLR")
                        {
				
				
			}
			if(e.getActionCommand()=="+/-")
                        {
				t.setText(t.getText()+"+/-");
			}
		}
}