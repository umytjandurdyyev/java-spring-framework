package com.cydeo.repository;

import com.cydeo.model.License;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("licences")
public interface LicenseRepository extends CrudRepository<License, Long> {
    List<License> findByOrganizationId(Long organizationId);
}
