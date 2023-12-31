package com.example.red.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bts_coord")
public class BtsCoord {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int bts_number;
	private double coord_a;
	private double coord_b;
	
}
