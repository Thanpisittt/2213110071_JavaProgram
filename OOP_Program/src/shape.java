
public abstract class shape {
		private String color ; 
		
		public shape(String color) {
			this.color = color;
		}
		public shape() {
			color = null;
		}
		//abstract method
		public abstract double getArea();
		
		//return string in form "color = [color]"
		public String toString() {
			return "color = "+this.color;
		}
}
