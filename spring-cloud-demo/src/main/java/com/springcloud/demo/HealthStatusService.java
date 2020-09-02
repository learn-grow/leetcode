package com.springcloud.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

/**
 * @author: lisy
 * @version: : HealthStatusService , v0.1 2020年09月01日 5:29 下午
 * @remark: the HealthStatusService is
 */
@Service
public class HealthStatusService implements HealthIndicator {
    private Boolean status = true;

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public Health health() {
        // TODO Auto-generated method stub
        if (status)
            return new Health.Builder().up().build();
        return new Health.Builder().down().build();
    }

    public String getStatus() {
        // TODO Auto-generated method stub
        return this.status.toString();
    }
}
