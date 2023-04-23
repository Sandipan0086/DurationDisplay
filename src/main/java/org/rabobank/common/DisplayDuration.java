package org.rabobank.common;


import org.rabobank.common.exception.DurationTransformationException;

public interface DisplayDuration {

    String getDurationBreakdown(long milliseconds) throws DurationTransformationException;

}
