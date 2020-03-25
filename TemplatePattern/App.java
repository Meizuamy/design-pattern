public class App
{
	public static void main(String[] args){
		DodishTemplate eggsWithTomato = new EggsWithTomato();
		eggsWithTomato.dodish();
		System.out.println("--------------------");
		DodishTemplate bouilli = new Bouilli();
		bouilli.dodish();
	}

}