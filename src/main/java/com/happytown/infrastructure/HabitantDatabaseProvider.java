package com.happytown.infrastructure;

import com.happytown.core.domain.Habitant;
import com.happytown.core.use_cases.HabitantProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HabitantDatabaseProvider implements HabitantProvider {


    private HabitantRepository habitantRepository;

    public HabitantDatabaseProvider(HabitantRepository habitantRepository) {
        this.habitantRepository = habitantRepository;
    }

    @Override
    public List<Habitant> getAll() {
        return habitantRepository.findAll();
    }

}
