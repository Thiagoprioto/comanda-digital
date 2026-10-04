package com.thiagoprioto.pedidos_api.Service;

import com.thiagoprioto.pedidos_api.models.Tables;
import com.thiagoprioto.pedidos_api.repository.TablesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablesService {
    private final TablesRepository tableRepository;

    public TablesService(TablesRepository tableRepository){
        this.tableRepository = tableRepository;
    }

    public List<Tables> listAllMesas(){
        return tableRepository.findAll();
    }

    public List<Tables> findByStatus(){
        return tableRepository.findByStatus("LIVRE");
    }
}
