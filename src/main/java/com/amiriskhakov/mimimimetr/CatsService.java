package com.amiriskhakov.mimimimetr;

import org.springframework.stereotype.Service;

@Service
public interface CatsService {

    void saveCat(Cat cat);

    Cat getByName(String name);
}
