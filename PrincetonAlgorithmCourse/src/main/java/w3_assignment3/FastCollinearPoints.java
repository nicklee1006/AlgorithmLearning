package w3_assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FastCollinearPoints {
    private final List<LineSegment> lineSegmentList;

    public FastCollinearPoints(Point[] points) {
        // if the argument to the constructor is null
        if (points == null) {
            throw new IllegalArgumentException();
        }

        // any point in the array is null
        if (Arrays.stream(points).anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException();
        }

        // if the argument to the constructor contains a repeated point
        Point[] pointsCopy = new Point[points.length];
        System.arraycopy(points, 0, pointsCopy, 0, points.length);

        Arrays.sort(pointsCopy);
        for (int i = 0; i < pointsCopy.length - 1; i++) {
            if (pointsCopy[i].compareTo(pointsCopy[i + 1]) == 0) {
                throw new IllegalArgumentException();
            }
        }

        if (points.length < 4) {
            lineSegmentList = new ArrayList<>();

            return;
        }

        lineSegmentList = new ArrayList<>();

        for (Point p : pointsCopy) {
            // sort array by slope order
            Arrays.sort(points, p.slopeOrder());

            int count = 1;
            List<Point> candidates = new ArrayList<>();
            candidates.add(p);

            for (int j = 1; j < points.length; j++) {
                while (j + 1 < points.length && p.slopeTo(points[j]) == p.slopeTo(points[j + 1])) {
                    count++;
                    candidates.add(points[j]);
                    j++;
                }

                // if count greater than 3, form a line
                if (count >= 3) {
                    candidates.add(points[j]);

                    Collections.sort(candidates);

                    boolean exist = false;
                    LineSegment lineSegment = new LineSegment(candidates.get(0), candidates.get(candidates.size() - 1));
                    for (LineSegment existLine : lineSegmentList) {
                        if (existLine.toString().equals(lineSegment.toString())) {
                            exist = true;
                            break;
                        }
                    }

                    if (!exist) {
                        lineSegmentList.add(lineSegment);
                    }
                }

                // reset values
                count = 1;
                candidates.clear();
                candidates.add(p);
            }
        }
    }

    public int numberOfSegments() {
        return lineSegmentList.size();
    }

    public LineSegment[] segments() {
        return lineSegmentList.toArray(new LineSegment[0]);
    }
}
