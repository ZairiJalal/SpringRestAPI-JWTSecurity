package org.sid.repo;

import org.sid.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
        AppUser findByUsername(String username);
}

