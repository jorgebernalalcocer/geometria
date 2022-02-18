
public class Circulo_JBA extends FiguraGeometrica_JBA {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JBA(double r, String tipoFigura) {
		super(tipoFigura);
		if (radio<0){
			Math.abs(radio);
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
