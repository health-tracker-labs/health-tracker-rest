package com.alextim.health.rest.service.mapper;

import com.alextim.health.rest.entry.Occasion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OccasionMapper {
    List<Occasion> toOccasions(Iterable<Occasion> occasions);
}
