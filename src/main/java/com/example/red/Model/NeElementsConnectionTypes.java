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
@Table(name="ne_elements_connection_types")
public class NeElementsConnectionTypes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private String type_label;
	private int act;
}
