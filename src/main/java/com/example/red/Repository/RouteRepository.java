package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.red.Model.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{
	
	@Query(value="select * from about_bts where bts_number like concat('%',:bsnum,'%')",nativeQuery=true)
	public List<Route> findByBtsNumber(@Param("bsnum") int bsnum);

}
