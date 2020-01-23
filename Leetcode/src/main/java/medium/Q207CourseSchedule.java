package medium;

import java.util.*;

public class Q207CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // out degree means the number of prerequisites of this course
        // in degree means the this course is the prerequisites of other courses
        // gradually remove the course that has 0 out degree
        // in the end we should have all course with 0 out degree

        // map courseId -> number of prerequisites
        Map<Integer, Integer> outDegree = new HashMap<>();
        // map courseId -> list of course id that are depend on this course
        Map<Integer, ArrayList<Integer>> inDegree = new HashMap<>();
        // set to store all courseId
        Set<Integer> courses = new HashSet<>();

        for (int[] ints : prerequisites) {
            int course = ints[0];
            int prerequisite = ints[1];

            // update out degree of course
            outDegree.put(course, outDegree.getOrDefault(course, 0) + 1);

            // update in degree of prerequisite
            ArrayList<Integer> tempList = inDegree.getOrDefault(prerequisite, new ArrayList<>());
            tempList.add(course);
            inDegree.put(prerequisite, tempList);

            // add both course to set
            courses.add(course);
            courses.add(prerequisite);
        }

        // now get all courses without any prerequisite
        Queue<Integer> courseWithoutPrerequisite = new LinkedList<>();
        for (Integer course : courses) {
            if (outDegree.getOrDefault(course, 0) == 0) {
                courseWithoutPrerequisite.offer(course);
            }
        }

        while (!courseWithoutPrerequisite.isEmpty()) {
            int tempCourse = courseWithoutPrerequisite.poll();

            // now we want to remove tempCourse from all other course's prerequisite list
            // get the in degree (list) of tempCourse
            // loop through it, reduce the corresponding out degree by 1
            for (int temp : inDegree.getOrDefault(tempCourse, new ArrayList<>())) {
                int num = outDegree.get(temp);

                // if this course only has 1 prerequisite before, now it has 0
                if (num == 1) {
                    courseWithoutPrerequisite.offer(temp);
                }

                outDegree.put(temp, num - 1);
            }
        }

        // finally check if all course has 0 prerequisite
        for (Integer course : courses) {
            if (outDegree.getOrDefault(course, 0) != 0) {
                return false;
            }
        }

        return true;
    }
}
