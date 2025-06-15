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
@Table(name="ne_elements_ipaddr_src")
public class NeElementsIpAddress {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int bts_number;
	private String ip_addr;
	
	@ManyToOne
	@JoinColumn(name="ne_type")
	private NeElementsTypes ne_type;
	
	private int act;
}
