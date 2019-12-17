package com.happytown.core.use_cases;

import com.happytown.core.domain.Habitant;

import java.time.LocalDate;
import java.util.List;

public interface HabitantProvider {
    List<Habitant> getAll();

    void save(Habitant habitant);

    List<Habitant> findByDateArriveeCommuneLessThanEqualAndCadeauOffertIsNullAndDateAttributionCadeauIsNullOrderByDateArriveeCommune(LocalDate dateArriveeCommuneLessThanOrEqualTo);
}
