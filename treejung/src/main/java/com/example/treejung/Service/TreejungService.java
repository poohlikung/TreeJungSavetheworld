package com.example.treejung.Service;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.treejung.repository.*;;
import com.example.treejung.Service.*;
import com.example.treejung.model.Treejung;;
@Service
public class TreejungService {
    private final TreejungRepository treejungRepository;

    @Autowired
    public TreejungService(TreejungRepository treejungRepository){
        this.treejungRepository = treejungRepository;
    }
    
    public List<Treejung> getAll(){
        return treejungRepository.findAll();
    }

    public Treejung getById(Long id){
        Optional<Treejung>
    }
}
