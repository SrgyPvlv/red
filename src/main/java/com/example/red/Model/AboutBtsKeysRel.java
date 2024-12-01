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
@Table(name="about_bts_keys_rel")
public class AboutBtsKeysRel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int about_bts_id;
	private int key_id;
}
