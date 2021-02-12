package com.cgabe.AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressBookService implements AddressBookRepository {

    @Autowired
    private AddressBookRepository repo;

    @Override
    public AddressBook findById(long id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<AddressBook> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AddressBook> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AddressBook> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends AddressBook> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AddressBook> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<AddressBook> findAll() {
        return null;
    }

    @Override
    public Iterable<AddressBook> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(AddressBook entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends AddressBook> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
