package com.happytown.core.use_cases;

import com.happytown.core.domain.Habitant;
import com.happytown.fixtures.HabitantFixture;
import com.happytown.infrastructure.HabitantRepository;
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
class GetAllHabitantsTest {

    @InjectMocks
    GetAllHabitants getAllHabitants;

    @Mock
    HabitantRepository habitantRepository;

    @Test
    void execute_shouldReturnHabitantsFromProvider() {
        // Given
        List<Habitant> habitants = Lists.newArrayList(HabitantFixture.aHabitant());
        BDDMockito.doReturn(habitants).when(habitantRepository).findAll();

        // When
        List<Habitant> results = getAllHabitants.execute();

        // Then
        assertThat(results).containsExactlyElementsOf(habitants);
    }
}
