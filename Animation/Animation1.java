import javax.swing.*;
import java.awt.*;
public class Assignment1_61050956 extends JPanel{
	
	 public void paintComponent(Graphics g){
	    Color Red = new Color (255, 49, 67);
	    Color Blue = new Color (11, 150, 215);
	    Color LightBlue = new Color (167, 250, 255);
	    Color Orange = new Color (254, 124, 48);
	    Color Yellow = new Color (248, 240, 141);
	    Color DarkBlue = new Color (60, 95, 115);
	    Color BlueOcean = new Color (162, 193, 235);
	    Color White = new Color (255, 255, 255);
	    Color Green = new Color (126, 196, 82);
	    Color Violet = new Color (91, 57, 152);
	    Color Pink = new Color (243, 189, 221);
	    Color BarbiePink = new Color (207, 15, 218);
	    Color DarkPink = new Color (230, 74, 158);
	    Color Black = new Color (26, 28, 41);


//bg
	    g.setColor(DarkBlue);
	    for(int i =0;i<=600;i++)bresenhamLine(g,0,i,600,i);

//skin uppart
        g.setColor(White);
        for(int i =100;i<=194;i++)bresenhamLine(g,30,i,100,i);//หูซ้าย
        for(int i =30;i<=110;i++)bresenhamLine(g,255,i,323,i);//หูขวา
	    for(int i =190;i<=239;i++)bresenhamLine(g,270,i,368,i);//กลาง
//ครึ่งล่าง
	    for(int i =239;i<=340;i++)bresenhamLine(g,129,i,490,i); //face
	    for(int i =270;i<=320;i++)bresenhamLine(g,99,i,124,i); //detail face
	    for(int i =355;i<=390;i++)bresenhamLine(g,180,i,250,i); //detail hand
	    for(int i =345;i<=385;i++)bresenhamLine(g,335,i,460,i); //detail tail
	    for(int i =390;i<=400;i++)bresenhamLine(g,335,i,435,i);
	    for(int i =405;i<=415;i++)bresenhamLine(g,335,i,430,i);
	    for(int i =420;i<=430;i++)bresenhamLine(g,335,i,395,i);
	    


		 {
		g.setColor(White);
//61050956
        //h450/470
        for(int i =450;i<=470;i++)plot(g,70,i,5);//6  w70/80
		for(int i =460;i<=470;i++)plot(g,80,i,5);
		for(int i =70;i<=80;i++)plot(g,i,450,5);
		for(int i =70;i<=80;i++)plot(g,i,460,5);
		for(int i =70;i<=80;i++)plot(g,i,470,5);
		for(int i =450;i<=470;i++)plot(g,95,i,5);//1 w 90/100
		for(int i =90;i<=100;i++)plot(g,i,470,5);
		for(int i =90;i<=95;i++)plot(g,i,455,5);
        for(int i =450;i<=470;i++)plot(g,110,i,5);//0 w110/120
        for(int i =450;i<=470;i++)plot(g,120,i,5);
		for(int i =110;i<=120;i++)plot(g,i,450,5);
		for(int i =110;i<=120;i++)plot(g,i,470,5);
        for(int i =450;i<=460;i++)plot(g,130,i,5);//5 w130/140
        for(int i =460;i<=470;i++)plot(g,140,i,5);
		plot(g,135,460,5);
		for(int i =130;i<=140;i++)plot(g,i,450,5);
		for(int i =130;i<=140;i++)plot(g,i,470,5);
        for(int i =450;i<=470;i++)plot(g,150,i,5);//0 w150/160
        for(int i =450;i<=470;i++)plot(g,160,i,5);
		for(int i =150;i<=160;i++)plot(g,i,450,5);
		for(int i =150;i<=160;i++)plot(g,i,470,5);
		for(int i =450;i<=460;i++)plot(g,170,i,5);//9 w170/180
		for(int i =450;i<=470;i++)plot(g,180,i,5);
        for(int i =170;i<=180;i++)plot(g,i,470,5);
	    plot(g,175,460,5);plot(g,175,450,5);
		for(int i =450;i<=460;i++)plot(g,190,i,5);//5 w190/200
        for(int i =460;i<=470;i++)plot(g,200,i,5);
		plot(g,195,460,5);
		for(int i =190;i<=200;i++)plot(g,i,450,5);
		for(int i =190;i<=200;i++)plot(g,i,470,5);
        for(int i =450;i<=470;i++)plot(g,210,i,5);//6 w210/220
		for(int i =460;i<=470;i++)plot(g,220,i,5);
		for(int i =210;i<=220;i++)plot(g,i,450,5);
		for(int i =210;i<=220;i++)plot(g,i,460,5);
		for(int i =210;i<=220;i++)plot(g,i,470,5);
				
//61050322
		for(int i =500;i<=520;i++)plot(g,70,i,5); //6
		for(int i =510;i<=520;i++)plot(g,80,i,5);
		for(int i =70;i<=80;i++)plot(g,i,500,5);
		for(int i =70;i<=80;i++)plot(g,i,510,5);
		for(int i =70;i<=80;i++)plot(g,i,520,5);
		
		for(int i =500;i<=520;i++)plot(g,95,i,5); //1
		for(int i =90;i<=100;i++)plot(g,i,520,5);
		for(int i =90;i<=95;i++)plot(g,i,505,5);

		for(int i =500;i<=520;i++)plot(g,110,i,5); //0
        for(int i =500;i<=520;i++)plot(g,120,i,5);
		for(int i =110;i<=120;i++)plot(g,i,500,5);
		for(int i =110;i<=120;i++)plot(g,i,520,5);
		
		for(int i =500;i<=510;i++)plot(g,130,i,5); //5
        for(int i =510;i<=520;i++)plot(g,140,i,5);
		plot(g,135,510,5);
		for(int i =130;i<=140;i++)plot(g,i,500,5);
		for(int i =130;i<=140;i++)plot(g,i,520,5);
		
		for(int i =500;i<=520;i++)plot(g,150,i,5); //0 
        for(int i =500;i<=520;i++)plot(g,160,i,5);
        for(int i =150;i<=160;i++)plot(g,i,500,5);
		for(int i =150;i<=160;i++)plot(g,i,520,5);
		
		for(int i =170;i<=180;i++)plot(g,i,500,5); //3
		for(int i =500;i<=520;i++)plot(g,180,i,5);
		plot(g,175,510,5);
        for(int i =170;i<=180;i++)plot(g,i,520,5);
	    
	    
	    for(int i =190;i<=200;i++)plot(g,i,500,5); //2
		for(int i =500;i<=510;i++)plot(g,200,i,5);
		plot(g,190,510,5); 
        for(int i =190;i<=200;i++) plot(g,i,520,5);
	    plot(g,195,510,5); plot(g,195,500,5);
	    for(int i =510;i<=520;i++)plot(g,190,i,5);
	    
	    for(int i =210;i<=220;i++)plot(g,i,500,5); //2
		for(int i =500;i<=510;i++)plot(g,220,i,5);
		plot(g,210,510,5); 
        for(int i =210;i<=220;i++) plot(g,i,520,5);
	    plot(g,215,510,5); plot(g,215,500,5);
	    for(int i =510;i<=520;i++)plot(g,210,i,5);

		 }

//fox uppart
        g.setColor(Orange);

		for(int i =90;i<=142;i++)bresenhamLine(g,25,i,34,i);//7
		for(int i =90;i<=111;i++)bresenhamLine(g,25,i,48,i);
		for(int i =171;i<=194;i++)bresenhamLine(g,39,i,49,i);  //2d
		for(int i =130;i<=155;i++)bresenhamLine(g,39,i,49,i);  //2d
		for(int i =97;i<=239;i++)bresenhamLine(g,211,i,220,i);
		for(int i =115;i<=239;i++)bresenhamLine(g,167,i,206,i);
		for(int i =170;i<=239;i++)bresenhamLine(g,97,i,107,i);
		for(int i =130;i<=239;i++)bresenhamLine(g,112,i,162,i);
		for(int i =75;i<=239;i++)bresenhamLine(g,225,i,235,i);
	    for(int i =186;i<=239;i++)bresenhamLine(g,53,i,65,i);
		for(int i =197;i<=239;i++)bresenhamLine(g,70,i,80,i); 
		for(int i =171;i<=239;i++)bresenhamLine(g,83,i,93,i);
		for(int i =115;i<=125;i++)bresenhamLine(g,97,i,122,i);
		for(int i =55;i<=239;i++)bresenhamLine(g,240,i,250,i);
		for(int i =115;i<=239;i++)bresenhamLine(g,255,i,295,i);//2u
        for(int i =45;i<=55;i++)bresenhamLine(g,255,i,265,i);//1
		for(int i =15;i<=55;i++)bresenhamLine(g,299,i,309,i);//3u
		for(int i =45;i<=55;i++)bresenhamLine(g,285,i,323,i);//3l
		for(int i =89;i<=220;i++)bresenhamLine(g,299,i,309,i);
		for(int i =125;i<=197;i++)bresenhamLine(g,328,i,338,i);//6
		for(int i =100;i<=210;i++)bresenhamLine(g,314,i,323,i);
		for(int i =100;i<=180;i++)bresenhamLine(g,343,i,353,i);//
		for(int i =117;i<=239;i++)bresenhamLine(g,358,i,450,i);//5l
		for(int i =170;i<=239;i++)bresenhamLine(g,495,i,505,i);//1
		for(int i =155;i<=239;i++)bresenhamLine(g,470,i,490,i);//2l
		for(int i =141;i<=239;i++)bresenhamLine(g,455,i,465,i);//2l
		for(int i =195;i<=239;i++)bresenhamLine(g,510,i,520,i);//2l
		//ครึ่งล่างสีส้ม
		for(int i =244;i<=265;i++)bresenhamLine(g,69,i,79,i);
		for(int i =244;i<=265;i++)bresenhamLine(g,54,i,64,i);
		for(int i =355;i<=390;i++)bresenhamLine(g,182,i,192,i);
		for(int i =370;i<=390;i++)bresenhamLine(g,197,i,207,i);
		for(int i =380;i<=390;i++)bresenhamLine(g,212,i,222,i);
		for(int i =395;i<=405;i++)bresenhamLine(g,225,i,270,i);
		for(int i =380;i<=390;i++)bresenhamLine(g,220,i,290,i);
		for(int i =355;i<=385;i++)bresenhamLine(g,240,i,300,i);
		for(int i =340;i<=350;i++)bresenhamLine(g,290,i,300,i);
		for(int i =325;i<=365;i++)bresenhamLine(g,305,i,315,i);
		for(int i =244;i<=265;i++)bresenhamLine(g,69,i,295,i);
		for(int i =280;i<=290;i++)bresenhamLine(g,125,i,295,i);
		for(int i =270;i<=280;i++)bresenhamLine(g,113,i,295,i);
		for(int i =295;i<=305;i++)bresenhamLine(g,212,i,285,i);
		for(int i =235;i<=290;i++)bresenhamLine(g,370,i,535,i);
		for(int i =265;i<=275;i++)bresenhamLine(g,361,i,530,i);
		for(int i =295;i<=305;i++)bresenhamLine(g,335,i,345,i);
		for(int i =310;i<=330;i++)bresenhamLine(g,350,i,361,i);
		for(int i =280;i<=290;i++)bresenhamLine(g,348,i,365,i);
		for(int i =295;i<=305;i++)bresenhamLine(g,366,i,520,i);
		for(int i =310;i<=320;i++)bresenhamLine(g,385,i,395,i);
		for(int i =360;i<=370;i++)bresenhamLine(g,450,i,470,i);
		for(int i =345;i<=355;i++)bresenhamLine(g,465,i,485,i);
		for(int i =330;i<=340;i++)bresenhamLine(g,465,i,510,i);
		for(int i =310;i<=325;i++)bresenhamLine(g,450,i,520,i);
		for(int i =320;i<=340;i++)bresenhamLine(g,435,i,445,i);


		

//line uppart
	    g.setColor(Black);

        for(int i =75;i<=87;i++)bresenhamLine(g,25,i,48,i);
        for(int i =90;i<=140;i++)bresenhamLine(g,12,i,20,i);
        for(int i =90;i<=100;i++)bresenhamLine(g,53,i,92,i);
	    for(int i =144;i<=194;i++)bresenhamLine(g,25,i,34,i);//4d
	    for(int i =199;i<=239;i++)bresenhamLine(g,39,i,49,i);//3d
	    for(int i =213;i<=223;i++)bresenhamLine(g,54,i,65,i);//1
		for(int i =228;i<=239;i++)bresenhamLine(g,70,i,80,i); //1
		for(int i =171;i<=181;i++)bresenhamLine(g,83,i,93,i); //1
		for(int i =100;i<=110;i++)bresenhamLine(g,53,i,65,i);//1
		for(int i =100;i<=110;i++)bresenhamLine(g,97,i,119,i);//2l
		for(int i =115;i<=125;i++)bresenhamLine(g,69,i,92,i);//2l
		for(int i =115;i<=125;i++)bresenhamLine(g,124,i,162,i);//3l
		for(int i =130;i<=168;i++)bresenhamLine(g,97,i,107,i);//3d
		for(int i =100;i<=110;i++)bresenhamLine(g,167,i,206,i);//3l
		for(int i =75;i<=95;i++)bresenhamLine(g,211,i,220,i);//2u
		for(int i =60;i<=70;i++)bresenhamLine(g,225,i,235,i);//1   //239
        for(int i =45;i<=55;i++)bresenhamLine(g,240,i,250,i);//1
		for(int i =75;i<=95;i++)bresenhamLine(g,240,i,250,i);//2u
		for(int i =30;i<=40;i++)bresenhamLine(g,255,i,280,i);//2l
		for(int i =60;i<=70;i++)bresenhamLine(g,255,i,265,i);//1
		for(int i =100;i<=110;i++)bresenhamLine(g,255,i,265,i);//1
		for(int i =115;i<=125;i++)bresenhamLine(g,270,i,280,i);
		for(int i =15;i<=25;i++)bresenhamLine(g,270,i,294,i);//2l
		for(int i =0;i<=10;i++)bresenhamLine(g,299,i,309,i);//1
		for(int i =0;i<=40;i++)bresenhamLine(g,314,i,323,i);//3u
		for(int i =215;i<=225;i++)bresenhamLine(g,300,i,309,i);
		for(int i =230;i<=275;i++)bresenhamLine(g,286,i,295,i); //1ล่าง
		for(int i =45;i<=125;i++)bresenhamLine(g,328,i,338,i);//6u
		for(int i =161;i<=185;i++)bresenhamLine(g,328,i,338,i);//2u
		for(int i =89;i<=112;i++)bresenhamLine(g,343,i,353,i);//2u
		for(int i =130;i<=156;i++)bresenhamLine(g,343,i,353,i);//2u 2
		for(int i =174;i<=185;i++)bresenhamLine(g,343,i,353,i);//1
		for(int i =130;i<=156;i++)bresenhamLine(g,314,i,323,i);//2u
		for(int i =190;i<=239;i++)bresenhamLine(g,358,i,368,i);//4u
		for(int i =102;i<=112;i++)bresenhamLine(g,358,i,425,i);//5l 
		for(int i =117;i<=127;i++)bresenhamLine(g,430,i,450,i);//2l
        for(int i =229;i<=239;i++)bresenhamLine(g,397,i,410,i);//1
        for(int i =215;i<=225;i++)bresenhamLine(g,415,i,435,i);//2l
        for(int i =200;i<=210;i++)bresenhamLine(g,440,i,465,i);//2l
        for(int i =200;i<=255;i++)bresenhamLine(g,525,i,535,i);//3d  linelest
        for(int i =175;i<=195;i++)bresenhamLine(g,510,i,520,i);//2l  ll2
        for(int i =131;i<=141;i++)bresenhamLine(g,455,i,465,i);//2l
        for(int i =145;i<=155;i++)bresenhamLine(g,470,i,490,i);//2l
        for(int i =160;i<=170;i++)bresenhamLine(g,495,i,505,i);//1
 //ครึ่งล่าง       
        for(int i =244;i<=265;i++)bresenhamLine(g,54,i,64,i);
		for(int i =244;i<=305;i++)bresenhamLine(g,84,i,94,i);
		for(int i =270;i<=280;i++)bresenhamLine(g,69,i,79,i);
		for(int i =310;i<=320;i++)bresenhamLine(g,99,i,109,i);
		for(int i =325;i<=335;i++)bresenhamLine(g,114,i,124,i);
		for(int i =340;i<=350;i++)bresenhamLine(g,129,i,285,i); //คาง
		for(int i =355;i<=390;i++)bresenhamLine(g,167,i,177,i);
		for(int i =370;i<=390;i++)bresenhamLine(g,225,i,235,i);
		for(int i =355;i<=365;i++)bresenhamLine(g,240,i,250,i);
		for(int i =395;i<=405;i++)bresenhamLine(g,182,i,220,i);
		for(int i =410;i<=420;i++)bresenhamLine(g,225,i,270,i);
		for(int i =395;i<=405;i++)bresenhamLine(g,275,i,285,i);
		for(int i =380;i<=390;i++)bresenhamLine(g,290,i,300,i);
		for(int i =365;i<=375;i++)bresenhamLine(g,305,i,315,i);
		for(int i =325;i<=335;i++)bresenhamLine(g,290,i,300,i); //nose low
		for(int i =310;i<=320;i++)bresenhamLine(g,275,i,285,i); //nose top
		for(int i =310;i<=320;i++)bresenhamLine(g,305,i,315,i);
		for(int i =295;i<=420;i++)bresenhamLine(g,320,i,330,i); //hand
		for(int i =295;i<=305;i++)bresenhamLine(g,182,i,207,i); //eye low<l>
		for(int i =280;i<=290;i++)bresenhamLine(g,137,i,177,i); //eye top<l>
		//for(int i =230;i<=280;i++)bresenhamLine(g,285,i,300,i); //eye<r>
		for(int i =425;i<=445;i++)bresenhamLine(g,335,i,345,i); // tail low
		for(int i =435;i<=445;i++)bresenhamLine(g,350,i,370,i);
		for(int i =420;i<=430;i++)bresenhamLine(g,375,i,395,i);
		for(int i =405;i<=415;i++)bresenhamLine(g,400,i,430,i);
		for(int i =390;i<=400;i++)bresenhamLine(g,435,i,455,i);
		for(int i =375;i<=385;i++)bresenhamLine(g,460,i,470,i);
		for(int i =360;i<=370;i++)bresenhamLine(g,475,i,485,i);
		for(int i =345;i<=355;i++)bresenhamLine(g,490,i,503,i);//1
		for(int i =330;i<=340;i++)bresenhamLine(g,508,i,520,i);//1
		for(int i =295;i<=325;i++)bresenhamLine(g,525,i,535,i);//last2
		for(int i =260;i<=290;i++)bresenhamLine(g,540,i,550,i);//last1
		//for(int i =243;i<=265;i++)bresenhamLine(g,520,i,530,i);
		for(int i =280;i<=290;i++)bresenhamLine(g,335,i,345,i); //tail top
		for(int i =265;i<=275;i++)bresenhamLine(g,350,i,360,i);
		for(int i =242;i<=260;i++)bresenhamLine(g,365,i,375,i);
		for(int i =242;i<=252;i++)bresenhamLine(g,380,i,392,i);
		
	    }
	
