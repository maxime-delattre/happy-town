package com.happytown.service;

import com.happytown.core.domain.Habitant;
import com.happytown.core.use_cases.HabitantProvider;
import com.happytown.fixtures.HabitantFixture;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class HabitantServiceTest {

    @InjectMocks
    HabitantService habitantService;

    @Mock
    HabitantProvider habitantProvider;

    @Test
    void getAll_shouldReturnAllHabitants() {
        // Given
        List<Habitant> habitants = Lists.newArrayList(HabitantFixture.aHabitant());
        BDDMockito.doReturn(habitants).when(habitantProvider).getAll();

        // When
        List<Habitant> results = habitantService.getAll();

        // Then
        assertThat(results).containsExactlyElementsOf(habitants);
    }
}
