package com.developia.developiahotel.dao.repository;

import com.developia.developiahotel.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