	private void plot(Graphics g,int x,int y,int size) {
		g.fillRect(x, y, size, size);
	}

    
	public void bresenhamLine(Graphics g ,int x1, int y1, int x2, int y2)
	{ 
		int D = 0;
		 
	     int dx = Math.abs(x2 - x1);//ไม่ให้ความชันติดลบ
	     int dy = Math.abs(y2 - y1);
	 
	     int dx2 = 2 * dx; 
	     int dy2 = 2 * dy; 
	 
	     int ix = x1 < x2 ? 1 : -1; 
	     int iy = y1 < y2 ? 1 : -1;
	 
	     int x = x1;
	     int y = y1;
	 
	        if (dx >= dy) {
	            while (true) {
	                plot(g, x, y,5);
	                if (x == x2)
	                    break;
	                x += ix;
	                D += dy2;
	                if (D > dx) {
	                    y += iy;
	                    D -= dx2;
	                }
	            }
	        } else {
	            while (true) {
	                plot(g, x, y,5);
	                if (y == y2)
	                    break;
	                y += iy;
	                D += dx2;
	                if (D > dy) {
	                    x += ix;
	                    D -= dy2;
	                }
	            }
	        }
	    }	
			
	
    private static void bresenhamLine2(Graphics g,int x1,int y1,int x2,int y2) 
{ 
	 int D,dx,dy,x,y;
	 dx = Math.abs(x2-x1);
	 dy = Math.abs(y2-y1);
	 D = 2*dy-dx;
	 x = x1;
	 y = y1;
		 for (int i=x1;i<=x2 ;i++ )
	{
		g.fillRect(x,y,6,6);
		if (D>=0)
		{
			y++;
			D = D-2*dx;
		}
		D = D+2*dy;
		x++;
	}	
}
    
    private static void bresenhamLine3(Graphics g,int x1,int y1,int x2,int y2)
    { 
    	 int D,dx,dy,x,y;
    	 dx = Math.abs(x2-x1);
    	 dy = Math.abs(y2-y1);
    	 D = 2*dy-dx;
    	 x = x1;
    	 y = y1;
    	 for (int i = y1; i<=y2; i++)
    		 {
    			g.fillRect(x,y,6,6);
    			
    			if (D >= 0) {
    				y++;
    				D -= 2*dx;
    			}
    				D += 2*dy;
      }	
    }
		
    private void IntegrateX(Graphics g,int x1,int y1,int x2,int y2){
	    for(int x =x1; x<=x2;x++){
	        bresenhamLine(g,x,y1,x,y2);
	    }
      }
	
	
    public static void main(String[]args) {
    	Assignment1_61050956 x = new Assignment1_61050956();
      	
      	JFrame f = new JFrame();
      	f.add(x);
        f.setTitle("Assignment1_61050956");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
   }
}
