package com.example.red.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.BtsCoord;

@Repository
public interface BtsCoordRepository extends JpaRepository<BtsCoord, Integer> {

	@Query(value="select * from bts_coord where bts_number in (:bsnum)",nativeQuery=true)
	public BtsCoord findByBtsNumber(@Param("bsnum") int bsnum);
}
