package edu.miu.cs545.springsecurityjwt.repo;

import edu.miu.cs545.springsecurityjwt.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityLogRepo extends JpaRepository<ActivityLog,Long> {
}
