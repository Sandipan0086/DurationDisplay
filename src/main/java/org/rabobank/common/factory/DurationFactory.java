package org.rabobank.common.factory;

import org.rabobank.common.DisplayDuration;
import org.rabobank.common.exception.DurationTransformationException;
import org.rabobank.common.impl.DurationBreakDownFull;
import org.rabobank.common.impl.DurationBreakdownMinutes;
import org.rabobank.common.impl.DurationBreakdownShortFormat;
import org.rabobank.common.impl.DurationBreakdownhours;

/**
 * this is factory class which decides the output based on input of tasktype
 * @Author Sandipan Chakraborty
 */
public class DurationFactory {

    public DisplayDuration getDuration(String taskType) throws DurationTransformationException {

        if(taskType.isEmpty() ||taskType.trim().length()==0)
            throw new DurationTransformationException("Please insert proper task type");

        if (taskType.equals("Task1")) {
            return new DurationBreakdownhours();
        }
        if (taskType.equals("Task2")) {
            return new DurationBreakdownMinutes();
        }
        if (taskType.equals("Task3")) {
            return new DurationBreakDownFull();
        }
        if (taskType.equals("Task4")) {
            return new DurationBreakDownFull();
        }
        if (taskType.equals("Task5")) {
            return new DurationBreakdownShortFormat();
        }

    return new DisplayDuration() {
        @Override
        public String getDurationBreakdown(long milliseconds) throws DurationTransformationException {
            throw new DurationTransformationException("proper task type required");
        }
    };
    }
}
