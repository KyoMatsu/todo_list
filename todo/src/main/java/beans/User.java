package beans;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class User {
	private int id;
	private String name;
	private String password;
}
