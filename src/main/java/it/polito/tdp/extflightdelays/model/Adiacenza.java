package it.polito.tdp.extflightdelays.model;

public class Adiacenza {
	
	private int id1;
	private int id2;
	private double distance;
	
	public Adiacenza(int id1, int id2, double distance) {
		this.id1 = id1;
		this.id2 = id2;
		this.distance = distance;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
