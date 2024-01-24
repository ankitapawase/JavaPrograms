package designpattern;

interface Shape{
	void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing Circle .");
	}
}

class Rectagle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing Rectagle .");
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing Square .");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectagle"))
			return new Rectagle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
			else
				return null;
		
	}
}
public class FactoryPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory =new ShapeFactory();
//		Shape shape = shapeFactory.getShape("Circle");
		Shape shape;
		shape = shapeFactory.getShape("Circle");
		shape.draw();
		shape = shapeFactory.getShape("Rectagle");
		shape.draw();
		shape = shapeFactory.getShape("Square");
		shape.draw();
	}

}
