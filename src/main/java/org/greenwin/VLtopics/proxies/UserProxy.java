package org.greenwin.VLtopics.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(name = "zuul-server", url = "")
@RibbonClient(name = "ms-order")
public interface UserProxy {
}
