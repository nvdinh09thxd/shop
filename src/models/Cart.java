package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	private int id;
	private Products pro;
	private int counter;
	private Member member;
	private int orderId;

	public Cart(int id, Products pro, int counter, Member member) {
		super();
		this.id = id;
		this.pro = pro;
		this.counter = counter;
		this.member = member;
	}

}
