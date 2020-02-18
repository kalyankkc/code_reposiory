package com.mindtree.departmentemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.departmentemployee.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
