package com.thiagoprioto.pedidos_api.repository;

import com.thiagoprioto.pedidos_api.models.Tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TablesRepository extends JpaRepository<Tables, Long> {
    List<Tables> findByStatus(String status);
}
