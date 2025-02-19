public class ResizableCircle extends Circle implements Resizeble{
	
	ResizableCircle(double radius) {
		super(radius);				 
	}
	
	@Override
	public void resize(int percent) {
		this.radius *= percent / 100.0;
	}
	
	public double resize() {
		return radius;
	}
	
	
	public String toString() {
		return "ResizableCircle[" + super.toString() + "]";
	}
}