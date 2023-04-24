# DurationDisplay
This Library will be used to display proper string representations of any given input in milliseconds

1.This library uses factory design pattern to calculate the strings for a given input.

2.Throws custom exception in case of wrong input

3.Main class provided if in case any testing required for any given input.

Usage:
  Sample code is displayed in Main.java

 DurationFactory durationFactory = new DurationFactory();
 DisplayDuration duration =  durationFactory.getDuration("Task1");
 String duration_task1= duration.getDurationBreakdown(10345);
