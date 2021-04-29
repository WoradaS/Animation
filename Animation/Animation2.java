import java.awt.*;
import java.awt.image.*;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.Color;
import javax.swing.*;
public class Assignment2_61050956 extends JPanel {
    public static void main(String[] args) {
        Assignment2_61050956 m = new Assignment2_61050956();
        JFrame f=new JFrame();
        f.add(m);
        f.setTitle("VALENTINEíS DAY");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
	 

    public  void  paint(Graphics g){
             //letter bg
     //1
        {
            int[] x = {71, 87, 134};
            int[] y = {242, 249, 217};
            paintComponent(g, x, y,98,236,Color.decode("#fbb77a"));
            g.setColor(Color.decode("#fbb77a"));
        }
        //2
        {
            int[] x = {71, 134, 134};
            int[] y = {242, 205, 217};
            paintComponent(g, x, y,113,222,Color.decode("#e5c298"));
            g.setColor(Color.decode("#e5c298"));
        }
        //3
        {
            int[] x = {87, 134, 235};
            int[] y = {249, 217, 351};
            paintComponent(g, x, y,152,273,Color.decode("#b0835a"));
            g.setColor(Color.decode("#e5c298"));
        }
        //4
        {
            int[] x = {268, 342, 340};
            int[] y = {110, 56, 79};
            paintComponent(g, x, y,317,82,Color.decode("#ffdc92"));
            g.setColor(Color.decode("#e5c298"));
        }
        //5
        {
            int[] x = {340, 268, 229};
            int[] y = {79, 110, 129};
            paintComponent(g, x, y,279,106,Color.decode("#bf9b7b"));
            g.setColor(Color.decode("#e5c298"));
        }
        //6
        {
            int[] x = {340, 229, 339};
            int[] y = {79, 129, 114};
            paintComponent(g, x, y,303,108,Color.decode("#bc9f7d"));
            g.setColor(Color.decode("#e5c298"));
        }
        //7
        {
            int[] x = {339, 229, 316};
            int[] y = {114, 129, 140};
            paintComponent(g, x, y,295,128,Color.decode("#e2c18c"));
            g.setColor(Color.decode("#e5c298"));
        }
        //8
        {
            int[] x = {316, 339, 342};
            int[] y = {140, 114, 175};
            paintComponent(g, x, y,333,143,Color.decode("#bb9059"));
            g.setColor(Color.decode("#e5c298"));
        }
     //9
        {
            int[] x = {342, 340, 418};
            int[] y = {56, 79, 126};
            paintComponent(g, x, y,367,87,Color.decode("#f8ddad"));
            g.setColor(Color.decode("#e5c298"));
        }
        //10
        {
            int[] x = {340, 400, 418};
            int[] y = {79, 129, 126};
            paintComponent(g, x, y,386,112,Color.decode("#e7c89a"));
            g.setColor(Color.decode("#e5c298"));
        }
        //11
        {
            int[] x = {340, 400, 383};
            int[] y = {79, 129, 139};
            paintComponent(g, x, y,375,116,Color.decode("#cca071"));
            g.setColor(Color.decode("#e5c298"));
        }
        //12
        {
            int[] x = {340, 339, 383};
            int[] y = {79, 114, 139};
            paintComponent(g, x, y,354,111,Color.decode("#caa070"));
            g.setColor(Color.decode("#e5c298"));
        }
        //13
        {
            int[] x = {339, 368, 383};
            int[] y = {114, 149, 139};
            paintComponent(g, x, y,364,134,Color.decode("#efc686"));
            g.setColor(Color.decode("#e5c298"));
        }
        //14
        {
            int[] x = {339, 342, 368};
            int[] y = {114, 175, 149};
            paintComponent(g, x, y,350,146,Color.decode("#edbe8a"));
            g.setColor(Color.decode("#e5c298"));
        } 
        //15
        {
            int[] x = {482, 482, 553};
            int[] y = {297, 325, 297};
            paintComponent(g, x, y,506,307,Color.decode("#d89463"));
            g.setColor(Color.decode("#e5c298"));
        } 
        //16
        {
            int[] x = {482, 482, 553};
            int[] y = {297, 325, 297};
            paintComponent(g, x, y,506,307,Color.decode("#b0835a"));
            g.setColor(Color.decode("#e5c298"));
        } 
        //17
        {
            int[] x = {482, 482, 553};
            int[] y = {297, 200, 297};
            paintComponent(g, x, y,506,265,Color.decode("#d89463"));
            g.setColor(Color.decode("#e5c298"));
        }
		
		//À—«„®
        {//1
            int[] x = {224, 269, 251};
            int[] y = {115, 113, 131}; //300,333
            paintComponent(g, x, y,248,119,Color.decode("#c32025"));
        }
        //2
        {
            int[] x = {269, 251, 302};
            int[] y = {113, 131, 159};
            paintComponent(g, x, y,274,134,Color.decode("#b80f0a"));
        }
        //3
        {
            int[] x = {302, 251, 274};
            int[] y = {159, 131, 175};
            paintComponent(g, x, y, 275,155,Color.decode("#e5343a"));
        }
        //4
        {
            int[] x = {251, 274, 219};
            int[] y = {131, 175, 175};
            paintComponent(g, x, y,248,160,Color.decode("#f0afad"));
        }//5
        {
            int[] x = {224, 159, 195};
            int[] y = {115, 147, 147};
            paintComponent(g, x, y,192,136,Color.decode("#d1181d"));
        }//6
        {
            int[] x = {195, 159, 135};
            int[] y = {147, 147, 186};
            paintComponent(g, x, y,163,161,Color.decode("#d4070c"));
        }
        //7
        {
            int[] x = {135, 159, 135};
            int[] y = {186, 171, 239};
            paintComponent(g, x, y,143,199,Color.decode("#c3232b"));
        }//8
        {
            int[] x = {135, 155, 159};
            int[] y = {239, 269, 171};
            paintComponent(g, x, y,149,226,Color.decode("#c42124"));
        }
		{//9
            int[] x = {135, 182, 135};
            int[] y = {239, 317, 285};
            paintComponent(g, x, y,150,280,Color.decode("#940b12"));
        }
		{//10
            int[] x = {221, 182, 155};
            int[] y = {299, 317, 269};
            paintComponent(g, x, y,182,300,Color.decode("#dd1b1c"));
        }
		{//11
            int[] x = {221, 182, 253};
            int[] y = {299, 317, 364};
            paintComponent(g, x, y,218,326,Color.decode("#d00300"));
        }
		{//12
            int[] x = {291, 221, 253};
            int[] y = {347, 299, 364};
            paintComponent(g, x, y,255,336,Color.decode("#d00300"));
        }
		{//13
            int[] x = {251, 195, 219};
            int[] y = {131, 147, 175};
            paintComponent(g, x, y,221,151,Color.decode("#fdcbce"));
        }
		{//14
            int[] x = {238, 274, 219};
            int[] y = {248, 175, 175};
            paintComponent(g, x, y,243,199,Color.decode("#f89290"));
        }
		{//15
            int[] x = {238, 189, 219};
            int[] y = {248, 200, 175};
            paintComponent(g, x, y,215,205,Color.decode("#fe9a9c"));
        }
		{//16
            int[] x = {238, 189, 155};
            int[] y = {248, 200, 269};
            paintComponent(g, x, y,194,239,Color.decode("#ff8286"));
        }

		 //17
        {
            int[] x = {189, 155, 159};
            int[] y = {200, 269, 171};
            paintComponent(g, x, y,167,213,Color.decode("#fea0a0"));
        }
		//8
        {
            int[] x = {135, 155, 159};
            int[] y = {239, 269, 171};
            paintComponent(g, x, y,149,226,Color.decode("#c42124"));
        }
		{//18
            int[] x = {159, 189, 219};
            int[] y = {171, 200, 175};
            paintComponent(g, x, y,182,189,Color.decode("#fac1c7"));
        }
		{//19 color
            int[] x = {159, 195, 219};
            int[] y = {171, 147, 175};
            paintComponent(g, x, y,190,165,Color.decode("#fbe9db"));
        }
		{//20
            int[] x = {238, 221, 155};
            int[] y = {248, 299, 269};
            paintComponent(g, x, y,200,270,Color.decode("#fb3336"));
        }
		{//21
            int[] x = {251, 195, 224};
            int[] y = {131, 147, 115};
            paintComponent(g, x, y,225,130,Color.decode("#e71a17"));
        }
		{//2.1
            int[] x = {238, 221, 322};
            int[] y = {248, 299, 271};
            paintComponent(g, x, y,280,271,Color.decode("#fc1a1c"));
        }
		{//22
            int[] x = {291, 221, 322};
            int[] y = {347, 299, 271};
            paintComponent(g, x, y,280,300,Color.decode("#fd0002"));
        }
		{//23
            int[] x = {291, 391, 322};
            int[] y = {347, 337, 271};
            paintComponent(g, x, y,350,320,Color.decode("#f40403"));
        }
		{//24
            int[] x = {302, 391, 291};
            int[] y = {396, 337, 347};
            paintComponent(g, x, y,300,360,Color.decode("#b90204"));
        }
		{//25
            int[] x = {302, 253, 291};
            int[] y = {396, 364, 347};
            paintComponent(g, x, y,280,380,Color.decode("#ae0a08"));
        }
		{//26
            int[] x = {302, 391, 412};
            int[] y = {396, 337, 351};
            paintComponent(g, x, y,370,365,Color.decode("#a80500"));
        }
		{//27
            int[] x = {437, 391, 412};
            int[] y = {319, 337, 351};
            paintComponent(g, x, y,420,330,Color.decode("#ba0204"));
        }
		{//28
            int[] x = {437, 391, 322};
            int[] y = {319, 337, 271};
            paintComponent(g, x, y,390,310,Color.decode("#dc0201"));
        }
		{//29
            int[] x = {437, 410, 322}; //322.271
            int[] y = {319, 238, 271};
            paintComponent(g, x, y,410,270,Color.decode("#f90101"));

        }
		{//30
            int[] x = {355, 410, 322};
            int[] y = {220, 238, 271}; //355.220
            paintComponent(g, x, y,350,230,Color.decode("#f72c28"));
        }
		{//31
            int[] x = {355, 325, 322};
            int[] y = {220, 234, 271}; //325.234
            paintComponent(g, x, y,330,250,Color.decode("#f3120e"));
        }
		{//32
            int[] x = {238, 325, 322};
            int[] y = {248, 234, 271}; //238.248
            paintComponent(g, x, y,280,250,Color.decode("#fb0102"));
        }
		{//33
            int[] x = {238, 325, 330};
            int[] y = {248, 234, 190}; //330.190
            paintComponent(g, x, y,300,220,Color.decode("#fa2223"));
        }
		{//34
            int[] x = {238, 274, 330};
            int[] y = {248, 175, 190}; 
            paintComponent(g, x, y,270,210,Color.decode("#e43b38"));
        }
		{//35
            int[] x = {302, 274, 330};
            int[] y = {159, 175, 190}; 
            paintComponent(g, x, y,300,170,Color.decode("#ba0001"));
        }
		{//36
            int[] x = {269, 318, 302};
            int[] y = {113, 143, 159};
            paintComponent(g, x, y,300,140,Color.decode("#842928"));
        }
		{//37
            int[] x = {330, 318, 302};
            int[] y = {190, 143, 159};
            paintComponent(g, x, y,320,160,Color.decode("#703342"));
        }
		{//38
            int[] x = {330, 318, 343};
            int[] y = {190, 143, 178};
            paintComponent(g, x, y,330,160,Color.decode("#784c5b"));
        }
        {//39
            int[] x = {355, 325, 330};
            int[] y = {220, 234, 190}; //330.190
            paintComponent(g, x, y,340,215,Color.decode("#f3140f"));
        }
		{//40
            int[] x = {355, 376, 330};
            int[] y = {220, 187, 190}; //376.187
            paintComponent(g, x, y,356,200,Color.decode("#e6302f"));
        }
		{//41
            int[] x = {376, 330, 384};
            int[] y = {187, 190, 165}; //384.165
            paintComponent(g, x, y,360,175,Color.decode("#f94d4b"));
        }
        {//42
            int[] x = {368, 330, 384};
            int[] y = {150, 190, 165}; //384.165
            paintComponent(g, x, y,360,170,Color.decode("#cc0d15"));
        }
        {//43
            int[] x = {368, 400, 384};
            int[] y = {150, 130, 165}; //384.165
            paintComponent(g, x, y,385,145,Color.decode("#c50000"));
        }
		{//44
            int[] x = {434, 400, 384};
            int[] y = {140, 130, 165}; //434.140
            paintComponent(g, x, y,400,150,Color.decode("#d71515"));
        }
		{//45
            int[] x = {434, 425, 384};
            int[] y = {140, 178, 165}; //425.178
            paintComponent(g, x, y,410,165,Color.decode("#fab6a9"));
        }
		{//46
            int[] x = {434, 400, 437};
            int[] y = {140, 130, 123}; 
            paintComponent(g, x, y,420,133,Color.decode("#993d40"));
        }
		{//47
            int[] x = {376, 425, 384};
            int[] y = {187, 178, 165}; 
            paintComponent(g, x, y,400,177,Color.decode("#fecdd0"));
        }
		{//48
            int[] x = {410, 425, 492};
            int[] y = {238, 178, 237}; 
            paintComponent(g, x, y,460,210,Color.decode("#ed1516"));
        }
		{//49
            int[] x = {376, 355, 421};//421.206
            int[] y = {187, 220, 206}; 
            paintComponent(g, x, y,390,200,Color.decode("#f78383"));
        }
        {//51
            int[] x = {376, 425, 421};//421.206
            int[] y = {187, 178, 206}; 
            paintComponent(g, x, y,400,192,Color.decode("#f7a7a8"));
        }
		{//50
            int[] x = {410, 355, 421};//421.206
            int[] y = {238, 220, 206}; 
            paintComponent(g, x, y,390,219,Color.decode("#f96160"));
        }
		{//52
            int[] x = {475, 425, 492}; //475.165
            int[] y = {165, 178, 237}; 
            paintComponent(g, x, y,450,192,Color.decode("#d50302"));
        }
		{//53
            int[] x = {475, 425, 434};
            int[] y = {165, 178, 140}; 
            paintComponent(g, x, y,450,150,Color.decode("#d92d29"));
        }
		{//54
            int[] x = {475, 487, 434};
            int[] y = {165, 132, 140}; 
            paintComponent(g, x, y,450,150,Color.decode("#a61012"));
        }
		{//55
            int[] x = {437, 487, 434};
            int[] y = {123, 132, 140}; 
            paintComponent(g, x, y,460,130,Color.decode("#8c4251"));
        }
		{//56
            int[] x = {437, 410, 492};
            int[] y = {319, 238, 237};
            paintComponent(g, x, y,450,290,Color.decode("#dc0201"));
        }
		{//57
            int[] x = {437, 492, 492};
            int[] y = {319, 295, 237};
            paintComponent(g, x, y,474,290,Color.decode("#a70302"));
        }
		{//58
            int[] x = {437, 481, 412};
            int[] y = {319, 324, 351};
            paintComponent(g, x, y,450,330,Color.decode("#a10001"));
        }
		{//59
            int[] x = {437, 481, 492};
            int[] y = {319, 324, 295};
            paintComponent(g, x, y,475,305,Color.decode("#76180c"));
        }
		{//60
            int[] x = {519, 481, 492};
            int[] y = {309, 324, 295};
            paintComponent(g, x, y,500,315,Color.decode("#62352f"));
        }
		{//61
            int[] x = {519, 525, 492};
            int[] y = {309, 240, 295};
            paintComponent(g, x, y,505,290,Color.decode("#84394e"));
        }
		{//62
            int[] x = {492, 525, 492};
            int[] y = {237, 240, 295};
            paintComponent(g, x, y,500,260,Color.decode("#8a1616"));
        }
		{//61
            int[] x = {519, 525, 544};
            int[] y = {309, 240, 269};
            paintComponent(g, x, y,530,282,Color.decode("#7e697c"));
        }
		{//64
            int[] x = {542, 525, 544};
            int[] y = {211, 240, 269};
            paintComponent(g, x, y,535,240,Color.decode("#6d4b66"));
        }
		{//65
            int[] x = {542, 525, 510};
            int[] y = {211, 240, 175};
            paintComponent(g, x, y,530,210,Color.decode("#7f3d49"));
        }
		{//66
            int[] x = {492, 525, 510};
            int[] y = {237, 240, 175};
            paintComponent(g, x, y,510,220,Color.decode("#991115"));
        }
		{//67
            int[] x = {492, 475, 510};
            int[] y = {237, 165, 175};
            paintComponent(g, x, y,495,200,Color.decode("#b00106"));
        }
		{//68
            int[] x = {487, 475, 510};
            int[] y = {132, 165, 175};
            paintComponent(g, x, y,495,150,Color.decode("#8e2835"));
        }
		{//69
            int[] x = {487, 523, 510};
            int[] y = {132, 160, 175};
            paintComponent(g, x, y,500,150,Color.decode("#834353"));
        }
		{//70
            int[] x = {542, 523, 510};
            int[] y = {211, 160, 175};
            paintComponent(g, x, y,530,180,Color.decode("#834a5d"));
        }
         //letter
        
        //1
        {
            int[] x = {71, 87, 66};
            int[] y = {242, 249, 333};
            paintComponent(g, x, y,75,275,Color.decode("#ca7f3e"));
        }
        //2
        {
            int[] x = {87, 102, 66};
            int[] y = {249, 402, 333};
            paintComponent(g, x, y,85,328,Color.decode("#e3a25e"));
        }
        //3
        {
            int[] x = {66, 102, 56};
            int[] y = {333, 402, 421}; 
            paintComponent(g, x, y,75,386,Color.decode("#e49141"));
        }
        //4
        {
            int[] x = {49, 102, 56};
            int[] y = {532, 402, 421}; //207,1355
            paintComponent(g, x, y,69,452,Color.decode("#c77539"));
        }
        //5
        {
            int[] x = {49, 102, 99};
            int[] y = {532, 402, 498}; //250,1432
            paintComponent(g, x, y,84,478,Color.decode("#d98d53"));
        }
        //6
        {
            int[] x = {49, 99, 99};
            int[] y = {532, 532, 498}; 
            paintComponent(g, x, y,83,521,Color.decode("#c99774"));
        }
        //7
        {
            int[] x = {87, 102, 111};
            int[] y = {249, 402, 268};
            paintComponent(g, x, y,100,307,Color.decode("#f2b976"));
        }
        //8
        {
            int[] x = {111, 102, 134};
            int[] y = {268, 402, 285};
            paintComponent(g, x, y,116,319,Color.decode("#f8d39c"));
        }
        //9
        {
            int[] x = {134, 102, 158};
            int[] y = {285, 402, 405};
            paintComponent(g, x, y,132,364,Color.decode("#fde0b4"));
        }
        //10
        {
            int[] x = {102, 158, 153};
            int[] y = {402, 405, 468};
            paintComponent(g, x, y,138,425,Color.decode("#fadbac"));
        }
        //11
        {
            int[] x = {102, 99, 153};
            int[] y = {402, 498, 468};
            paintComponent(g, x, y,118,456,Color.decode("#e7c190"));
        }
        //12
        {
            int[] x = {99, 153, 217};
            int[] y = {498, 468, 532};
            paintComponent(g, x, y,157,500,Color.decode("#e0ba8b"));
        }
        //13
        {
            int[] x = {99, 99, 217};
            int[] y = {498, 532, 532}; //À“√·≈È«
            paintComponent(g, x, y,139,523,Color.decode("#dca879"));
        }
        //14
        {
            int[] x = {111, 158, 181};
            int[] y = {268, 405, 317};
            paintComponent(g, x, y,150,330,Color.decode("#fdf1cb"));
        }
        //15
        {
            int[] x = {158, 153, 240};
            int[] y = {405, 468, 426};
            paintComponent(g, x, y,184,433,Color.decode("#fee5bd"));
        }
        //16
        {
            int[] x = {240, 153, 217};
            int[] y = {426, 468, 532};
            paintComponent(g, x, y,203,476,Color.decode("#f2d3a7"));
        }
        //17
        {
            int[] x = {181, 158, 240};
            int[] y = {317, 405, 426};
            paintComponent(g, x, y,193,383,Color.decode("#fee8c3"));
        }
        //18
        {
            int[] x = {181, 240, 235};
            int[] y = {317, 426, 351};
            paintComponent(g, x, y,219,365,Color.decode("#ffecc7"));
        }
       //19
        {
            int[] x = {235, 240, 302};
            int[] y = {351, 426, 396};
            paintComponent(g, x, y,259,391,Color.decode("#ffe6c3"));
        }
        //20
        {
            int[] x = {240, 302, 293};
            int[] y = {426, 396, 488};
            paintComponent(g, x, y,279,437,Color.decode("#fee4c1"));
        }
        //21
        {
            int[] x = {240, 217, 293};
            int[] y = {426, 532, 488};
            paintComponent(g, x, y,250,482,Color.decode("#efce9b"));
        }
        //22
        {
            int[] x = {293, 217, 324};
            int[] y = {488, 532, 532};
            paintComponent(g, x, y,278,518,Color.decode("#e1bb8a"));
        }
        //23
        {
            int[] x = {302, 293, 370};
            int[] y = {396, 488, 505};
            paintComponent(g, x, y,322,463,Color.decode("#fddeaf"));
        }
        //24
        {
            int[] x = {293, 324, 370};
            int[] y = {488, 532, 505};
            paintComponent(g, x, y,329,509,Color.decode("#e2bc8b"));
        }
        //25
        {
            int[] x = {370, 324, 408};
            int[] y = {505, 532, 532};
            paintComponent(g, x, y,368,523,Color.decode("#dab183"));
        }
        //26
        {
            int[] x = {302, 414, 478};
            int[] y = {396, 351, 428};
            paintComponent(g, x, y,398,392,Color.decode("#fce0ae"));
        }
        //27
        {
            int[] x = {302, 370, 478};
            int[] y = {396, 505, 428};
            paintComponent(g, x, y,384,443,Color.decode("#f9d4a0"));
        }
        //28
        {
            int[] x = {478, 370, 492};
            int[] y = {428, 505, 519};
            paintComponent(g, x, y,447,484,Color.decode("#e4be8f"));
        }
        //29
        {
            int[] x = {370, 408, 492};
            int[] y = {505, 532, 519};
            paintComponent(g, x, y,424,519,Color.decode("#d6ad7f"));
        }
        //30
        {
            int[] x = {492, 408, 543};
            int[] y = {519, 532, 532};
            paintComponent(g, x, y,481,528,Color.decode("#bb8956"));
        }
        //31
        {
            int[] x = {414, 478, 482};
            int[] y = {351, 428, 325};
            paintComponent(g, x, y,458,368,Color.decode("#fed8a7"));
        }
        //32
        {
            int[] x = {478, 492, 553};
            int[] y = {428, 519, 504};
            paintComponent(g, x, y,508,484,Color.decode("#d5ac80"));
        }
        //33
        {
            int[] x = {492, 553, 543};
            int[] y = {519, 504, 532};
            paintComponent(g, x, y,530,519,Color.decode("#c7a079"));
        }
        //34
        {
            int[] x = {482, 478, 553};
            int[] y = {325, 428, 397};
            paintComponent(g, x, y,505,384,Color.decode("#f3cd9c"));
        }
        //35
        {
            int[] x = {478, 553, 553};
            int[] y = {428, 397, 504};
            paintComponent(g, x, y,528,443,Color.decode("#ddb486"));
        }
      //36
        {
            int[] x = {553, 533, 553};
            int[] y = {504, 532, 532};
            paintComponent(g, x, y,547,523,Color.decode("#9a653d"));
        }
        //37
        {
            int[] x = {482, 553, 524};
            int[] y = {325, 397, 311};
            paintComponent(g, x, y,520,345,Color.decode("#e9c392"));
        }
        //38
        {
            int[] x = {524, 553, 553};
            int[] y = {311, 397, 297};
            paintComponent(g, x, y,544,335,Color.decode("#e7b37a"));
        }

    }
    public void paintComponent(Graphics g,int[]xPoly,int[]yPoly,int x,int y,Color z) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.setColor(Color.WHITE);
        g2.fillPolygon(poly);
        buffer = floodFill(buffer, x, y, Color.WHITE.getRGB(), z.getRGB());
		g.setColor(z);
        g.drawPolygon(poly);
        g.drawImage(buffer, 0, 0, null);
		
    }
    public void paint( BufferedImage m , int x , int y , int replacement_clour) {
        m.setRGB(x,y,replacement_clour);
    }

