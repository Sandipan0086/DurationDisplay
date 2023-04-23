package org.rabobank.common.impl;

import org.rabobank.common.DisplayDuration;
import org.rabobank.common.exception.DurationTransformationException;

/**
 * this class returns the short string representation of milliseconds to hours minutes and seconds
 * @Author Sandipan Chakraborty
 */
public class DurationBreakdownShortFormat implements DisplayDuration {

    @Override
    public String getDurationBreakdown(long milliseconds) throws DurationTransformationException {
        if(milliseconds ==0)
            throw new DurationTransformationException("proper input required");
        long hour =((milliseconds/1000) / 60) / 60;
        long minutes = ((milliseconds/1000) / 60) % 60;
        long seconds = (milliseconds / 1000) % 60;
        StringBuffer formatTime = new StringBuffer();
        formatTime.append(hour).append("h ").append(minutes).append("m ").append(seconds).append("s");
        return formatTime.toString();

    }
}
