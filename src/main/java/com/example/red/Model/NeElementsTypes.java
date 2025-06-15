package com.example.red.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ne_elements_types")
public class NeElementsTypes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private String ne_type_name;
	
	@ManyToOne
	@JoinColumn(name="connection_type")
	private NeElementsConnectionTypes connection_type;
	
	private int act;
}
