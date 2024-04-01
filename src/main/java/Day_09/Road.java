/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day_09;

/**
 *
 * @author ourie
 */
public class Road {
	private String cityFrom;
	private String cityTo;
	private int distance;

	public Road(String cityFrom, String cityTo, int distance) {
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.distance = distance;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}

	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
