package syntax.lecturesAndExamples.inheritance_poly;

class SuperHero extends Person {

	private String alterEgo;

	public SuperHero(String name, String alterEgo) {
		super(name);
		this.alterEgo = alterEgo;
	}

	// Gets the alter ego
	@Override
	public String getName() {
		return alterEgo;
	}

	public String getSecretIdentity() {
		return super.getName();
	}
}