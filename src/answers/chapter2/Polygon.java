package answers.chapter2;

public class Polygon {
	String shape;
	int width,height;
	double area;
	
	Polygon(String shape, int width){
		this.shape=shape;
		this.width=width;		
	}
	
	Polygon(String shape, int width, int height){
		this(shape, width);	
		this.height=height;
	}
	//??????
	void calcArea(int width) {
		area=width*width;		
	}
//????, ??????
	void calcArea(int width,int height,int s) {
		if(s==1)
			area=(width*height)/2;
		else if(s==2)
			area=width*height;
	}
	//???
	void printArea() {
		System.out.println(shape);
		System.out.println("area"+area);
	}


}
