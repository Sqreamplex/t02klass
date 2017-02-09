public class too1{
	public static void main(String[] args){
		Tsilinder s = new Tsilinder (3, 5);
		System.out.println("Pindala on: "+Math.round(s.pindala()));
		System.out.println("Ruumala on: "+Math.round(s.ruumala()));
		System.out.println("Kulgpindala: "+Math.round(s.kulgpindala()));
		System.out.println("Taispindala on: "+Math.round(s.taispindala()));
	}
}