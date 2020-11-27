package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int id;
	private String firstName;
	private String lastName;
	private boolean gender;
	private String email;
	private String password;

	public Member(int id) {
		super();
		this.id = id;
	}
}
