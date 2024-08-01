package org.itstep.table;

import org.itstep.table.TableRest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TableRest, Long> {
}
