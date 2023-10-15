package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
	
	@Query(value="select * from about_bts where bts_number in (:bsnum)",nativeQuery=true)
	public Route findByBtsNumber(@Param("bsnum") int bsnum);

}
