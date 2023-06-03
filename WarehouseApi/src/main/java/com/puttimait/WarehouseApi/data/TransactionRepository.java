package com.puttimait.WarehouseApi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Join;
import java.util.List;
import java.util.stream.Stream;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>, JpaRepository<Transaction, Long>, JpaSpecificationExecutor<Transaction> {

}
