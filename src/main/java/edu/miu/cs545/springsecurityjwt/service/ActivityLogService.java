package edu.miu.cs545.springsecurityjwt.service;

import edu.miu.cs545.springsecurityjwt.entity.ActivityLog;


import java.util.List;

public interface ActivityLogService {
    ActivityLog saveLog(ActivityLog activityLog);
    List<ActivityLog> getActivityLog();
}
