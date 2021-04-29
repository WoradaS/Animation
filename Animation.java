import java.awt.*;
import javax.swing.*;
import java.awt.Color;
class Assignment3_61050956 extends JPanel implements Runnable {
    public static void main(String[] args) {
        Assignment3_61050956 m = new Assignment3_61050956();
        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("animation_956");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        (new Thread(m)).start();
    }
    double Move = 0;
    double Rotate = 0;
    double Move1 = 0;
	double Move2 = 0;
	double speedx = 150.0;
	double speedy1 = 140.0;
	double speedy2 = 100.0;
    double speedy = 0.0;
	
    public void run()
    {
       double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        double startTime = System.currentTimeMillis();
        while (true){
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            repaint();
            lastTime = currentTime;

			if(Move<1275) {
					//if(Move2<0||Move2>10){  speedy2 = -speedy2;  }
		           
					  if(Move1<0||Move1>200) { speedy1 = -speedy1; }
				   
					
			
			}
			else speedx=0;
            Move += speedx * elapsedTime / 1000.0;
            Move1 += speedy1 * elapsedTime / 1000.0;
			Move2 += speedy2 * elapsedTime / 1000.0;
            Rotate += 0.5 * elapsedTime / 1000.0;
			
            try{Thread.sleep(1000/60);}
            catch (InterruptedException e){System.err.println(e);}
            repaint();
        }
    }

	 

	 public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g;
        
		g.setColor(Color.decode("#98F5FF"));
        g2.fillRect(0,0,600,600);
            
