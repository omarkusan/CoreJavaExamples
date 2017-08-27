package OOPPolymorphism;

public class Printer {
	private int tonerLevel;
	private int numberOfPagesPrinted;
	private boolean isDuplex;

	public Printer(int tonerLevel, boolean isDuplex) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = 0;
		}
		this.tonerLevel = tonerLevel;
		this.isDuplex = isDuplex;
		this.numberOfPagesPrinted = 0;
	}

	public int fillUpToner(int toner) {
		if (toner > 0 && toner <= 100) {
			if (this.tonerLevel + toner > 100) {
				return 100;
			}
			this.tonerLevel += toner;
			return this.tonerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int numberOfpage, boolean isDuplex) {
		if (isDuplex) {
			this.numberOfPagesPrinted += numberOfpage / 2;
			return numberOfpage / 2;
		} else {
			this.numberOfPagesPrinted += numberOfpage;
			return numberOfpage;
		}
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public boolean isDuplex() {
		return isDuplex;
	}

}
