package org.recruitingapp.repository;

import org.recruitingapp.entity.VolunteerForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface formrepository extends JpaRepository<VolunteerForm, Integer> {

}
