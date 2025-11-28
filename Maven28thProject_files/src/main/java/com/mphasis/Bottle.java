package com.mphasis;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bottle implements Serializable{
	
	private int bottleId;
	private String brand;
	private double cost;
	private String colour;
	

}
