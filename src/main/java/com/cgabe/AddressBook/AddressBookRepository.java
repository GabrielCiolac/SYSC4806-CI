package com.cgabe.AddressBook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook,Long> {
    AddressBook findById(@Param("id") long id);
}
