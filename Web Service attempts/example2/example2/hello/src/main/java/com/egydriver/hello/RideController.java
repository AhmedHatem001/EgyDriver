package com.egydriver.hello;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class RideController {
    // private IRidesService service = new RidesService();

    // @PostMapping("/rides/add")
    // public Boolean add(@RequestBody Ride ride) {
    // return service.add(ride);
    // }

    // @GetMapping("/rides")
    // public List<Ride> getAll() {
    // return service.getAll();
    // }

    // @GetMapping("/rides/{id}")
    // public Ride get(@PathVariable int id) {
    // return service.get(id);
    // }

    // @DeleteMapping("/rides/{id}/delete")
    // public boolean delete(@PathVariable int id) {
    // return service.delete(id);
    // }
}