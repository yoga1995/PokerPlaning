package com.pokerplaning.repository;

import com.pokerplaning.entity.UserStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {


    void delete(Long userStoryId);
}
