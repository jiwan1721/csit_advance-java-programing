package com.jiwan.Sambho;

import org.springframework.stereotype.Component;

@Component
public class bike implements vehicle {
	public void drive() {
		System.out.println("malai bike chaiyo");
	}

}
