package com.amiriskhakov.mimimimetr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CatsServiceImpl implements CatsService{

    @Autowired
    CatsRepository catsRepository;

    @Override
    public void saveCat(Cat cat) {
        catsRepository.save(cat);
    }

    @Override
    public Cat getByName(String name) {
        return catsRepository.findByName(name).orElseThrow(NoSuchElementException::new);
    }
}
