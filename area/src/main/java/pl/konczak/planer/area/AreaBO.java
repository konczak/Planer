package pl.konczak.planer.area;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class AreaBO
        implements IAreaBO {

    @Autowired
    private IAreaRepository areaRepository;

    public Area add(String name) {
        Area area = new Area(name);

        area = areaRepository.save(area);

        return area;
    }

}
