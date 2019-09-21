package ru.redserver.assetsrenamer;

public enum Action {

	DECODE("Décoder - renommer pour édition"),
	ENCODE("Encoder - créer un nouvel index");

	private final String title;

	Action(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
