package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.BtsInfo;

@Repository
public interface BtsInfoRepository extends JpaRepository<BtsInfo,Integer> {

	@Query(value="select * from bts_info where bts_number in (:bsnum)",nativeQuery=true)
	public BtsInfo findByBtsNumber(@Param("bsnum") int bsnum);
	
	@Query(value="select * from bts_info where bts_number like concat('%',:bsnum,'%')",nativeQuery=true)
	public List<BtsInfo> findAllByBtsNumber(@Param("bsnum") int bsnum);
	
	@Query(value="select * from bts_info where lower(address) like concat('%',:bsaddress,'%')",nativeQuery=true)
	public List<BtsInfo> findAllByBtsAddress(@Param("bsaddress") String bsaddress);
	
	@Query(value="select * from bts_info where bts_number like concat('%',:bsnum,'%') or lower(address) like concat('%',:bsaddress,'%') order by bts_number",nativeQuery=true)
	public List<BtsInfo> findAllByBtsNumderOrAddress(@Param("bsnum") int bsnum,@Param("bsaddress") String bsaddress);
}
