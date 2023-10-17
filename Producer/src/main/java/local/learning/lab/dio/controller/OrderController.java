package local.learning.lab.dio.controller;

import local.learning.lab.dio.data.OrderData;
import local.learning.lab.dio.services.EventRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
    @Autowired
    private EventRegistryService service;

    @PostMapping("/api/save-order")
    @ResponseStatus(HttpStatus.OK)
    public String saveOrder(@RequestBody OrderData obj)
    {
        service.addEvent("save-order", obj);
        return ("Order saved successfully");
    }
}
