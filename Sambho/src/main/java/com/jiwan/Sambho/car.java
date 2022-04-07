package com.jiwan.Sambho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //annotation garna kam lagxa jasto lagyo
public class car implements vehicle{
	@Autowired  //auto wired garyo vane xml ma configuration garnu pardaia
	private tyre tyre;
	
	
	public tyre getTyre() {
		return tyre;
	}


	public void setTyre(tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println("car "+tyre);
		//System.out.println("chalo chaley mithba");
	}

}
