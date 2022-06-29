package gameZ;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Tahta {
	
	private int[][] oyunMatrisi;
	private ArrayList<Oyuncu> oyuncular = new ArrayList<Oyuncu>();
	
	public Tahta(int x, int y)
	{
		Random rand = new Random();
		int randSayi;
		oyunMatrisi = new int[y][x];
		for (int i = 0; i < y; i++)
		{
			for (int j = 0; j < x; j++)
			{
				randSayi = rand.nextInt(9) + 1;
				oyunMatrisi[j][i] = randSayi;
			}
		}
	}
	
	public int[][] getOyunMatrisi()
	{
		return oyunMatrisi;
	}
	public void setOyunMatrisi(int[][] oyunMatrisi)
	{
		this.oyunMatrisi = oyunMatrisi;
	}
	
	public ArrayList<Oyuncu> getOyuncular()// Oyuncu tipinde array yaratým içine atýp arrayi return edebilirdim ama bu daha kolay geldi :d
	{
		return oyuncular;
	}
	public void setOyuncular(ArrayList<Oyuncu> o)// ayný þekilde arrayden alýp array liste add yapabilrdim. clearladýktan sonra tabi
	{
		oyuncular.clear();
		oyuncular.addAll(o);
		for(Oyuncu player: o)
		{
			oyunMatrisi[player.getY()][player.getX()] = 0;
		}
	}
	
	public boolean oyunBittiMi()
	{
		int kalanPuan = 0;
		for (int i = 0; i < oyunMatrisi.length; i++)
		{
			for (int j = 0; j < oyunMatrisi[i].length; j++)
			{
				kalanPuan += oyunMatrisi[j][i]; 
			}
		}
		
		if (kalanPuan > 0)
		{
			return false;
		}
		return true;
	}
	
	public void oyunuOynat()
	{
		tahtayiYazdir();
		Scanner sc = new Scanner(System.in);
		String girdi;
		while(!oyunBittiMi())
		{
			for(Oyuncu o: oyuncular)
			{
				System.out.printf("Sayýn %s, lütfen hareket yönünüzü seçiniz (b, k, d, g):\n",o.oyuncuAdi);
				girdi = sc.nextLine();
				if(girdi.length() != 1)
				{
					System.out.println("Geçersiz bir yön girdiniz!.. Yerinizde kaldýnýz!..");
				}
				else
				{
					o.hareketEt(girdi.charAt(0), oyunMatrisi[o.getY()].length, oyunMatrisi.length);
				}
				
				o.setToplamPuan(o.getToplamPuan() + oyunMatrisi[o.getY()][o.getX()]);
				oyunMatrisi[o.getY()][o.getX()] = 0;
				
				if(oyunBittiMi())
					break;
				tahtayiYazdir();
				System.out.println();
			}
		}
		
		sc.close();
	}
	
	public void tahtayiYazdir()
	{
		
		boolean yazdiMi = false;
		for (int i = 0; i < oyunMatrisi.length; i++)
		{
			for (int j = 0; j < oyunMatrisi[i].length; j++)
			{
				for (Oyuncu o: oyuncular)
				{
					if (o.getX() == j && o.getY() == i)
					{
						yazdiMi = true;
						System.out.printf("%s  ",o.oyuncuAdi);
						break;
					}
				}
				if (yazdiMi)
				{
					yazdiMi = false;
					continue;
				}
				System.out.printf("%d  ", oyunMatrisi[i][j]);
			}
			System.out.println();
		}
		
		for(Oyuncu o: oyuncular)
		{
			System.out.printf("%s toplam = %d\n", o.oyuncuAdi, o.getToplamPuan());
			
		}
		
	}
	
}
