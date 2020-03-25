public class EggsWithTomato extends DodishTemplate
{
	@Override
	public void preparation(){
		System.out.println("洗切西红柿，并打鸡蛋");
	}

	@Override
	public void doing(){
		System.out.println("鸡蛋倒入锅中，然后倒入西红柿一起翻炒。");
	}

	@Override
	public void carriedDishs(){
		System.out.println("将炒好的西红柿装入盘子里，给客人吃。");
	}
}