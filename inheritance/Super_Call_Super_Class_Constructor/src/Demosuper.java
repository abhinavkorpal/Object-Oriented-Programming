// A complete implementation of BoxWeight
class Box {
	private double width;
	private double height;
	private double depth;

	// construct clone of an object
	Box(Box ob) { // passing object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// constructor used when no dimensions specified
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	// constructor used when cube is created
	Box(double len){
		width = height = depth = len;
	}
	
	// compute and return volume
	double volume(){
		return width * height * depth;
	}
}

class Boxweight extends Box {
	double weight; // weight of box
	
	// construct clone of an object
	Boxweight(Boxweight ob){ // pass object to constructor
		super(ob);
		weight = ob.weight;
	}
	
	// constructor when all parameter are specified
	Boxweight(double w, double h, double d, double m) {
		super(w, h, d); // call superclass constructor
		weight = m;
	}
	
	// default constructor
	Boxweight() {
		super();
		weight = -1;
	}
	
	
	// constructor use when cube is created
	Boxweight(double len, double m){
		super(len);
		weight = m;
	}
}

class Demosuper {
	public static void main(String args[]){
		Boxweight mybox1 = new Boxweight(10, 20, 15, 34.3);
		Boxweight mybox2 = new Boxweight(2, 3, 4, 0.076);
		Boxweight mybox3 = new Boxweight();
		Boxweight mycube = new Boxweight(3, 2);
		Boxweight myclone = new Boxweight(mybox1);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println();
		
		vol = mybox3.volume();
		System.out.println("volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println();
		
		vol = myclone.volume();
		System.out.println("volume of myclone is " + vol);
		System.out.println("Weight of myclone is " + mycube.weight);
		System.out.println();
		
		vol = mycube.volume();
		System.out.println("volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
	}
	

}
