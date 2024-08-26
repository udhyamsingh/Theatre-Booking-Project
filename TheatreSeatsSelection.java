import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Theme extends JFrame implements ActionListener
{
	JButton[] b=new JButton[10];
	JButton[] b1=new JButton[60];
	JButton[] b2=new JButton[40];
	int k=0;
	int k1=0;
	int x,y,w,h,x1,y1,x2,y2;
	JButton c1;

	int platinumPrice = 600;
    int goldPrice = 400;
    int silverPrice = 250;
    Theme()
	{
		x=330;
		x1=180;
		x2=5;
		y=150;
		y1=300;
		y2=650;
		w=60;
		h=60;
		setLayout(null);
		Font f=new Font("Times New Roman",Font.BOLD,25);
		JLabel l=new JLabel("Rs:600 Platinum");
		l.setSize(200,100);
		l.setLocation(10,50);
		l.setFont(f);
		add(l);
		
		for (int i=0;i<10;i++)
		{
		
			b[k]=new JButton("P"+(k+1));
			b[k].setSize(w,h);
			b[k].setLocation(x,y);
			add(b[k]);
			k++;
			x=x+70;
			
		}
		JLabel l1=new JLabel("Rs:400 Gold");
		l1.setSize(200,100);
		l1.setLocation(10,220);
		l1.setFont(f);
		add(l1);
		k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<15;j++)
			{
				b1[k]=new JButton("G"+(k+1));
				b1[k].setSize(w,h);
				b1[k].setLocation(x1,y1);
				add(b1[k]);
				k++;
				x1=x1+70;
			}
				x1=180;
				y1=y1+70;
		}
		
		JLabel l2=new JLabel("Rs:250 Silver");
		l2.setSize(200,100);
		l2.setLocation(10,550);
		l2.setFont(f);
		add(l2);
		k=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<20;j++)
			{
				b2[k]=new JButton("P"+(k+1));
				b2[k].setSize(w,h);
				b2[k].setLocation(x2,y2);
				add(b2[k]);
				k++;
				x2=x2+70;

			}
			x2=5;
			y2=y2+70;
		}
		c1=new JButton("BOOK");
		c1.setSize(100,50);
		c1.setLocation(550,820);
        c1.addActionListener(this);
		add(c1);

		JLabel l3=new JLabel("Available");
		l3.setSize(200,100);
		l3.setLocation(240,850);
		l3.setFont(f);
		add(l3);
		JLabel l4=new JLabel("Selected");
		l4.setSize(200,100);
		l4.setLocation(450,850);
		l4.setFont(f);
		add(l4);
		JLabel l5=new JLabel("Occupied");
		l5.setSize(200,100);
		l5.setLocation(660,850);
		l5.setFont(f);
		add(l5);
		JButton c2=new JButton();
		c2.setSize(30,30);
		c2.setLocation(200,880);
		c2.setBackground(Color.WHITE);
		add(c2);
		JButton c3=new JButton();
		c3.setSize(30,30);
		c3.setLocation(410,880);
		c3.setBackground(Color.GREEN);
		add(c3);
		JButton c4=new JButton();
		c4.setSize(30,30);
		c4.setLocation(620,880);
		c4.setBackground(Color.RED);
		add(c4);
		JLabel tx1=new JLabel("Screen This Side Please Look Here");
		tx1.setSize(400,100);
		tx1.setLocation(400,750);
		tx1.setFont(f);
		add(tx1);
        for (int k1=0;k1<10;k1++)
        {
			 b[k1].addActionListener(this);
        }
       
		for (int n=0;n<60;n++)
		{
			b1[n].addActionListener(this);
		}
        for (int m=0;m<40;m++)
		{
			b2[m].addActionListener(this);
		}

		

   

		
	}
	private int getPrice(String f) {
        if (f.startsWith("P")) {
            return platinumPrice;
        } else if (f.startsWith("G")) {
            return goldPrice;
        } else {
            return silverPrice;
        }
    }
	
public void actionPerformed(ActionEvent e)
{
    if(e.getSource() != c1)
    {
        String f = ((JButton)e.getSource()).getText();
        int price = getPrice(f);
        FormField fd = new FormField();
        fd.createFrame();        		  
        System.out.println("Clicked button name: " + f + ", Price: " + price);
        fd.getTicketValues(f,price);
       
       
    }
    else
    {
		PDFCreation pc=new PDFCreation();
		 
        
    }
}
}
class TheatreSeatsSelection
{
	public static void main(String[] args) throws Exception
	{
		Theme t=new Theme();
		t.setVisible(true);
		t.setSize(1430,1000);
		t.setLocation(200,20);
		t.setDefaultCloseOperation(t.EXIT_ON_CLOSE);
	}
}