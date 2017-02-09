public class Tsilinder{
	double r, h;
	public Tsilinder(double raadius, double korgus){
		if (raadius<=0){throw new RuntimeException("Raadius ei sobi!!");}
		if (korgus<=0){throw new RuntimeException("Korgus ei sobi!!");}
		r = raadius;
		h = korgus;
	}
	public double pindala(){
		return 2*Math.PI*Math.pow(r, 2);
	}
	public double ruumala(){
		return pindala()*h;
	}
	public double kulgpindala(){
		return 2*Math.PI*r*h;
	}
	public double taispindala(){
		return 2*pindala()+kulgpindala(); 
	}
}