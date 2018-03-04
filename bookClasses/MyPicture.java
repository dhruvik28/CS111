public class MyPicture extends Picture{

	private String filename;
	private String description;
	private Picture v;
	
	public MyPicture(String filename, String description){
		this.filename = filename;
		this.description = description;
		this.v = new Picture(filename);
	}

	public String toString(){
		int w = v.getWidth();
		int h = v.getHeight();

		return filename + " " + w + " " + "x" + " " + h + " " + description;
	}

	public boolean equals(MyPicture p){
		if(p.filename == this.filename && p.description == this.description){
			return true;
		}else{
			return false;
		}
	}

	public Picture negative(){
		Picture p = v;
		int w = p.getWidth();
		int h = p.getHeight();

		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){

				int red = p.getPixel(i,j).getRed();
				int green = p.getPixel(i,j).getGreen();
				int blue = p.getPixel(i,j).getBlue();

				p.getPixel(i,j).setRed(255 - red);
				p.getPixel(i,j).setGreen(255 - green);
				p.getPixel(i,j).setBlue(255 - blue);
			}
		}
		return p;
	}

	public double redness(){
		int w = v.getWidth();
		int h = v.getHeight();
		double count = 0;
		double total = 0;

		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				total++;
				int red = v.getPixel(i,j).getRed();
				int green = v.getPixel(i,j).getGreen();
				int blue = v.getPixel(i,j).getBlue();

				if(red > blue && red > green){
					count++;
				}
			}
		}
		double rednessScore = count/total;
		return rednessScore;
	}

	public void flipHorizontal(){
		int h = v.getHeight();
		int w = v.getWidth();

		for(int i = 0; i < w/2; i++){
			for(int j = 0; j < h; j++){
				int temp = v.getBasicPixel(i,j);
				v.setBasicPixel(w-1-i,j,temp);
			}
		}
		return;
	}

	public void flipVertical(){
		int h = v.getHeight();
		int w = v.getWidth();

		for(int i = 0; i < w; i++){
			for(int j = 0; j < h/2; j++){
				int temp = v.getBasicPixel(i,j);
				v.setBasicPixel(i,h-1-j,temp);
			}
		}
		return;
	}


	public static void main(String[] args){

		//MyPicture p = new MyPicture("Test.jpg","red car");
		//MyPicture v = new MyPicture("Test.jpg","red car");

		//String output = p.toString();
		//boolean check = p.equals(v);

		// Picture f = p.negative();
		// f.write("C:\\Users\\Dhruvik\\Downloads\\Test-mod.jpg");

		//System.out.println(check);

		//System.out.println(p.redness());

		//p.flipHorizontal();
		//p.write("C:\\Users\\Hardik\\Downloads\\Testmodified-Horizontal.JPG");

		//p.flipVertical();
	}
}