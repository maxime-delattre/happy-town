package com.happytown.core.use_cases;

import com.happytown.core.domain.Habitant;

import java.util.List;

public interface HabitantProvider {
    List<Habitant> getAll();
}