            g2.translate(-Move,0);
            piep(g2);			
			tree(g2);
			Cloud(g2);
			floor(g2);
			Fire(g2);
			//{g2.translate(0,-Move2);
			//Firebg(g2);}
		   {g2.translate(Move,-Move1);
			mario(g2);}
		 
			
            
			
	 }
	 public void tree (Graphics2D g)
    {      g.setColor(Color.decode("#228B22"));//ต้นไม้
	       for(int i =336;i<=450;i++)plot(g,250,i,7);//ลำต้น

	       plot(g,257,343,7);plot(g,264,336,7);//ขวา1
           plot(g,271,336,7);plot(g,278,336,7);
		   plot(g,285,343,7);plot(g,292,350,7);plot(g,292,357,7);

		   plot(g,257,336,7);plot(g,257,329,7);
		   plot(g,264,322,7);plot(g,271,322,7);
		   plot(g,278,322,7);plot(g,285,322,7);plot(g,292,322,7);
		   plot(g,299,329,7);plot(g,306,336,7);
           plot(g,306,343,7);

		   for(int i =329;i<=350;i++)plot(g,243,i,7);//ซ้าย
           for(int i =215;i<=236;i++)plot(g,i,322,7);
           plot(g,208,329,7);
		   for(int i =336;i<=350;i++)plot(g,201,i,7);
           plot(g,236,336,7);plot(g,229,343,7);plot(g,229,336,7);
           plot(g,222,349,7);plot(g,215,356,7);
		   plot(g,215,363,7);

            //สุดท้าย
		   g.setColor(Color.decode("#3CB371"));//ต้นไม้  +1500
	       for(int i =336;i<=450;i++)plot(g,1750,i,7);//ลำต้น
		   plot(g,1757,343,7);plot(g,1764,336,7);//ขวา1
           plot(g,1771,336,7);plot(g,1778,336,7);
		   plot(g,1785,343,7);plot(g,1792,350,7);plot(g,1792,357,7);

		   plot(g,1757,336,7);plot(g,1757,329,7);
		   plot(g,1764,322,7);plot(g,1771,322,7);
		   plot(g,1778,322,7);plot(g,1785,322,7);plot(g,1792,322,7);
		   plot(g,1799,329,7);plot(g,1706,336,7);
           plot(g,1706,343,7);

		   for(int i =329;i<=350;i++)plot(g,1743,i,7);//ซ้าย
           for(int i =1715;i<=1736;i++)plot(g,i,322,7);
           plot(g,1708,329,7);
		   for(int i =336;i<=350;i++)plot(g,1701,i,7);
           plot(g,1736,336,7);plot(g,1729,343,7);plot(g,1729,336,7);
           plot(g,1722,349,7);plot(g,1715,356,7);
		   plot(g,1715,363,7);
             //2สูง
			 g.setColor(Color.decode("#006400"));//
          for(int i =301;i<=450;i++)plot(g,1550,i,7);//ลำต้น
		   plot(g,1557,308,7);plot(g,1564,301,7);//ขวา1
           plot(g,1571,301,7);plot(g,1578,301,7);
		   plot(g,1585,308,7);plot(g,1592,315,7);plot(g,1592,322,7);

		   plot(g,1557,301,7);plot(g,1557,294,7);
		   plot(g,1564,287,7);plot(g,1571,287,7);
		   plot(g,1578,287,7);plot(g,1585,287,7);plot(g,1592,287,7);
		   plot(g,1599,294,7);plot(g,1606,301,7);
           plot(g,1606,308,7);

		   for(int i =287;i<=315;i++)plot(g,1543,i,7);//ซ้าย
           for(int i =1515;i<=1536;i++)plot(g,i,287,7);
           plot(g,1508,294,7);
		   for(int i =301;i<=315;i++)plot(g,1501,i,7);
           plot(g,1536,301,7);plot(g,1529,308,7);plot(g,1529,301,7);
           plot(g,1522,314,7);plot(g,1515,321,7);
		   plot(g,1515,328,7);
		   //3สูง
		   g.setColor(Color.decode("#006400"));//
		   for(int i =301;i<=450;i++)plot(g,1050,i,7);
		   plot(g,1057,308,7);plot(g,1064,301,7);//ขวา1
           plot(g,1071,301,7);plot(g,1078,301,7);
		   plot(g,1085,308,7);plot(g,1092,315,7);plot(g,1092,322,7);

		   plot(g,1057,301,7);plot(g,1057,294,7);
		   plot(g,1064,287,7);plot(g,1071,287,7);
		   plot(g,1078,287,7);plot(g,1085,287,7);plot(g,1092,287,7);
		   plot(g,1099,294,7);plot(g,1106,301,7);
           plot(g,1106,308,7);

		   for(int i =287;i<=315;i++)plot(g,1043,i,7);//ซ้าย
           for(int i =1015;i<=1036;i++)plot(g,i,287,7);
           plot(g,1008,294,7);
		   for(int i =301;i<=315;i++)plot(g,1001,i,7);
           plot(g,1036,301,7);plot(g,1029,308,7);plot(g,1029,301,7);
           plot(g,1022,314,7);plot(g,1015,321,7);
		   plot(g,1015,328,7);

		   //ต้นเล็ก2
		   g.setColor(Color.decode("#3CB371"));
		   for(int i =336;i<=450;i++)plot(g,950,i,7);//ลำต้น
           plot(g,957,343,7);plot(g,964,336,7);//ขวา1
           plot(g,971,336,7);plot(g,978,336,7);
		   plot(g,985,343,7);plot(g,992,350,7);plot(g,992,357,7);

		   plot(g,957,336,7);plot(g,957,329,7);
		   plot(g,964,322,7);plot(g,971,322,7);
		   plot(g,978,322,7);plot(g,985,322,7);plot(g,992,322,7);
		   plot(g,999,329,7);plot(g,1006,336,7);
           plot(g,1006,343,7);

		   for(int i =329;i<=350;i++)plot(g,943,i,7);//ซ้าย
           for(int i =915;i<=936;i++)plot(g,i,322,7);
           plot(g,908,329,7);
		   for(int i =336;i<=350;i++)plot(g,901,i,7);
           plot(g,936,336,7);plot(g,929,343,7);plot(g,929,336,7);
           plot(g,922,349,7);plot(g,915,356,7);
		   plot(g,915,363,7);
	       

	}
	  public void floor (Graphics2D g)
    {     
         //เส้นพื้น
         g.setColor(Color.decode("#9bbb0e"));  //1-1
		 for(int i =0;i<=520;i++)plot(g,i,450,7);
         for(int i =0;i<=520;i++)plot(g,i,457,7);
		            for(int i =635;i<=1300;i++)plot(g,i,450,7);    //2-1
					for(int i =635;i<=1300;i++)plot(g,i,457,7);
					            for(int i =1415;i<=2000;i++)plot(g,i,450,7);   //3-1
								for(int i =1415;i<=2000;i++)plot(g,i,457,7);

         g.setColor(Color.decode("#30622d"));  //1-2
         for(int i =0;i<=520;i++)plot(g,i,460,7);
         for(int i =0;i<=520;i++)plot(g,i,467,7);
		 for(int i =0;i<=520;i++)plot(g,i,474,7);
		             for(int i =635;i<=1300;i++)plot(g,i,460,7);    //2-2
					 for(int i =635;i<=1300;i++)plot(g,i,467,7);
					 for(int i =635;i<=1300;i++)plot(g,i,474,7);
					             for(int i =1415;i<=2000;i++)plot(g,i,460,7);   //3-2
								 for(int i =1415;i<=2000;i++)plot(g,i,467,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,474,7);

          g.setColor(Color.decode("#CD853F"));  //1-3
		 for(int i =0;i<=520;i++)plot(g,i,481,7);
		 for(int i =0;i<=520;i++)plot(g,i,488,7);
		 for(int i =0;i<=520;i++)plot(g,i,495,7);
		 for(int i =0;i<=520;i++)plot(g,i,502,7);
		 for(int i =0;i<=520;i++)plot(g,i,509,7);
		            for(int i =635;i<=1300;i++)plot(g,i,481,7);  //2-3
					for(int i =635;i<=1300;i++)plot(g,i,488,7);
					for(int i =635;i<=1300;i++)plot(g,i,495,7);
					for(int i =635;i<=1300;i++)plot(g,i,502,7);
					for(int i =635;i<=1300;i++)plot(g,i,509,7);
					             for(int i =1415;i<=2000;i++)plot(g,i,481,7);  //3-3
								 for(int i =1415;i<=2000;i++)plot(g,i,488,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,495,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,502,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,509,7);

          g.setColor(Color.decode("#A0522D"));  //1-4
		 for(int i =0;i<=520;i++)plot(g,i,516,7);
		 for(int i =0;i<=520;i++)plot(g,i,523,7);
		 for(int i =0;i<=520;i++)plot(g,i,530,7);
		 for(int i =0;i<=520;i++)plot(g,i,537,7);
		            for(int i =635;i<=1300;i++)plot(g,i,516,7); //2-4
					for(int i =635;i<=1300;i++)plot(g,i,523,7);
					for(int i =635;i<=1300;i++)plot(g,i,530,7);
					for(int i =635;i<=1300;i++)plot(g,i,537,7);
					             for(int i =1415;i<=2000;i++)plot(g,i,516,7);  //3-4
								 for(int i =1415;i<=2000;i++)plot(g,i,523,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,530,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,537,7);

		 g.setColor(Color.decode("#8B4513"));  //1-5
		 for(int i =0;i<=520;i++)plot(g,i,544,7);
		 for(int i =0;i<=520;i++)plot(g,i,551,7);
		 for(int i =0;i<=520;i++)plot(g,i,558,7);
                    for(int i =635;i<=1300;i++)plot(g,i,544,7);  //2-5
					for(int i =635;i<=1300;i++)plot(g,i,551,7);
					for(int i =635;i<=1300;i++)plot(g,i,558,7);
					             for(int i =1415;i<=2000;i++)plot(g,i,544,7); //3-5
								 for(int i =1415;i<=2000;i++)plot(g,i,551,7);
								 for(int i =1415;i<=2000;i++)plot(g,i,558,7);
		           
		 //1
		 plot(g,0,481,7);plot(g,70,481,7);plot(g,140,481,7);
		 plot(g,210,481,7);plot(g,280,481,7);
		 plot(g,350,481,7);plot(g,420,481,7);plot(g,490,481,7);
		 //2
		 plot(g,35,488,7);plot(g,105,488,7);plot(g,175,488,7);
		 plot(g,245,488,7);plot(g,315,488,7);plot(g,385,488,7);
		 plot(g,455,488,7);
         //3
		 plot(g,20,495,7);plot(g,50,495,7);plot(g,90,495,7);
		 plot(g,120,495,7);plot(g,160,495,7);plot(g,190,495,7);
		 plot(g,260,495,7);plot(g,300,495,7);plot(g,330,495,7);
         plot(g,370,495,7);plot(g,400,495,7);plot(g,440,495,7);
		 plot(g,470,495,7);plot(g,510,495,7);
		            //1
		            plot(g,635,481,7);plot(g,705,481,7);plot(g,775,481,7);
		            plot(g,845,481,7);plot(g,915,481,7);
		            plot(g,985,481,7);plot(g,1055,481,7);plot(g,1125,481,7);
					plot(g,1195,481,7);plot(g,1265,481,7);
		            //2
		            plot(g,670,488,7);plot(g,740,488,7);plot(g,810,488,7);
		            plot(g,880,488,7);plot(g,950,488,7);plot(g,1020,488,7);
		            plot(g,1090,488,7);plot(g,1160,488,7);plot(g,1230,488,7);
					plot(g,1300,488,7);
                    //3
		            plot(g,655,495,7);plot(g,685,495,7);plot(g,725,495,7);
		            plot(g,755,495,7);plot(g,795,495,7);plot(g,825,495,7);
		            plot(g,865,495,7);plot(g,895,495,7);plot(g,935,495,7);
                    plot(g,965,495,7);plot(g,1005,495,7);plot(g,1035,495,7);
		            plot(g,1075,495,7);plot(g,1110,495,7);plot(g,1140,495,7);
					plot(g,1180,495,7);plot(g,1210,495,7);plot(g,1250,495,7);
					plot(g,1280,495,7);
					              //1
		                         plot(g,1415,481,7);plot(g,1485,481,7);plot(g,1555,481,7);
		                         plot(g,845,481,7);plot(g,915,481,7);
		                         plot(g,1625,481,7);
								 plot(g,1695,481,7);plot(g,1765,481,7);plot(g,1835,481,7);
		                          //2
		                         plot(g,1450,488,7);plot(g,1520,488,7);plot(g,1590,488,7);
		                         plot(g,1660,488,7);plot(g,1730,488,7);plot(g,1800,488,7);
                                  //3
		                         plot(g,1435,495,7);
								 plot(g,1465,495,7);plot(g,1505,495,7);  //1485
								 plot(g,1535,495,7);plot(g,1575,495,7);  //1555

								 plot(g,1605,495,7);plot(g,1645,495,7);  //1625
								 plot(g,1675,495,7);plot(g,1715,495,7);  //1695
								 plot(g,1785,495,7);plot(g,1745,495,7);  //1765
								 plot(g,1815,495,7);plot(g,1855,495,7);  //1835



	}
	    public void Firebg (Graphics2D g)
    {      //bgfire
           g.setColor(Color.WHITE);
		  
		   for(int i =525;i<=625;i++)plot(g,i,560,10);
		   for(int i =525;i<625;i++)plot(g,i,550,10);
		   for(int i =525;i<=625;i++)plot(g,i,540,10);
		   plot(g,525,530,10);plot(g,525,520,10);
		   plot(g,535,510,10);plot(g,535,520,10);
           for(int i =490;i<=530;i++)plot(g,545,i,10);
	       for(int i =460;i<=490;i++)plot(g,565,i,10);
		   plot(g,555,480,10);
		   plot(g,575,490,10);plot(g,575,480,10);plot(g,575,470,10);
		   plot(g,585,450,10);plot(g,585,440,10);
		   for(int i =470;i<=500;i++)plot(g,595,i,10);
           plot(g,605,490,10);
		   plot(g,615,520,10);plot(g,615,510,10);
		   plot(g,625,530,10);
		   g.setColor(Color.decode("#FF8C00"));//ส้ม

		   for(int i =535;i<=615;i++)plot(g,i,560,10);
		   for(int i =535;i<=615;i++)plot(g,i,550,10);
		   for(int i =535;i<=615;i++)plot(g,i,540,10);
		   for(int i =555;i<=615;i++)plot(g,i,530,10);plot(g,535,530,10);
		   for(int i =555;i<=605;i++)plot(g,i,520,10);
		   for(int i =555;i<=605;i++)plot(g,i,510,10);
           for(int i =555;i<=585;i++)plot(g,i,500,10);plot(g,605,500,10);
		   for(int i =575;i<=585;i++)plot(g,i,490,10);plot(g,555,490,10);
		   plot(g,585,480,10);plot(g,585,470,10);plot(g,585,460,10);

           plot(g,545,560,10);plot(g,605,560,10);
		   plot(g,545,550,10);plot(g,605,550,10);
		   plot(g,555,540,10);plot(g,595,540,10);
		   plot(g,565,530,10);
		   plot(g,575,510,10);

		   g.setColor(Color.decode("#FFD700"));//เหลือง
		   for(int i =555;i<=595;i++)plot(g,i,560,10);
		   for(int i =555;i<=595;i++)plot(g,i,550,10);
		   for(int i =565;i<=585;i++)plot(g,i,540,10);
		   for(int i =565;i<=585;i++)plot(g,i,530,10);
		   plot(g,575,520,10);
	}
	   public void Fire (Graphics2D g)
    {      
		   //1
		   g.setColor(Color.RED);
		   for(int i =535;i<=615;i++)plot(g,i,560,10);
		   for(int i =535;i<=615;i++)plot(g,i,550,10);
		   for(int i =535;i<=615;i++)plot(g,i,540,10);
		   for(int i =555;i<=615;i++)plot(g,i,530,10);plot(g,535,530,10);
		   for(int i =555;i<=605;i++)plot(g,i,520,10);
		   for(int i =555;i<=605;i++)plot(g,i,510,10);
           for(int i =555;i<=585;i++)plot(g,i,500,10);plot(g,605,500,10);
		   for(int i =575;i<=585;i++)plot(g,i,490,10);plot(g,555,490,10);
		   plot(g,585,480,10);plot(g,585,470,10);plot(g,585,460,10);
		   
		   g.setColor(Color.decode("#FF8C00"));//ส้ม
           plot(g,545,560,10);plot(g,605,560,10);
		   plot(g,545,550,10);plot(g,605,550,10);
		   plot(g,555,540,10);plot(g,595,540,10);
		   plot(g,565,530,10);
		   plot(g,575,510,10);

		   g.setColor(Color.decode("#FFD700"));//เหลือง
		   for(int i =555;i<=595;i++)plot(g,i,560,10);
		   for(int i =555;i<=595;i++)plot(g,i,550,10);
		   for(int i =565;i<=585;i++)plot(g,i,540,10);
		   for(int i =565;i<=585;i++)plot(g,i,530,10);
		   plot(g,575,520,10);
		   //2
		   g.setColor(Color.RED);
		   for(int i =1315;i<=1395;i++)plot(g,i,560,10);
		   for(int i =1315;i<=1395;i++)plot(g,i,550,10);
		   for(int i =1315;i<=1395;i++)plot(g,i,540,10);
		   for(int i =1335;i<=1395;i++)plot(g,i,530,10);plot(g,1315,530,10);
		   for(int i =1335;i<=1385;i++)plot(g,i,520,10);
		   for(int i =1335;i<=1385;i++)plot(g,i,510,10);
           for(int i =1335;i<=1365;i++)plot(g,i,500,10);plot(g,1385,500,10);
		   for(int i =1355;i<=1365;i++)plot(g,i,490,10);plot(g,1335,490,10);
		   plot(g,1365,480,10);plot(g,1365,470,10);plot(g,1365,460,10);
		   
		   
		   g.setColor(Color.decode("#FF8C00"));//ส้ม
           plot(g,1325,560,10);plot(g,1385,560,10);
		   plot(g,1325,550,10);plot(g,1385,550,10);
		   plot(g,1335,540,10);plot(g,1375,540,10);
		   plot(g,1345,530,10);
		   plot(g,1355,510,10);

		   g.setColor(Color.decode("#FFD700"));//เหลือง
		   for(int i =1335;i<=1375;i++)plot(g,i,560,10);
		   for(int i =1335;i<=1375;i++)plot(g,i,550,10);
		   for(int i =1345;i<=1365;i++)plot(g,i,540,10);
		   for(int i =1345;i<=1365;i++)plot(g,i,530,10);
		   plot(g,1355,520,10);

		   //F
		    g.setColor(Color.BLACK);
			 plot(g,575,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,575,543,3);
			 g.setColor(Color.BLACK);
			 plot(g,575,546,3);
			 g.setColor(Color.BLACK);
			 plot(g,575,549,3); 

			 g.setColor(Color.BLACK);
			 plot(g,578,546,3);
			 g.setColor(Color.BLACK);
			 plot(g,581,546,3);
			 
			 g.setColor(Color.BLACK);
			 plot(g,578,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,581,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,583,540,3);

			  //F2
		     g.setColor(Color.BLACK);
			 plot(g,1355,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,1355,543,3);
			 g.setColor(Color.BLACK);
			 plot(g,1355,546,3);
			 g.setColor(Color.BLACK);
			 plot(g,1355,549,3); 

			 g.setColor(Color.BLACK);
			 plot(g,1358,546,3);
			 g.setColor(Color.BLACK);
			 plot(g,1361,546,3);
			 
			 g.setColor(Color.BLACK);
			 plot(g,1358,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,1361,540,3);
			 g.setColor(Color.BLACK);
			 plot(g,1363,540,3);
	}

	  public void piep (Graphics2D g)

    {    //ท่อ 1
          g.setColor(Color.decode("#9bbb0e"));
         for(int i =400;i<=500;i++)plot(g,i,443,7);
         for(int i =400;i<=500;i++)plot(g,i,436,7);
         for(int i =400;i<=500;i++)plot(g,i,429,7);
         for(int i =400;i<=500;i++)plot(g,i,415,7);
         for(int i =400;i<=500;i++)plot(g,i,408,7);
         for(int i =400;i<=500;i++)plot(g,i,401,7);
         for(int i =400;i<=500;i++)plot(g,i,394,7);
         for(int i =400;i<=500;i++)plot(g,i,387,7);
         for(int i =400;i<=500;i++)plot(g,i,380,7);
         for(int i =400;i<=500;i++)plot(g,i,373,7);
         for(int i =400;i<=500;i++)plot(g,i,366,7);         
         for(int i =400;i<=500;i++)plot(g,i,359,7);
         for(int i =400;i<=500;i++)plot(g,i,352,7);
		 
		  g.setColor(Color.decode("#9bbb0e"));
         for(int i =390;i<=510;i++)plot(g,i,338,7);
         for(int i =390;i<=510;i++)plot(g,i,331,7);
         for(int i =390;i<=510;i++)plot(g,i,324,7);
         for(int i =390;i<=510;i++)plot(g,i,317,7);
		 //เงาท่อ1
		 g.setColor(Color.decode("#0f390b"));
         for(int i =317;i<=345;i++)plot(g,503,i,7);
		 for(int i =317;i<=345;i++)plot(g,496,i,7);
		 for(int i =317;i<=345;i++)plot(g,489,i,7);

         for(int i =345;i<=443;i++)plot(g,493,i,7);
		 for(int i =345;i<=443;i++)plot(g,486,i,7);
		 //เงาท้อ2
		 g.setColor(Color.decode("#30622d"));
         for(int i =317;i<=345;i++)plot(g,482,i,7);
		 for(int i =317;i<=345;i++)plot(g,475,i,7);
		 for(int i =317;i<=345;i++)plot(g,468,i,7);
		 for(int i =317;i<=345;i++)plot(g,461,i,7);

		 for(int i =345;i<=443;i++)plot(g,479,i,7);
		 for(int i =345;i<=443;i++)plot(g,472,i,7);
		 //เส้น
         g.setColor(Color.decode("#0f390b"));
		 for(int i =407;i<=493;i++)plot(g,i,422,7);//เส้นตัด
         for(int i =390;i<=510;i++)plot(g,i,310,7);
         for(int i =390;i<=510;i++)plot(g,i,345,7);

         for(int i =317;i<=345;i++)plot(g,390,i,7);//บน
         for(int i =317;i<=345;i++)plot(g,510,i,7);
         
         for(int i =345;i<=415;i++)plot(g,400,i,7);//ล่าง
         for(int i =345;i<=415;i++)plot(g,500,i,7);
		 //ตัด
		 for(int i =429;i<=443;i++)plot(g,400,i,7);//ล่าง
         for(int i =429;i<=443;i++)plot(g,500,i,7);

         //ท่อ 2
         g.setColor(Color.decode("#9bbb0e"));
         for(int i =1130;i<=1230;i++)plot(g,i,443,7);
         for(int i =1130;i<=1230;i++)plot(g,i,436,7);
         for(int i =1130;i<=1230;i++)plot(g,i,429,7);
         for(int i =1130;i<=1230;i++)plot(g,i,415,7);
         for(int i =1130;i<=1230;i++)plot(g,i,408,7);
         for(int i =1130;i<=1230;i++)plot(g,i,401,7);
         for(int i =1130;i<=1230;i++)plot(g,i,394,7);
         for(int i =1130;i<=1230;i++)plot(g,i,387,7);
         for(int i =1130;i<=1230;i++)plot(g,i,380,7);
         for(int i =1130;i<=1230;i++)plot(g,i,373,7);
         for(int i =1130;i<=1230;i++)plot(g,i,366,7);         
         for(int i =1130;i<=1230;i++)plot(g,i,359,7);
         for(int i =1130;i<=1230;i++)plot(g,i,352,7);
		 
		
		 g.setColor(Color.decode("#9bbb0e"));
         for(int i =1120;i<=1240;i++)plot(g,i,338,7);
         for(int i =1120;i<=1240;i++)plot(g,i,331,7);
         for(int i =1120;i<=1240;i++)plot(g,i,324,7);
         for(int i =1120;i<=1240;i++)plot(g,i,317,7);
		 //เงาท่อ1
		 g.setColor(Color.decode("#0f390b"));
         for(int i =317;i<=345;i++)plot(g,1233,i,7);
		 for(int i =317;i<=345;i++)plot(g,1226,i,7);
		 for(int i =317;i<=345;i++)plot(g,1219,i,7);

         for(int i =345;i<=443;i++)plot(g,1223,i,7);
		 for(int i =345;i<=443;i++)plot(g,1216,i,7);
		 //เงาท้อ2
		 g.setColor(Color.decode("#30622d"));
         for(int i =317;i<=345;i++)plot(g,1212,i,7);
		 for(int i =317;i<=345;i++)plot(g,1207,i,7);
		 for(int i =317;i<=345;i++)plot(g,1200,i,7);
		 for(int i =317;i<=345;i++)plot(g,1193,i,7);

		 for(int i =345;i<=443;i++)plot(g,1209,i,7);
		 for(int i =345;i<=443;i++)plot(g,1202,i,7);
		 //เส้น
         g.setColor(Color.decode("#0f390b"));
		 for(int i =1137;i<=1223;i++)plot(g,i,422,7);//เส้นตัด
         for(int i =1120;i<=1240;i++)plot(g,i,310,7);
         for(int i =1120;i<=1240;i++)plot(g,i,345,7);

         for(int i =317;i<=345;i++)plot(g,1120,i,7);//บน
         for(int i =317;i<=345;i++)plot(g,1240,i,7);
         
         for(int i =345;i<=415;i++)plot(g,1130,i,7);//ล่าง
         for(int i =345;i<=415;i++)plot(g,1230,i,7);
		 //ตัด
		 for(int i =429;i<=443;i++)plot(g,1130,i,7);//ล่าง
         for(int i =429;i<=443;i++)plot(g,1230,i,7);
 
         //f
		 g.setColor(Color.BLACK);
		 plot(g,1140,380,3);
		 plot(g,1140,383,3);
		 plot(g,1140,386,3);
		 plot(g,1140,389,3); 

		 plot(g,1143,386,3);
		 plot(g,1146,386,3);
		 
		 plot(g,1143,380,3);
		 plot(g,1146,380,3);
		 plot(g,1149,380,3);
		 
		 //i
		 plot(g,1155,374,3);
		 plot(g,1155,380,3);
		 plot(g,1155,383,3);
		 plot(g,1155,386,3);
		 plot(g,1155,389,3); 
		 
		 //n
		 plot(g,1162,380,3);
		 plot(g,1162,383,3);
		 plot(g,1162,386,3);
		 plot(g,1162,389,3);
		 
		 plot(g,1165,383,3);
		 
		 plot(g,1168,386,3);
         
		 plot(g,1171,389,3);
		 
		 plot(g,1171,380,3);
		 plot(g,1171,383,3);
		 plot(g,1171,386,3);
		 plot(g,1171,389,3);
		 
		 //a
		 plot(g,1183,380,3);
		 plot(g,1180,383,3);
		 plot(g,1177,386,3);
		 plot(g,1177,389,3);
		 
		 plot(g,1186,383,3);
		 
		 plot(g,1189,386,3);
		 
		 plot(g,1189,389,3);
		 
		 plot(g,1180,386,3);
		 plot(g,1183,386,3);
		 plot(g,1186,386,3);
		 
		 //l
		 plot(g,1195,380,3);
		 plot(g,1195,383,3);
		 plot(g,1195,386,3);
		 plot(g,1195,389,3); 
		 
		 plot(g,1198,389,3); 
		 plot(g,1201,389,3); 
		 plot(g,1204,389,3); 
		 
         //m
		 plot(g,430,380,3);
		 plot(g,430,383,3);
		 plot(g,430,386,3);
		 plot(g,430,389,3);
		 
		 plot(g,433,383,3);
		 
		 plot(g,436,386,3);
         
		 plot(g,439,383,3);
		 
		 plot(g,442,380,3);
		 plot(g,442,383,3);
		 plot(g,442,386,3);
		 plot(g,442,389,3);
		 
		 //i
		 plot(g,448,374,3);
		 plot(g,448,380,3);
		 plot(g,448,383,3);
		 plot(g,448,386,3);
		 plot(g,448,389,3); 
		 
		 //d
		 plot(g,453,380,3);
		 plot(g,453,383,3);
		 plot(g,453,386,3);
		 plot(g,453,389,3); 
		 
		 plot(g,456,380,3);
		 plot(g,459,380,3);
		 plot(g,456,389,3);
		 plot(g,459,389,3);
		 
		 plot(g,462,374,3);
		 plot(g,462,377,3);
		 plot(g,462,380,3);
		 plot(g,462,383,3);
		 plot(g,462,386,3);
		 plot(g,462,389,3);
		 
         //ท่อ 3
          g.setColor(Color.decode("#9bbb0e"));
         for(int i =1600;i<=1700;i++)plot(g,i,443,7);
         for(int i =1600;i<=1700;i++)plot(g,i,436,7);
         for(int i =1600;i<=1700;i++)plot(g,i,429,7);
         for(int i =1600;i<=1700;i++)plot(g,i,415,7);
         for(int i =1600;i<=1700;i++)plot(g,i,408,7);
         for(int i =1600;i<=1700;i++)plot(g,i,401,7);
         for(int i =1600;i<=1700;i++)plot(g,i,394,7);
         for(int i =1600;i<=1700;i++)plot(g,i,387,7);
         for(int i =1600;i<=1700;i++)plot(g,i,380,7);
         for(int i =1600;i<=1700;i++)plot(g,i,373,7);
         for(int i =1600;i<=1700;i++)plot(g,i,366,7);         
         for(int i =1600;i<=1700;i++)plot(g,i,359,7);
         for(int i =1600;i<=1700;i++)plot(g,i,352,7);
		 
		  g.setColor(Color.decode("#9bbb0e"));
         for(int i =1590;i<=1710;i++)plot(g,i,338,7);
         for(int i =1590;i<=1710;i++)plot(g,i,331,7);
         for(int i =1590;i<=1710;i++)plot(g,i,324,7);
         for(int i =1590;i<=1710;i++)plot(g,i,317,7);
		 //เงาท่อ1
		 g.setColor(Color.decode("#0f390b"));
         for(int i =317;i<=345;i++)plot(g,1703,i,7);
		 for(int i =317;i<=345;i++)plot(g,1696,i,7);
		 for(int i =317;i<=345;i++)plot(g,1689,i,7);

         for(int i =345;i<=443;i++)plot(g,1693,i,7);
		 for(int i =345;i<=443;i++)plot(g,1686,i,7);
		 //เงาท้อ2
		 g.setColor(Color.decode("#30622d"));
         for(int i =317;i<=345;i++)plot(g,1682,i,7);
		 for(int i =317;i<=345;i++)plot(g,1675,i,7);
		 for(int i =317;i<=345;i++)plot(g,1668,i,7);
		 for(int i =317;i<=345;i++)plot(g,1661,i,7);

		 for(int i =345;i<=443;i++)plot(g,1679,i,7);
		 for(int i =345;i<=443;i++)plot(g,1672,i,7);
		 //เส้น
         g.setColor(Color.decode("#0f390b"));
		 for(int i =1607;i<=1693;i++)plot(g,i,422,7);//เส้นตัด
         for(int i =1590;i<=1710;i++)plot(g,i,310,7);
         for(int i =1590;i<=1710;i++)plot(g,i,345,7);

         for(int i =317;i<=345;i++)plot(g,1590,i,7);//บน
         for(int i =317;i<=345;i++)plot(g,1710,i,7);
         
         for(int i =345;i<=415;i++)plot(g,1600,i,7);//ล่าง
         for(int i =345;i<=415;i++)plot(g,1700,i,7);
		 //ตัด
		 for(int i =429;i<=443;i++)plot(g,1600,i,7);//ล่าง
         for(int i =429;i<=443;i++)plot(g,1700,i,7);

	}   
  public void Cloud (Graphics2D g)
	  {
        for (int i = 23; i >= 0; i--) {circleKung(g, 112, 194, 213, i,129,75);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,90,75);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,62,65);}
        for (int i = 23; i >= 0; i--) {circleKung(g, 112, 194, 213, i,110,42);}
        for (int i = 23; i >= 0; i--) {circleKung(g, 255, 255, 255, i,125,71);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,87,71);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,58,61);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 255, 255, 255, i,107,38);}
        for (int i = 23; i >= 0; i--) {circleKung(g, 255, 255, 255, i,74,43);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,328,144);}
        for (int i = 21; i >= 0; i--) {circleKung(g, 112, 194, 213, i,294,151);}
        for (int i = 16; i >= 0; i--) {circleKung(g, 112, 194, 213, i,266,154);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 112, 194, 213, i,238,145);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,303,119);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,324,141);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 255, 255, 255, i,291,147);}
        for (int i = 18; i >= 0; i--) {circleKung(g, 255, 255, 255, i,262,151);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 255, 255, 255, i,235,142);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,264,124);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 255, 255, 255, i,299,116);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 112, 194, 213, i,598,61);}
        for (int i = 18; i >= 0; i--) {circleKung(g, 112, 194, 213, i,571,70);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 112, 194, 213, i,542,66);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,508,60);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,533,35);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,602,58);}
        for (int i = 19; i >= 0; i--) {circleKung(g, 255, 255, 255, i,574,66);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 255, 255, 255, i,546,63);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,512,57);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 255, 255, 255, i,537,32);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,573,40);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 112, 194, 213, i,772,153);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 112, 194, 213, i,790,161);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 112, 194, 213, i,797,181);}
        for (int i = 14; i >= 0; i--) {circleKung(g, 112, 194, 213, i,777,193);}
        for (int i = 14; i >= 0; i--) {circleKung(g, 112, 194, 213, i,757,188);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 112, 194, 213, i,739,176);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 255, 255, 255, i,793,179);}
        for (int i = 14; i >= 0; i--) {circleKung(g, 255, 255, 255, i,773,191);}
        for (int i = 14; i >= 0; i--) {circleKung(g, 255, 255, 255, i,753,186);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 255, 255, 255, i,734,174);}
        for (int i = 14; i >= 0; i--) {circleKung(g, 255, 255, 255, i,748,160);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 255, 255, 255, i,768,151);}
        for (int i = 16; i >= 0; i--) {circleKung(g, 255, 255, 255, i,786,160);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 255, 255, 255, i,767,174);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1050,79);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1011,79);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,983,70);}
        for (int i = 23; i >= 0; i--) {circleKung(g, 112, 194, 213, i,999,52);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1031,47);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1046,75);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1008,75);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,980,66);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 255, 255, 255, i,995,47);}
        for (int i = 17; i >= 0; i--) {circleKung(g, 255, 255, 255, i,767,174);}
        for (int i = 21; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1028,42);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1223,168);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1189,174);}
        for (int i = 18; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1161,178);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1133,169);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1198,143);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1220,165);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1186,171);}
        for (int i = 18; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1157,175);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1130,166);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1159,148);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1195,140);}
		for (int i = 25; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1528,144);}
        for (int i = 21; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1494,151);}
        for (int i = 16; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1466,154);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1438,145);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 112, 194, 213, i,1503,119);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1524,141);}
        for (int i = 22; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1491,147);}
        for (int i = 18; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1462,151);}
        for (int i = 24; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1435,142);}
        for (int i = 25; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1464,124);}
        for (int i = 26; i >= 0; i--) {circleKung(g, 255, 255, 255, i,1499,116);}
  }
		
	 public void mario (Graphics2D g){
     //หมวก
		 g.setColor(Color.RED);
		 plot(g,65,375,5);
		 plot(g,70,375,5);
		 plot(g,75,375,5);
		 plot(g,80,375,5);
		
		 plot(g,60,380,5);
		 plot(g,65,380,5);
		 plot(g,70,380,5);
		 plot(g,75,380,5);
		 plot(g,80,380,5);
		 plot(g,85,380,5);
		 plot(g,90,380,5);
		 plot(g,95,380,5);
		 plot(g,100,380,5);
		 
		 
		 //จอนผม
		 g.setColor(Color.decode("#8B4513"));
		 plot(g,60,385,5);
		 plot(g,65,385,5);
		 plot(g,70,385,5);
		 plot(g,65,390,5);
		 plot(g,65,395,5);
		 plot(g,70,395,5);
		 
		 //ผมท้ายทอบย
		 plot(g,55,390,5);
		 plot(g,55,395,5);
		 plot(g,55,400,5);
		 plot(g,60,400,5);
		 
		 //ตา
		 g.setColor(Color.BLACK);
		 plot(g,85,385,5);
		 plot(g,85,390,5);
		 
		 //หนวด
		 g.setColor(Color.decode("#8B4513"));
		 plot(g,90,395,5);
		 plot(g,85,400,5);
		 plot(g,90,400,5);
		 plot(g,95,400,5);
		 plot(g,100,400,5);
		 plot(g,105,400,5);
		 plot(g,100,405,5);
		 
		 //ผิวหน้า
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,75,385,5);
		 plot(g,80,385,5);
		 plot(g,90,385,5);
		 
		 plot(g,70,390,5);
		 plot(g,75,390,5);
		 plot(g,80,390,5);
		 plot(g,90,390,5);
		 plot(g,95,390,5);
		 plot(g,100,390,5);
		 
		 plot(g,75,395,5);
		 plot(g,80,395,5);
		 plot(g,85,395,5);
		 plot(g,95,395,5);
		 plot(g,100,395,5);
		 plot(g,105,395,5);
		 
		 plot(g,65,400,5);
		 plot(g,70,400,5);
		 plot(g,75,400,5);
		 plot(g,80,400,5);
		 
		 plot(g,65,405,5);
		 plot(g,70,405,5);
		 plot(g,75,405,5);
		 plot(g,80,405,5);
		 plot(g,85,405,5);
		 plot(g,90,405,5);
		 plot(g,95,405,5);
		 
		 //หูกับผิวเชื่อมไปแขนเสื้อ
		 plot(g,60,390,5);
		 plot(g,60,395,5);
		 plot(g,65,400,5);
		 plot(g,65,405,5);
		 
		 //แขนเสื้อ 2
		 g.setColor(Color.RED);
		 plot(g,100,385,5);
		 g.setColor(Color.RED);
		 plot(g,105,385,5);
		 g.setColor(Color.RED);
		 plot(g,110,385,5);
		 
		 g.setColor(Color.RED);
		 plot(g,105,390,5);
		 g.setColor(Color.RED);
		 plot(g,110,390,5);
		 
		 g.setColor(Color.RED);
		 plot(g,110,395,5);
		 
		 //มือ2
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,100,370,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,105,370,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,110,370,5);
		 
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,100,375,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,105,375,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,110,375,5);
		 
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,105,380,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,110,380,5);
		 
		 //แขนเสื้อ1
		 g.setColor(Color.RED);
		 plot(g,65,410,5);
		 g.setColor(Color.RED);
		 plot(g,60,410,5);
		 g.setColor(Color.RED);
		 plot(g,55,410,5);
		 g.setColor(Color.RED);
		 plot(g,50,410,5);
		 g.setColor(Color.RED);
		 plot(g,45,410,5);
		 g.setColor(Color.RED);
		 plot(g,70,415,5);
		 g.setColor(Color.RED);
		 plot(g,65,415,5);
		 g.setColor(Color.RED);
		 plot(g,60,415,5);
		 g.setColor(Color.RED);
		 plot(g,55,415,5);
		 g.setColor(Color.RED);
		 plot(g,50,415,5);
		 g.setColor(Color.RED);
		 plot(g,45,415,5);
		 g.setColor(Color.RED);
		 plot(g,40,415,5);
		 g.setColor(Color.RED);
		 plot(g,70,420,5);
		 g.setColor(Color.RED);
		 plot(g,65,420,5);
		 g.setColor(Color.RED);
		 plot(g,60,420,5);
		 g.setColor(Color.RED);
		 plot(g,55,420,5);
		 g.setColor(Color.RED);
		 plot(g,50,420,5);
		 g.setColor(Color.RED);
		 plot(g,45,420,5);
		 g.setColor(Color.RED);
		 plot(g,65,425,5);
		 
		 //เสื้อแดงข้างใน
		 g.setColor(Color.RED);
		 plot(g,75,410,5);
		 g.setColor(Color.RED);
		 plot(g,80,410,5);
		 g.setColor(Color.RED);
		 plot(g,85,410,5);
		 g.setColor(Color.RED);
		 plot(g,95,410,5);
		 
		 g.setColor(Color.RED);
		 plot(g,80,415,5);
		 g.setColor(Color.RED);
		 plot(g,85,415,5);
		 g.setColor(Color.RED);
		 plot(g,90,415,5);
		 
		 //เอี๊ยม
		 g.setColor(Color.BLUE);
		 plot(g,70,410,5);
		 g.setColor(Color.BLUE);
		 plot(g,90,410,5);
		 g.setColor(Color.BLUE);
		 plot(g,75,415,5);
		 g.setColor(Color.BLUE);
		 plot(g,95,415,5);
		
		 g.setColor(Color.BLUE);
		 plot(g,75,420,5);
		 g.setColor(Color.BLUE);
		 plot(g,80,420,5);
		 g.setColor(Color.BLUE);
		 plot(g,85,420,5);
		 g.setColor(Color.BLUE);
		 plot(g,90,420,5);
		 g.setColor(Color.BLUE);
		 plot(g,95,420,5);
		 
		 g.setColor(Color.BLUE);
		 plot(g,60,425,5);
		 g.setColor(Color.BLUE);
		 plot(g,70,425,5);
		 g.setColor(Color.BLUE);
		 plot(g,75,425,5);
		 g.setColor(Color.BLUE);
		 plot(g,80,425,5);
		 g.setColor(Color.BLUE);
		 plot(g,90,425,5);
		 g.setColor(Color.BLUE);
		 plot(g,100,425,5);
		 
		 g.setColor(Color.BLUE);
		 plot(g,60,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,65,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,70,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,75,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,80,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,85,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,90,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,95,430,5);
		 g.setColor(Color.BLUE);
		 plot(g,100,430,5);
		 
		 g.setColor(Color.BLUE);
		 plot(g,60,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,65,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,70,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,75,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,80,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,85,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,90,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,95,435,5);
		 g.setColor(Color.BLUE);
		 plot(g,100,435,5);
		 
		 g.setColor(Color.BLUE);
		 plot(g,55,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,60,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,65,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,70,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,75,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,80,440,5);
		 g.setColor(Color.BLUE);
		 plot(g,85,440,5);
		 
		 g.setColor(Color.BLUE);
		 plot(g,55,445,5);
		 g.setColor(Color.BLUE);
		 plot(g,60,445,5);
		 g.setColor(Color.BLUE);
		 plot(g,65,445,5);
		 g.setColor(Color.BLUE);
		 plot(g,70,445,5);
		 
		 //foot2
		 g.setColor(Color.BLACK);
		 plot(g,105,425,5);
		 g.setColor(Color.BLACK);
		 plot(g,105,430,5);
		 g.setColor(Color.BLACK);
		 plot(g,105,435,5);
		 
		 g.setColor(Color.BLACK);
		 plot(g,110,415,5);
		 g.setColor(Color.BLACK);
		 plot(g,110,420,5);
		 g.setColor(Color.BLACK);
		 plot(g,110,425,5);
		 g.setColor(Color.BLACK);
		 plot(g,110,430,5);
		 g.setColor(Color.BLACK);
		 plot(g,110,435,5);
		 
		 //กระดุม
		 g.setColor(Color.PINK);
		 plot(g,85,425,5);
		 g.setColor(Color.PINK);
		 plot(g,95,425,5);
		 
		 //hand1
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,40,420,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,35,420,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,45,425,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,40,425,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,35,425,5);
		 g.setColor(Color.decode("#DEB887"));
		 plot(g,40,430,5);
		 
		 //foot1
		 g.setColor(Color.BLACK);
		 plot(g,50,430,5);
		 g.setColor(Color.BLACK);
		 plot(g,45,435,5);
		 g.setColor(Color.BLACK);
		 plot(g,50,435,5);
		 g.setColor(Color.BLACK);
		 plot(g,55,435,5);
		 g.setColor(Color.BLACK);
		 plot(g,40,440,5);
		 g.setColor(Color.BLACK);
		 plot(g,45,440,5);
		 g.setColor(Color.BLACK);
		 plot(g,50,440,5);
		 g.setColor(Color.BLACK);
		 plot(g,40,445,5);
	}
	 public void Polyjang (Graphics g , int x1, int y1, int x2, int y2, int x3, int y3){
        int xpoly [] = {x1, x2, x3};
        int ypoly [] = {y1, y2 ,y3};
        Polygon poly = new Polygon (xpoly,ypoly,xpoly.length);
        g.fillPolygon(poly);
    }
    public static void circleKung (Graphics g, int r, int gg, int b, int rr, int xc, int yc) {
        int x = 0;
        int y = rr;
        int d = 1 - rr;
        int k = 2;
        while (x <= y) {
            g.setColor(new Color(r, gg, b));
            g.fillRect(xc + x, yc + y, k, k);
            g.fillRect(xc + x, yc - y, k, k);
            g.fillRect(xc + y, yc + x, k, k);
            g.fillRect(xc + y, yc - x, k, k);
            g.fillRect(xc - x, yc + y, k, k);
            g.fillRect(xc - x, yc - y, k, k);
            g.fillRect(xc - y, yc + x, k, k);
            g.fillRect(xc - y, yc - x, k, k);
            x = x + 1;

            if (d >= 0) {
                y = y - 1;
                d = d - 2 * y;
            }
            d = d + 2 * x + 1;
        }
	}

    
    public static void WongmaHoree (Graphics g,int rr,int gg,int bb,int a,int b,int xc,int yc){
        int k=3;
        int x=0;
        int y=b;
        int d1=Math.round((b*b)-(a*a)*b+((a*a)/4));
        while ((b*b)*x<(a*a)*y){
            g.setColor(new Color(rr,gg,bb));
            g.fillRect(xc+x,yc+y,k,k);
            g.fillRect(xc+x,yc-y,k,k);
            g.fillRect(xc-x,yc-y,k,k);
            g.fillRect(xc-x,yc+y,k,k);
            x+=1;
            if (d1>=0){
                y-=1;
                d1=d1+((2*(b*b))*x)-((2*(a*a))*y)+(b*b);
            }
            else d1=d1+((2*(b*b))*x)+(b*b);
        }
        x=a;
        y=0;
        int d2=Math.round((a*a)-((b*b)*a)+((b*b)/4));
        while ((b*b)*x>(a*a)*y){
            g.setColor(new Color(rr,gg,bb));
            plot(g,xc+x,yc+y,k);
            plot(g,xc+x,yc-y,k);
            plot(g,xc-x,yc-y,k);
            plot(g,xc-x,yc+y,k);
            y+=1;
            if (d2>=0){
                x-=1;
                d2=d2+((2*(a*a))*y)-((2*(b*b))*x)+(a*a);
            }
            else d2=d2+(2*(a*a))*y+(a*a);
        }
    }
    public void Allline (Graphics g, int x1, int y1, int x2, int y2,int size ) {
           if(x1==x2) for(int i = 1 ; i<=size ;i++,x1++,x2++) {
                        g.drawLine(x1, y1, x2, y2);
                                                               }
            else for(int i = 1 ; i<=size ;i++,y1++,y2++) {
                        g.drawLine(x1, y1, x2, y2);
                                                          }
 }
    
    private static void plot(Graphics g, int x, int y,int size ) {
        g.fillRect(x, y, size, size);
    }
	

}

