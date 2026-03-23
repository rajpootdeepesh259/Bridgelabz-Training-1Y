package com.course;
    class Course {
        String courseName;
        int duration;

        Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        void displayInfo() {
            System.out.println("Course: " + courseName + ", Duration: " + duration + " days");
        }
    }

