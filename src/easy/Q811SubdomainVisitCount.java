package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2018.7.12 Question 811. Subdomain Visit Count
 * https://leetcode.com/problems/subdomain-visit-count/description/
 *
 * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top
 * level, we have "com", at the next level, we have "leetcode.com", and at the lowest level,
 * "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also
 * visit the parent domains "leetcode.com" and "com" implicitly.
 *
 * Now, call a "count-paired domain" to be a count (representing the number of visits this
 * domain received), followed by a space, followed by the address. An example of a count-paired
 * domain might be "9001 discuss.leetcode.com".
 *
 * We are given a list cpdomains of count-paired domains. We would like a list of count-paired
 * domains, (in the same format as the input, and in any order), that explicitly counts the
 * number of visits to each subdomain.
 */
public class Q811SubdomainVisitCount {
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> count = new HashMap<>();
        for (String temp : cpdomains) {
            int number = Integer.parseInt(temp.split("\\s+")[0]);
            String sub = temp.split("\\s+")[1];

            for (int i = 0; i < sub.length(); i++) {
                if (sub.charAt(i) == '.') {
                    String tempSub = sub.substring(i + 1);
                    count.put(tempSub, count.getOrDefault(tempSub, 0) + number);

                }
            }

            count.put(sub, count.getOrDefault(sub, 0) + number);
        }

        for (String domain : count.keySet()) {
            result.add(count.get(domain) + " " + domain);
        }

        return result;
    }
}
