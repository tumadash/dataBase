package org.springframework.tumaned.dataBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.tumaned.dataBase.entity.Accrual;

/**
 * Created by Даша on 08.11.2015.
 */
public interface AccrualRepository extends JpaRepository<Accrual, Long>{
}
