package edu.iu.pupatil.historyservice.repository;

import edu.iu.pupatil.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrimesHistoryRepository extends CrudRepository<PrimesRecord, Integer> {
    List<PrimesRecord> findAllByCustomer(String customer);

}