package com.happytown.core.use_cases;

import com.happytown.core.domain.Habitant;
import com.happytown.infrastructure.HabitantRepository;

import java.util.List;

public class GetAllHabitants {

    private HabitantRepository habitantRepository;

    public GetAllHabitants(HabitantRepository habitantRepository) {
        this.habitantRepository = habitantRepository;
    }

    public List<Habitant> execute() {
        return habitantRepository.findAll();
    }
}
