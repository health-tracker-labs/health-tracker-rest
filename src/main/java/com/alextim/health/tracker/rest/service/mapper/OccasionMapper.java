package com.alextim.health.tracker.rest.service.mapper;

import com.alextim.health.tracker.rest.persistence.entity.Occasion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OccasionMapper {
    List<Occasion> toOccasions(Iterable<Occasion> occasions);
}
