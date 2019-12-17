package com.happytown.infrastructure;

import com.happytown.fixtures.HabitantFixture;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class HabitantDatabaseProviderTest {

    @InjectMocks
    private HabitantDatabaseProvider habitantDatabaseProvider;

    @Mock
    private HabitantRepository habitantRepository;

    @Test
    void getAll_shouldReturnHabitantsFromRepository() {
        // Given
        var habitantAttendu = HabitantFixture.aHabitant();
        var habitantsAttendus = Lists.newArrayList(habitantAttendu);
        BDDMockito.doReturn(habitantsAttendus).when(habitantRepository).findAll();

        // When
        var habitantsObtenus = habitantDatabaseProvider.getAll();

        // Then
        var habitantObtenu = habitantsObtenus.get(0);
        assertThat(habitantObtenu).isEqualToComparingFieldByField(habitantAttendu);
    }
}
