package edu.interfaceone;

interface IVehicle {
	// int makeYear = 2022;
	// final int makeyear = 2022 ;
	// public final int makeyear = 2022 ;
	public static final int makeYear = 2022;

	// void start();
	// abstract void start();
	public abstract void start();

	default public void stop() {
		System.out.println("정지한다.");
	}

	private void show() {
		System.out.println("makeYear=" + makeYear);
	}

	public static void turn() {
		System.out.println("방향전환한다");
	}

	static class Price {
		int salePercent = 10;
	}
}

class car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Car가 출발한다.");

	}

}

public class InterfaceOne0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
