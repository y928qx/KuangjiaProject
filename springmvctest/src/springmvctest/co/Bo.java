package springmvctest.co;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Bo {
	private String bookname;
	private String booksize;
	private String bookprize;
	private String bookpages;
	@Override
	public String toString() {
		return "Bo [bookname=" + bookname + ", booksize=" + booksize + ", bookprize=" + bookprize + ", bookpages="
				+ bookpages + "]";
	}
	
}
