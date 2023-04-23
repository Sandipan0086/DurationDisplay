package org.rabobank.common.impl;

import org.rabobank.common.DisplayDuration;
import org.rabobank.common.exception.DurationTransformationException;

/**
 * this class returns the string representation of milliseconds to full format including hours,minutes and seconds
 * @Author Sandipan Chakraborty
 */
public class DurationBreakDownFull implements DisplayDuration {
    @Override
    public String getDurationBreakdown(long milliseconds) throws DurationTransformationException {
        if(milliseconds ==0)
            throw new DurationTransformationException("proper input required");
        long hour =((milliseconds/1000) / 60) / 60;
        long minutes = ((milliseconds/1000) / 60) % 60;
        long seconds = (milliseconds / 1000) % 60;
        StringBuffer formatTime = new StringBuffer();
        formatTime.append(hour).append("hours ").append(minutes).append("minutes ").append(seconds).append("seconds");
        return formatTime.toString();
    }
}
