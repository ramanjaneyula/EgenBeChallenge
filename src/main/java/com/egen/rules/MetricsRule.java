package com.egen.rules;

/**
 * Created by Ram 
 */
public interface MetricsRule {

    enum RuleType {OVER_WEIGHT, UNDER_WEIGHT}

    int baseWeight = 150;

    boolean when();
    void then();
}
