package org.syncro.sax;

/**
 * Smartphone entity for xml data to be stored
 * 
 * @author intern2
 *
 */
public class Smartphone implements Comparable<Smartphone> {

	/**
	 * Smartphone id
	 */
	private int id;

	/**
	 * Smartphone name
	 */
	private String name;

	/**
	 * Smartphone CPU speed measured in GHZ
	 */
	private float cpuFrequency;

	/**
	 * Smartphone screen width measure in pixels
	 */
	private int width;

	/**
	 * Smartphone screen height measured in pixels
	 */
	private int height;

	/**
	 * Smartphone ram measured in GigaBytes
	 */
	private int ram;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuFrequency(float cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", name=" + name + ", cpuFrequency=" + cpuFrequency + ", width=" + width
				+ ", height=" + height + ", ram=" + ram + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Smartphone o) {
		return name.compareTo(o.getName());
	}
	
	

}
