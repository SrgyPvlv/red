package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.AboutBtsKeysRel;

@Repository
public interface AboutBtsKeysRelRepository extends JpaRepository <AboutBtsKeysRel, Integer> {

	@Query(value="select key_id from about_bts_keys_rel where about_bts_id in (:btsid)",nativeQuery=true)
	public List<Integer> findKeyIdByAboutBtsId (@Param("btsid") int btsid);
}
