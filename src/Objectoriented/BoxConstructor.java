package Objectoriented;

public class BoxConstructor {
	
	 double width, height, depth;
	 
	    // constructor used when all dimensions
	    // specified
	    BoxConstructor(double w, double h, double d)
	    {
	       this.width = w;
	        this.height = h;
	        this.depth = d;
	    }
	 
	    // constructor used when no dimensions
	    // specified
	    BoxConstructor()
	    {
	        width = height = depth = 0;
	    }
	 
	    // constructor used when cube is created
	    BoxConstructor(double len)
	    {
	        width = height = depth = len;
	    }
	 
	    // compute and return volume
	    double volume()
	    {
	        return width * height * depth;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BoxConstructor box1=new BoxConstructor();
BoxConstructor box2=new BoxConstructor(2.4);
BoxConstructor box3=new BoxConstructor(2,4,5);

double vol =box2.volume();

System.out.println(vol);
//	
	}

}
