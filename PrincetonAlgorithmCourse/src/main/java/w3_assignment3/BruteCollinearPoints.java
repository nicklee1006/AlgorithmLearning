package w3_assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BruteCollinearPoints {
    private final List<LineSegment> lineSegmentList;

    public BruteCollinearPoints(Point[] points) {
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

        // brute force
        for (int i = 0; i < points.length; i++) {
            Point p = points[i];

            double slopePq;

            for (int j = i + 1; j < points.length; j++) {
                Point q = points[j];

                slopePq = p.slopeTo(q);

                double slopeQr;

                for (int k = j + 1; k < points.length; k++) {
                    Point r = points[k];

                    slopeQr = q.slopeTo(r);

                    if (slopePq != slopeQr) {
                        continue;
                    }

                    double slopeRs;

                    for (int l = k + 1; l < points.length; l++) {
                        Point s = points[l];

                        slopeRs = r.slopeTo(s);

                        if (slopeQr == slopeRs) {
                            // sort p, q, r, s
                            List<Point> candidates = new ArrayList<>(Arrays.asList(p, q, r, s));
                            Collections.sort(candidates);

                            lineSegmentList.add(new LineSegment(candidates.get(0), candidates.get(3)));
                        }
                    }
                }
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
