package com.happytown.infrastructure;

import com.happytown.core.domain.Habitant;
import com.happytown.core.use_cases.HabitantProvider;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabitantDatabaseProvider implements HabitantProvider {

    private HabitantJpaRepository habitantRepository;

    public HabitantDatabaseProvider(HabitantJpaRepository habitantRepository) {
        this.habitantRepository = habitantRepository;
    }

    @Override
    public List<Habitant> getAll() {
        return habitantRepository.findAll().stream().map(this::toHabitant).collect(Collectors.toList());
    }

    @Override
    public void save(Habitant habitant) {
        habitantRepository.save(toHabitantJpa(habitant));
    }

    @Override
    public List<Habitant> findByDateArriveeCommuneLessThanEqualAndCadeauOffertIsNullAndDateAttributionCadeauIsNullOrderByDateArriveeCommune(LocalDate dateArriveeCommuneLessThanOrEqualTo) {
        return habitantRepository.findByDateArriveeCommuneLessThanEqualAndCadeauOffertIsNullAndDateAttributionCadeauIsNullOrderByDateArriveeCommune(dateArriveeCommuneLessThanOrEqualTo)
                .stream()
                .map(this::toHabitant)
                .collect(Collectors.toList());
    }

    private Habitant toHabitant(HabitantJpa habitantJpa) {
        Habitant habitant = new Habitant();
        habitant.setId(habitantJpa.getId());
        habitant.setNom(habitantJpa.getNom());
        habitant.setPrenom(habitantJpa.getPrenom());
        habitant.setEmail(habitantJpa.getEmail());
        habitant.setDateNaissance(habitantJpa.getDateNaissance());
        habitant.setDateArriveeCommune(habitantJpa.getDateArriveeCommune());
        habitant.setAdressePostale(habitantJpa.getAdressePostale());
        habitant.setCadeauOffert(habitantJpa.getCadeauOffert());
        habitant.setDateAttributionCadeau(habitantJpa.getDateAttributionCadeau());
        return habitant;
    }

    private HabitantJpa toHabitantJpa(Habitant habitant) {
        HabitantJpa habitantJpa = new HabitantJpa();
        habitantJpa.setId(habitant.getId());
        habitantJpa.setNom(habitant.getNom());
        habitantJpa.setPrenom(habitant.getPrenom());
        habitantJpa.setEmail(habitant.getEmail());
        habitantJpa.setDateNaissance(habitant.getDateNaissance());
        habitantJpa.setDateArriveeCommune(habitant.getDateArriveeCommune());
        habitantJpa.setAdressePostale(habitant.getAdressePostale());
        habitantJpa.setCadeauOffert(habitant.getCadeauOffert());
        habitantJpa.setDateAttributionCadeau(habitant.getDateAttributionCadeau());
        return habitantJpa;
    }

}
