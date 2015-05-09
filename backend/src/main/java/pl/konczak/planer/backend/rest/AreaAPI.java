package pl.konczak.planer.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.konczak.planer.area.Area;
import pl.konczak.planer.area.IAreaRepository;

@RestController
@RequestMapping("/api/area")
public class AreaAPI {

    @Autowired
    private IAreaRepository areaRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Area> list() {
        return areaRepository.findAll();
    }

}
