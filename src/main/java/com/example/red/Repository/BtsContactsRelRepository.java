package com.example.red.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.red.Model.BtsContactsRel;

@Repository
public interface BtsContactsRelRepository extends JpaRepository<BtsContactsRel, Integer> {

	@Query(value="select contact_id from bts_contacts_rel where bts_number in (:bsnum)",nativeQuery=true)
	public List<Integer> findContactsIdByBtsNumber(@Param("bsnum") int bsnum);
}
