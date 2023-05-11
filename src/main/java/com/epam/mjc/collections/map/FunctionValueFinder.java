package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry<Integer,Integer> entrySet: functionMap.entrySet()) {
            if(requiredValue==entrySet.getValue()){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> result=new HashMap<>();
        for (Integer integer : sourceList) {
            int value = 5 * integer + 2;
            result.put(integer, value);
        }
        return result;
    }
}
