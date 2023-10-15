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
@Table(name="bts_info")
public class BtsInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int bts_number;
	private int bts_number_7;
	private String address;
	private int travel_time;
	private int priority;
	private int col_bts_next;
	private int battary;
	private String k6;
	private int arch;
	
}
