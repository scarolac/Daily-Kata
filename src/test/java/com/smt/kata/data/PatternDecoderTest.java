package com.smt.kata.data;

// Junit 5
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

/****************************************************************************
 * <b>Title</b>: PatternDecoderTest.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> CHANGE ME!!
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Feb 1, 2021
 * @updates:
 ****************************************************************************/
class PatternDecoderTest {
    
    // Members
    Map<String, List<String>> patterns;
    PatternDecoder pd = new PatternDecoder();

    /**
     * Tests that the decode pattern successfully tests the problem domain
     */
    @Test
    void testDecodePattern() {
        patterns = new LinkedHashMap<>();
        patterns.put("111", Arrays.asList("aaa", "ka", "ak"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern2() {
        patterns = new LinkedHashMap<>();
        patterns.put(null, new ArrayList<>());
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern3() {
        patterns = new LinkedHashMap<>();
        patterns.put("111d", new ArrayList<>());
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern4() {
        patterns = new LinkedHashMap<>();
        patterns.put("444", Arrays.asList("ddd"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern5() {
        patterns = new LinkedHashMap<>();
        patterns.put("414", Arrays.asList("dad", "dn"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern6() {
        patterns = new LinkedHashMap<>();
        patterns.put("4444", Arrays.asList("dddd"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern7() {
        patterns = new LinkedHashMap<>();
        patterns.put("1212", Arrays.asList("abab","aub","lab","abl","ll"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern8() {
        patterns = new LinkedHashMap<>();
        patterns.put("11111", Arrays.asList("aaaaa", "aaak", "aaka", "akaa", "kaaa", "akk", "kak", "kka"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern9() {
        patterns = new LinkedHashMap<>();
        patterns.put("1221", Arrays.asList("abba", "ava", "abu", "lba", "lu"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
    @Test
    void testDecodePattern10() {
        patterns = new LinkedHashMap<>();
        patterns.put("221", Arrays.asList("bba", "va", "bu"));
        //assertNotNull(pd.decodePattern(null));
        for (Map.Entry<String, List<String>> entry : patterns.entrySet()) {
            List<String> results = entry.getValue();
            List<String> matching = pd.decodePattern(entry.getKey());
            assertEquals(results.size(), matching.size());
            for (String pattern : matching) {
                assertTrue(results.contains(pattern));
            }
        }
    }
}