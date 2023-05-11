package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> s : sourceMap.entrySet()) {
            if (!result.containsKey(s.getValue())) {
                result.put(s.getValue(), s.getKey());
            } else {
                if (result.get(s.getValue()) > s.getKey()) {
                    result.put(s.getValue(), s.getKey());
                }
            }
        }
        return result;
    }
}
