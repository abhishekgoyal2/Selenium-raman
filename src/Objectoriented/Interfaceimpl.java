package Objectoriented;

public class Interfaceimpl implements TestInterface1 {

	int width =2;
	int height;
	int length=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

		@Override
		public int Area() {
			// TODO Auto-generated method stub
			return width*width	;
		}
		@Override
		public int cube() {
			// TODO Auto-generated method stub
			return width*width*width;
		}
		@Override
		public int recArea() {
			// TODO Auto-generated method stub
			return length*width;
		}
		
	}

