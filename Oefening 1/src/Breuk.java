// Pieter-Jan Steeman
public class Breuk {
	
	private int teller = 0;
	private int noemer = 0;
	
	Breuk(){
		teller = 1;
		noemer = 1;
	}
	
	Breuk(int tel, int noem){
		teller = tel;
		noemer = noem;
	}
	
	public int getTeller(){
		return teller;
	}
	public int getNoemer(){
		return noemer;
	}
	public float getValue(){
		return (float)teller/noemer;
	}
	
	public void setTeller(int t) {
		teller = t;
	}
	
	public void setNoemer(int n) {
		noemer = n;
	}
	
	public String toString() {
		return (Integer.toString(this.teller)+"/"+Integer.toString(this.noemer));
	}
	
	public Breuk plus(Breuk b) {
		Breuk uitkomst = new Breuk();
		uitkomst.teller = this.teller*b.noemer + this.noemer*b.teller;
		uitkomst.noemer = this.noemer*b.noemer;
		uitkomst = uitkomst.vereenvoudig();
		return uitkomst;
	}
	
	public Breuk maal(Breuk b) {
		Breuk uitkomst = new Breuk();
		uitkomst.teller = this.teller*b.teller;
		uitkomst.noemer = this.noemer*b.noemer;
		uitkomst = uitkomst.vereenvoudig();
		return uitkomst;
	}
	
	public Breuk maal(int getal) {
		Breuk uitkomst = new Breuk();
		uitkomst.teller = this.teller*getal;
		uitkomst.noemer = this.noemer;
		uitkomst = uitkomst.vereenvoudig();
		return uitkomst;
	}
	
	private Breuk vereenvoudig() {
		Breuk uitkomst = new Breuk();
		int ggdw = ggd(this.teller,this.noemer);
		uitkomst.teller = this.teller/ggdw;
		uitkomst.noemer = this.noemer/ggdw;
		return uitkomst;
	}
// werkt nog niet
	private int ggd(int x, int y) {
		while(x != y) {
			if(x > y) {
			x -= y;
			}
			else {
			y-= x;
			}
		}
		return x;
	}
}
