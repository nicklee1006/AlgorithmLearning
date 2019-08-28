package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q71SimplifyPathTest {

    @Test
    public void simplifyPath() {
        assertEquals("/home", Q71SimplifyPath.simplifyPath("/home/"));
        assertEquals("/", Q71SimplifyPath.simplifyPath("/../"));
        assertEquals("/home/foo", Q71SimplifyPath.simplifyPath("/home//foo/"));
        assertEquals("/c", Q71SimplifyPath.simplifyPath("/a/./b/../../c/"));
        assertEquals("/c", Q71SimplifyPath.simplifyPath("/a/../../b/../c//.//"));
        assertEquals("/a/b/c", Q71SimplifyPath.simplifyPath("/a//b////c/d//././/.."));
    }
}