package gameZ;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tahta tahta = new Tahta(8,8);
		
		ArrayList<Oyuncu> oyuncuListesi = new ArrayList<Oyuncu>();
		oyuncuListesi.add(new Oyuncu("A", 0, 0));
		oyuncuListesi.add(new Oyuncu("B", 5, 6));
	
		tahta.setOyuncular(oyuncuListesi);
		
		tahta.oyunuOynat();
	}

}
