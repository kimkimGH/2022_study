package ch1;

public class eee{
	private int x; //(private)같은class안에서만 가능
			int z; //(default)같은class같은package 사용가능
	protected int q;//(protected)같은class같은package자손class사용가능
	public int w;//(public) 모두다 사용가능

	public void printMembers() {
		System.out.println(x);
		System.out.println(z);
		System.out.println(q);
		System.out.println(w);
	}
}

class e {
	public static void main(String[] args) {
		eee q=new eee();
		//System.out.println(q.x); //다른class라서 사용불가능
		System.out.println(q.z); //(default)같은class같은package 사용가능
		System.out.println(q.q); //같은class같은package자손class사용가능
		System.out.println(q.w); //모두다 사용가능
	}

}
