package Easter;

public class Easter {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int g;
	private int h;
	private int j;
	private int k;
	private int m;
	private int r;
	private int n;
	private int p;
	
	public String calculateEaster(int aYear) {
		
		a = aYear % 19;
		b = aYear / 100;
		c = aYear % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13)/25;
		h = (19 * a + b - d - g + 15) %30;
		j = c/4;
		k = c % 4;
		m = (a + 11 * h)/319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = ( h - m + r + 90)/25;
		p = (h - m + r + n + 19) % 32;
		
		return "In " + aYear + ", Easter Sunday is: month = " + n + " and day = " + p;

		
		}


	}
	


