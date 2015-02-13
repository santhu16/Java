public abstract class Odin {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void strength();
	public abstract void attire();
	public abstract void trait();

	public void run() {
		strength();
		attire();
		trait();
	}

}
