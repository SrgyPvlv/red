package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.NeElementsIpAddress;

@Repository
public interface NeElementsIpAddressRepository extends JpaRepository<NeElementsIpAddress,Integer> {

	@Query(value="select * from ne_elements_ipaddr_src where bts_number like concat('%',:bsnum,'%') or ip_addr like concat('%',:ipaddress,'%') order by bts_number",nativeQuery=true)
	public List<NeElementsIpAddress> findAllByBtsNumberOrIpAddress(@Param("bsnum") int bsnum,@Param("ipaddress") String ipaddress);
	
	@Query(value="select * from ne_elements_ipaddr_src where bts_number in (:bsnum)",nativeQuery=true)
	public List<NeElementsIpAddress> findAllByBtsNumber(@Param("bsnum") int bsnum);
}
