package com.happytown.core.use_cases;

import com.happytown.core.domain.Habitant;

import java.util.List;

public class GetAllHabitants {

    private HabitantProvider habitantProvider;

    public GetAllHabitants(HabitantProvider habitantProvider) {
        this.habitantProvider = habitantProvider;
    }

    public List<Habitant> execute() {
        return habitantProvider.getAll();
    }
}
