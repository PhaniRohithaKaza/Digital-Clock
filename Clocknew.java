
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.lang.*;
class DigitalClock extends Frame implements Runnable
{
	int h,m,s,x,y,p;
Calendar c1;
	DigitalClock(){
		
		
	addWindowListener(new WindowAdapter()
    {
   public void windowClosing(WindowEvent e)
   {
 	  System.exit(0);
   }
    });

	}
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(320, 100, 10, 10);
		g.fillOval(620,100,10,10);
		g.fillOval(320, 190, 10, 10);
		g.fillOval(620, 190, 10, 10);
		c1=Calendar.getInstance();	
	    h=c1.get(Calendar.HOUR);
	    if(h==0)
	    	h=12;
	    m=c1.get(Calendar.MINUTE);
	    s=c1.get(Calendar.SECOND);
	    for(int i=0;i<6;i++)
	    {
	    	g.setColor(Color.red);
	    	if(i==0) {
	    		p=h/10;
	    		
	    		x=100;
	    				y=100;
	    		}
	    	else if(i==1) {
	    		p=h%10;
	    		x=200;
	    		y=100;}
	    	else if(i==2) {
	    		p=m/10;
	    		x=400;
	    				y=100;
	    		}
	    	else if(i==3) {
	    		p=m%10;
	    		x=500;
	    		y=100;}
	    	
	    	else if(i==4) {
	    		p=s/10;
	    		x=700;
	    				y=100;
	    		}
	    	else if(i==5) {
	    		p=s%10;
	    		x=800;
	    		y=100;}
	    	
	    	if(p==0)
	        {   
	        	g.drawLine(x, y, x+50, y);
	            g.drawLine(x,y,x,y+50);
	            g.drawLine(x+50, y, x+50, y+50);
	            g.drawLine(x, y+50, x, y+100);
	            g.drawLine(x+50, y+50, x+50, y+100);
	            g.drawLine(x, y+100, x+50, y+100);
	        
	        	
	        }
	        if(p==1)
	        {
	        	g.drawLine(x+50,y,x+50,y+50);
	        	g.drawLine(x+50,y+50,x+50,y+100);
	        }
	        if(p==2)
	        {
	        	g.drawLine(x,y,x+50,y);
	        	g.drawLine(x+50,y,x+50,y+50);
	        	g.drawLine(x, y+50, x+50, y+50);
	        	g.drawLine(x,y+50,x,y+100);
	        	g.drawLine(x, y+100, x+50, y+100);
	        }
	        if(p==3)
	        {
	        	g.drawLine(x,y,x+50,y);
	        	g.drawLine(x+50,y,x+50,y+50);
	        	g.drawLine(x, y+50, x+50, y+50);
	            g.drawLine(x+50, y+50, x+50, y+100);
	        	g.drawLine(x, y+100, x+50, y+100);
	        }
	        
	        if(p==4)
	        {
	        	g.drawLine(x,y,x,y+50);
	        	g.drawLine(x, y+50, x+50,y+50);
	        	g.drawLine(x+50, y, x+50, y+50);
	        	g.drawLine(x+50, y+50, x+50, y+100);
	        	
	        }
	        if(p==5)
	        {
	        	g.drawLine(x, y, x+50, y);
	            g.drawLine(x,y,x,y+50);
	            g.drawLine(x, y+50, x+50, y+50);
	            g.drawLine(x+50, y+50, x+50, y+100);
	            g.drawLine(x, y+100, x+50, y+100);
	        }
	        if(p==6)
	        {
	        	g.drawLine(x, y, x+50, y);
	            g.drawLine(x,y,x,y+50);
	            g.drawLine(x, y+50, x+50, y+50);
	            g.drawLine(x, y+50, x, y+100);
	            g.drawLine(x+50, y+50, x+50, y+100);
	            g.drawLine(x, y+100, x+50, y+100);
	        
	        }
	        if(p==7)
	        {
	        	g.drawLine(x, y, x+50, y);
	        	g.drawLine(x+50,y,x+50,y+50);
	        	g.drawLine(x+50,y+50,x+50,y+100);
	        	
	        }
	        if(p==8)
	        {
	        	g.drawLine(x, y, x+50, y);
	            g.drawLine(x,y,x,y+50);
	            g.drawLine(x+50, y, x+50, y+50);
	            g.drawLine(x, y+50, x+50, y+50);
	            g.drawLine(x, y+50, x, y+100);
	            g.drawLine(x+50, y+50, x+50, y+100);
	            g.drawLine(x, y+100, x+50, y+100);
	        
	        }
	        if(p==9)
	        {
	            g.drawLine(x, y, x+50, y);
	            g.drawLine(x,y,x,y+50);
	            g.drawLine(x+50, y, x+50, y+50);
	            g.drawLine(x, y+50, x+50, y+50);
	            g.drawLine(x+50, y+50, x+50, y+100);
	            g.drawLine(x, y+100, x+50, y+100);
	        }
	    	
	    } 	

	}
	
		public void run() {
			
			

	for(;;) {
		repaint();
			
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
			
			
	}
		
	}}
class Clocknew{
	public static void main(String args[])throws InterruptedException
	{
		DigitalClock c=new DigitalClock();
		
		c.setSize(1000,1000);
		c.setTitle("DIGITAL CLOCK");
		c.setVisible(true);
                Thread t=new Thread(c);
                
                t.start();
                
                
		
	}
	
	
}

