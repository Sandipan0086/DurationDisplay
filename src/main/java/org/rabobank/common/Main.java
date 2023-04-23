package org.rabobank.common;

import org.rabobank.common.exception.DurationTransformationException;
import org.rabobank.common.factory.DurationFactory;

public class Main {
    public static void main(String[] args) throws DurationTransformationException {

        DurationFactory durationFactory = new DurationFactory();
        DisplayDuration duration =  durationFactory.getDuration("Task1");
        String duration_task1= duration.getDurationBreakdown(10345);
        System.out.println("  "+duration_task1);
        DisplayDuration duration_task2 =  durationFactory.getDuration("Task2");
        String duration_task2_output= duration_task2.getDurationBreakdown(300000);
        System.out.println("  "+duration_task2_output);
        DisplayDuration duration_task3 =  durationFactory.getDuration("Task3");
        String duration_task3_output= duration_task3.getDurationBreakdown(10859000);
        System.out.println("  "+duration_task3_output);
        DisplayDuration duration_task4 =  durationFactory.getDuration("Task4");
        String duration_task4_output= duration_task4.getDurationBreakdown(10878000);
        System.out.println("  "+duration_task4_output);
        DisplayDuration duration_task5 =  durationFactory.getDuration("Task5");
        String duration_task5_output= duration_task5.getDurationBreakdown(10878000);
        System.out.println("  "+duration_task5_output);
    }
}