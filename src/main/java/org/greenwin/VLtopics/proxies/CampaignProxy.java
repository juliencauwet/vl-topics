package org.greenwin.VLtopics.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "ms-campaign", url = "http://164.132.197.173:8642/")
@RibbonClient(name = "ms-topics")
public interface CampaignProxy {
}
