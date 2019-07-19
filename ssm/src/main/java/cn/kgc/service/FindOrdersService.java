package cn.kgc.service;

import cn.kgc.domain.FindOrders;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FindOrdersService {
    public List<FindOrders> findorders();

}
