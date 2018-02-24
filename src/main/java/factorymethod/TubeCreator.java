package factorymethod;

public class TubeCreator implements Creator {
	@Override
	public Light createLight() {
		return new TubeLight();
	}
}