    public BufferedImage floodFill(BufferedImage m, int x, int y, int target_colour, int replacement_colour) {
        paint(m, x, y, replacement_colour);
        Queue<Point> Q = new LinkedList<Point>();

        Q.add(new Point(x, y));
        while (!Q.isEmpty()) {
            Point Poly = Q.remove();

            if (Poly.x > 0 && Poly.y > 0 && Poly.x < m.getWidth() && Poly.y < m.getHeight()) {
                if (m.getRGB(Poly.x, Poly.y - 1) == target_colour)
                {
                    paint(m, Poly.x, Poly.y - 1, replacement_colour);
                    Q.add(new Point(Poly.x, Poly.y - 1));
                }

                if (m.getRGB(Poly.x, Poly.y + 1) == target_colour)
                {
                    paint(m, Poly.x, Poly.y + 1, replacement_colour);
                    Q.add(new Point(Poly.x, Poly.y + 1));
                }

                if (m.getRGB(Poly.x - 1, Poly.y) == target_colour)
                {
                    paint(m, Poly.x - 1, Poly.y, replacement_colour);
                    Q.add(new Point(Poly.x - 1, Poly.y));
                }

                if (m.getRGB(Poly.x + 1, Poly.y) == target_colour)
                {
                    paint(m, Poly.x + 1, Poly.y, replacement_colour);
                    Q.add(new Point(Poly.x + 1, Poly.y));
                }

            }
        }
        return m;
    }

}