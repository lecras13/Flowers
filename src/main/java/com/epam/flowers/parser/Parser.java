package com.epam.flowers.parser;

import com.epam.flowers.entity.Flower;

import java.util.List;

public interface Parser {
    List<Flower> parse(String file);
}
