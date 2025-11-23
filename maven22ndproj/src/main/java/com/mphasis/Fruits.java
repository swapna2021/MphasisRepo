package com.mphasis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fruits {
	
	private String fruitName;
	private String fruitColor;
	private double fruitCost;
	
	
	public double calculateCostPerDozen() {
		
		return this.fruitCost*12;
		
		
	}

}
