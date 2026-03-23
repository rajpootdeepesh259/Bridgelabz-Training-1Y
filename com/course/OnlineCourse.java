package com.course;
    class OnlineCourse extends Course {
        String platform;
        boolean isRecorded;

        OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
            super(courseName, duration);
            this.platform = platform;
            this.isRecorded = isRecorded;
        }

        void displayInfo() {
            System.out.println("Course: " + courseName + ", Duration: " + duration +
                    ", Platform: " + platform + ", Recorded: " + isRecorded);
        }
    }

