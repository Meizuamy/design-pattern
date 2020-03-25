public class Bouilli extends DodishTemplate
{
	@Override
	public void preparation(){
		System.out.println("切土豆和肉");
	}

	@Override
	public void doing(){
		System.out.println("将切好的土豆和肉一起煸煮。");
	}

	@Override
	public void carriedDishs(){
		System.out.println("将做好的红烧肉放到碗里。");
	}
}