package org.greenwin.VLtopics.proxies;

import org.greenwin.VLtopics.beans.AppUser;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@FeignClient(name = "ms-users", url = "http://164.132.197.173:8650/")
@RibbonClient(name = "ms-topics")
public interface UserProxy {

    @GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<AppUser> getAllUsers();


    @GetMapping(value = "/id/{id}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    AppUser getUserById(@PathVariable("id") int id);


    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    AppUser saveUser(@RequestBody AppUser appUser);

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    void deleteUser(@PathVariable ("id") int id);

    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    AppUser updateUser(@RequestBody AppUser user);
}
