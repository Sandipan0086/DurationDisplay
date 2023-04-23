import org.junit.Test;
import org.rabobank.common.DisplayDuration;
import org.rabobank.common.exception.DurationTransformationException;
import org.rabobank.common.factory.DurationFactory;

import static org.junit.Assert.assertEquals;

public class TestDuration {

    @Test
    public void testDurationDisplay() throws DurationTransformationException {
        DurationFactory durationFactory = new DurationFactory();
        DisplayDuration duration =  durationFactory.getDuration("Task1");
        String duration_task1= duration.getDurationBreakdown(10345);
        assertEquals("10 seconds",duration_task1);
        DisplayDuration duration_task2 =  durationFactory.getDuration("Task2");
        String duration_task2_output= duration_task2.getDurationBreakdown(300000);
        assertEquals("5minutes 0seconds",duration_task2_output);
        DisplayDuration duration_task3 =  durationFactory.getDuration("Task3");
        String duration_task3_output= duration_task3.getDurationBreakdown(10859000);
        assertEquals("3hours 0minutes 59seconds",duration_task3_output);
        DisplayDuration duration_task4 =  durationFactory.getDuration("Task4");
        String duration_task4_output= duration_task4.getDurationBreakdown(10878000);
        assertEquals("3hours 1minutes 18seconds",duration_task4_output);
        DisplayDuration duration_task5 =  durationFactory.getDuration("Task5");
        String duration_task5_output= duration_task5.getDurationBreakdown(10878000);
        assertEquals("3h 1m 18s",duration_task5_output);
    }

    @Test(expected = DurationTransformationException.class)
    public void testExceptionScenario() throws DurationTransformationException {
        DurationFactory durationFactory = new DurationFactory();
        DisplayDuration duration_task5 =  durationFactory.getDuration("there is no task");
        duration_task5.getDurationBreakdown(43);
        DisplayDuration duration_task6 =  durationFactory.getDuration("");
        duration_task5.getDurationBreakdown(433);
        //milliseconds passed is 0*/
        DisplayDuration duration_task7 =  durationFactory.getDuration("Task2");
        duration_task7.getDurationBreakdown(0);

    }

}
