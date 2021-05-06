package com.example.ctreedb.mapper;

public interface Mapper<E, M> {
    E toEntity(M model);

    M toModel(E entity);
}
