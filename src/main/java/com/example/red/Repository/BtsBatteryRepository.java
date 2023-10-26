package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.BtsBattery;

@Repository
public interface BtsBatteryRepository extends JpaRepository<BtsBattery, Integer> {

	@Query(value="select * from bts_battary where bts_number in (:bsnum)",nativeQuery=true)
	public List<BtsBattery> findByBtsNumber(@Param("bsnum") int bsnum);
}
