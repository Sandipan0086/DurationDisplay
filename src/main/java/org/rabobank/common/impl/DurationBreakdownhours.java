package org.rabobank.common.impl;

import org.rabobank.common.DisplayDuration;
import org.rabobank.common.exception.DurationTransformationException;

/**
 * this class returns the string representation of milliseconds to hours,minutes and seconds
 * @Author Sandipan Chakraborty
 */
public class DurationBreakdownhours implements DisplayDuration {
    @Override
    public String getDurationBreakdown(long milliseconds) throws DurationTransformationException {
        if(milliseconds ==0)
            throw new DurationTransformationException("proper input required");
        long hour =((milliseconds/1000) / 60) / 60;
        long minutes = ((milliseconds/1000) / 60) % 60;
        long seconds = (milliseconds / 1000) % 60;
        StringBuffer formatTime = new StringBuffer();
        if(hour>0)
            formatTime.append(hour).append("hours ");
        if(minutes>0)
            formatTime.append(minutes).append("minutes ");
        if(seconds>0)
            formatTime.append(seconds).append(" seconds");
        return formatTime.toString();

    }
}
