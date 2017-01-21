package com.skeenerok.remindme.server.repository;


import com.skeenerok.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long>{
}
