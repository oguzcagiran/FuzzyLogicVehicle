package com.softcomputing.fuzzysystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguz
 */
public class FuzzyRuleSet {
    
    private Map<String, String> ruleMap = new HashMap<>();
    
    public FuzzyRuleSet() {
        
        ruleMap.put("Very Slow-Very Close", "Keep Pace");
        ruleMap.put("Very Slow-Close", "Keep Pace");
        ruleMap.put("Very Slow-Normal", "Speed Up");
        ruleMap.put("Very Slow-Away", "Speed Up");
        
        ruleMap.put("Slow-Very Close", "Stop");
        ruleMap.put("Slow-Close", "Slow Down");
        ruleMap.put("Slow-Normal", "Speed Up");
        ruleMap.put("Slow-Away", "Speed Up");
        
        ruleMap.put("Medium-Very Close", "Stop");
        ruleMap.put("Medium-Close", "Slow Down");
        ruleMap.put("Medium-Normal", "Keep Pace");
        ruleMap.put("Medium-Away", "Speed Up");
        
        ruleMap.put("Fast-Very Close", "Stop");
        ruleMap.put("Fast-Close", "Stop");
        ruleMap.put("Fast-Normal", "Keep Pace");
        ruleMap.put("Fast-Away", "Speed Up");
        
        ruleMap.put("Very Fast-Very Close", "Stop");
        ruleMap.put("Very Fast-Close", "Stop");
        ruleMap.put("Very Fast-Normal", "Slow Down");
        ruleMap.put("Very Fast-Away", "Speed Up");
        
    }
    
    public String getOutput(String input) {
        return ruleMap.get(input);
    }
    
}