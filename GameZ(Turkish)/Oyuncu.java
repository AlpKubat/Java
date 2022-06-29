package gameZ;

public class Oyuncu {

	String oyuncuAdi ;
	private int x;
	private int y;
	private int toplamPuan = 0;
	
	public Oyuncu(String adi, int x, int y)
	{
		this.oyuncuAdi = adi;
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getToplamPuan()
	{
		return toplamPuan;
	}
	public void setToplamPuan(int toplamPuan)
	{
		this.toplamPuan = toplamPuan;
	}
	
	public void puanEkle(int ek)
	{
		toplamPuan += ek;
	}
	
	public void hareketEt(char yon, int satir, int sutun)
	{
		if (yon == 'b' && x > 0)
		{
			x -= 1;
		}
		else if(yon == 'k' && y > 0)
		{
			y -= 1;
		}
		else if(yon == 'd' && x < (satir - 1))
		{
			x += 1;
		}
		else if(yon == 'g' && y < (sutun - 1))
		{
			y += 1;
		}
		else
		{
			System.out.println("Geçersiz bir yön girdiniz!.. Yerinizde kaldýnýz!..");
		}
	}
}
