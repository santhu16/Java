public enum Colours {
	Violet("Daffodils"), Indigo("Jet"), Blue("Sky"), Green("Grass"), 
	Yellow("Juice"), Orange("Sun"), Red("Face");

	private String name;

	private Colours(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "The name of the colour is: " + name;
	}
}
