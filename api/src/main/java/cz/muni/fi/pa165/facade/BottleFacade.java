package cz.muni.fi.pa165.facade;

import cz.muni.fi.pa165.dto.BottleDTO;
import cz.muni.fi.pa165.dto.BottleTypeDTO;

import java.util.Date;
import java.util.List;

/**
 * @author mhajas
 */
public interface BottleFacade {
    void createBottle(BottleDTO bottle);

    List<BottleDTO> findAll();

    List<BottleDTO> getBottlesFromDate(Date date);

    List<BottleDTO> getAllToxicBottles();

    List<BottleDTO> findByBottleType(BottleTypeDTO type);

    boolean isToxic(Long id);

    boolean isToxic(BottleDTO bottle);

    void setToxic(Long id);

    void setToxic(BottleDTO bottle);

    BottleDTO findById(Long id);

    BottleDTO findByStickerId(String id);
}
