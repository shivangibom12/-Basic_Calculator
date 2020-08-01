import javax.swing.*;
import java.awt.event.*;
class Notepad extends JFrame implements ActionListener,MouseListener
{
	JFrame frame;                                                  //refrence of a frame
	JTextArea textarea;                                            //refrence of a textarea
	int mouseX = 0,mouseY = 0;
	
	Notepad()
	{
		frame = new JFrame("Notepad");                          //create a object of a frame
		textarea = new JTextArea();                             //create a object of a textarea
		frame.add(textarea);                                    // add textarea in frame

		JMenuBar menubar = new JMenuBar();                      //create a object of a menubar
		frame.setJMenuBar(menubar);                             //menubar set in frame
		//frame.add(menubar);  
		
		// create object of a menus

		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu format = new JMenu("Format");
		JMenu view = new JMenu("View");
		JMenu help = new JMenu("Help");

		// add menus in menubar
		

		menubar.add(file);
		menubar.add(edit);
		menubar.add(format);
		menubar.add(view);
		menubar.add(help);
		
		// create object of a menusitems
		
		JMenuItem newfile = new JMenuItem("New                      Ctrl+N");      //for file
		JMenuItem open = new JMenuItem("Open                     Ctrl+O");
		JMenuItem save = new JMenuItem("Save                     Ctrl+S");
		JMenuItem save_as = new JMenuItem("Save As...");
		JMenuItem page_setup = new JMenuItem("Page Setup...");
		JMenuItem print = new JMenuItem("Print...                  Ctrl+P");
		JMenuItem exit = new JMenuItem("Exit");

		// add menuitems in menus

		file.add(newfile);
		file.add(open);
		file.add(save);
		file.add(save_as);
		file.add(page_setup);
		file.add(print);		
		file.add(exit);

											   //ActionListener (file)											
		
		newfile.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		save_as.addActionListener(this);
		page_setup.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);

											  //MouseListener  (file)

		newfile.addMouseListener(this);
		open.addMouseListener(this);
		save.addMouseListener(this);
		save_as.addMouseListener(this);
		page_setup.addMouseListener(this);
		print.addMouseListener(this);
		exit.addMouseListener(this);

		JMenuItem undo = new JMenuItem("Undo                Ctrl+Z");                //for edit
		JMenuItem cut = new JMenuItem("Cut                   Ctrl+X");
		JMenuItem copy = new JMenuItem("Copy                Ctrl+C");
		JMenuItem paste = new JMenuItem("Paste              Ctrl+V");
		JMenuItem delet = new JMenuItem("Delet                     Del");
		JMenuItem find = new JMenuItem("Find                  Ctrl+F");
		JMenuItem find_next = new JMenuItem("Find Next              F3"); 
		JMenuItem replace = new JMenuItem("Replace...       Ctrl+H");
		JMenuItem go_to = new JMenuItem("Go To...            Ctrl+G");
		JMenuItem select_all = new JMenuItem("Select All        Ctrl+A");
		JMenuItem time_date = new JMenuItem("Time/Date             F5"); 

		edit.add(undo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delet);
		edit.add(find);
		edit.add(find_next);
		edit.add(replace);
		edit.add(go_to);
		edit.add(select_all);
		edit.add(time_date);


		undo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		delet.addActionListener(this);
		find.addActionListener(this);
		find_next.addActionListener(this);
		replace.addActionListener(this);
		go_to.addActionListener(this);
		select_all.addActionListener(this);
		time_date.addActionListener(this);

		
                undo.addMouseListener(this);
		cut.addMouseListener(this);
		copy.addMouseListener(this);
		paste.addMouseListener(this);
		delet.addMouseListener(this);
		find.addMouseListener(this);
		find_next.addMouseListener(this);
		replace.addMouseListener(this);
		go_to.addMouseListener(this);
		select_all.addMouseListener(this);
		time_date.addMouseListener(this);

		JCheckBox word_wrap = new JCheckBox("Word Warp");                          //for format
		JMenuItem font = new JMenuItem("__Font..."); 

		format.add(word_wrap);
		format.add(font);

		word_wrap.addActionListener(this);
		font.addActionListener(this);

		word_wrap.addMouseListener(this);
		font.addMouseListener(this);


		JCheckBox status_bar = new JCheckBox("Status Bar");                          //for View
		
		view.add(status_bar);
											  

		word_wrap.addActionListener(this);                                       

		word_wrap.addMouseListener(this);                                      


		                        
		JMenuItem view_help = new JMenuItem("View Help");                          //for help

		help.add(view_help);
		
               	view_help.addActionListener(this);

		view_help.addMouseListener(this);
		
	

		frame.setVisible(true);           //visibility
		frame.setSize(700,500);           //size of a frame
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals ("cut"))
		{
			textarea.cut();
		}
		else if(s.equals ("copy"))
		{
			textarea.copy();
		}	
		else if(s.equals ("paste"))
		{
			textarea.paste();
		}	
		else if(s.equals ("print"))
		{
			try
			{
				textarea.print();
			}
			catch(Exception evt)
			{
				JOptionPane.showMessageDialog(frame, evt.getMessage());
			}
		}	
	}

	public void mouseExited(MouseEvent m)
	{
		String s ;
	}

	public void mouseEntered(MouseEvent m)
	{
		String s ;
	}

	public void mouseReleased(MouseEvent m)
	{
		String s ;
	}

	public void  mousePressed(MouseEvent m)
	{
		mouseX = m.getX() ;
		mouseY = m.getX() ;
	}

	public void  mouseClicked(MouseEvent m)
	{
		String s ;
	}

	public static void main(String args[])
	{
		Notepad notepad = new Notepad();
	}
}