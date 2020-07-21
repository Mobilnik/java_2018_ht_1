package ru.milandr.courses.polishchuk;

public class Color {
	private int		rgb;

	Color(int r, int g, int b) {
		this.rgb = ((r & 0xff) << 16) | ((g & 0xff) << 8) | b & 0xff;
	}

	Color(int rgb) {
		this.rgb = rgb;
	}

	public int getRGB() {
		return this.rgb;
	}

	public int getR() {
		return (this.rgb & (0xff << 16)) >>> 16;
	}

	public int getG() {
		return (this.rgb & (0xff << 8)) >>> 8;
	}

	public int getB() {
		return this.rgb & 0xff;
	}

	private void setColorWithShift(int color, int shift) {
		if (shift <= 24)
			this.rgb = this.rgb & (0xffffffff ^ ((color & 0xff) << shift));
	}

	public void setR(int r) {
		this.setColorWithShift(r, 16);
	}
	
	public void setG(int g) {
		this.setColorWithShift(g, 8);
	}

	public void setB(int b) {
		this.setColorWithShift(b, 0);
	}

	public void setRBG(int rgb) {
		this.rgb = rgb;
	}
}
