
public abstract class DodishTemplate{
	/*
	*
	*����Ĺ���
	*/
	protected void dodish(){
		this.preparation();
		this.doing();
		this.carriedDishs();
	}

	public abstract void preparation();

	public abstract void doing();

	public abstract void carriedDishs();
}
