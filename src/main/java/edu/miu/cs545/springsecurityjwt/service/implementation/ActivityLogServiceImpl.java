package edu.miu.cs545.springsecurityjwt.service.implementation;

import edu.miu.cs545.springsecurityjwt.entity.ActivityLog;
import edu.miu.cs545.springsecurityjwt.repo.ActivityLogRepo;
import edu.miu.cs545.springsecurityjwt.service.ActivityLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityLogServiceImpl implements ActivityLogService {
    @Autowired
    private ActivityLogRepo activityLogRepo;

    @Override
    public ActivityLog saveLog(ActivityLog activityLog) {
        return activityLogRepo.save(activityLog);
    }

    @Override
    public List<ActivityLog> getActivityLog() {
        return activityLogRepo.findAll();
    }
}
