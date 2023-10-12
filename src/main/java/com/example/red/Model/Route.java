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
@Table(name="about_bts")
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int bts_number;
	private String way_info;
	private String inner_info;
	private String reception_info;
	private String ams_info;
	private int ams_height;
	private int id_ams_type;
	private int id_key_type;
	private int id_side;
	private int id_site;
	private int old_id;
	private int flow_count;
	private int act;
	
}
